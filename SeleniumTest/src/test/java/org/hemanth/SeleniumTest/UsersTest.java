package org.hemanth.SeleniumTest;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class UsersTest {

    @Test
    public void getUsersTest() {

        // Report Setup
        ExtentSparkReporter spark =
                new ExtentSparkReporter("reports/GetUsersReport.html");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(spark);
        ExtentTest test = extent.createTest("Get Users API Test");
        given()

        .when()
            .get("https://dummyjson.com/users/1")

        .then()
            .statusCode(200)
            .log().all();
                test.pass("GET Users API Passed");
        extent.flush();
    }
}