package org.hemanth.SeleniumTest;



import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SearchUser {

    @Test
    public void searchUser() {

        ExtentSparkReporter spark =
                new ExtentSparkReporter("reports/SearchUserReport.html");

        ExtentReports extent = new ExtentReports();

        extent.attachReporter(spark);

        ExtentTest test =
                extent.createTest("Search User API Test");

        given()

        .when()
            .get("https://dummyjson.com/users/search?q=John")

        .then()
            .statusCode(200)
            .log().all();

        test.pass("Search User API Executed Successfully");

        extent.flush();
    }
}