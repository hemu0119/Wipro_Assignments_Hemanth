package org.hemanth.SeleniumTest;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LoginTest {

    @Test
    public void userLoginTest() {
        ExtentSparkReporter spark =
                new ExtentSparkReporter("reports/LoginReport.html");

        ExtentReports extent = new ExtentReports();

        extent.attachReporter(spark);

        ExtentTest test =
                extent.createTest("Login API Test");
        String requestBody = "{\n" +
                "  \"username\": \"emilys\",\n" +
                "  \"password\": \"emilyspass\",\n" +
                "  \"expiresInMins\": 30\n" +
                "}";
        given()
            .header("Content-Type", "application/json")
            .body(requestBody)

        .when()
            .post("https://dummyjson.com/user/login")

        .then()
            .statusCode(200)
            .log().all();
        test.pass("Login API Executed Successfully");
        extent.flush();
    }
}