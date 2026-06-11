package org.hemanth.SeleniumTest;


import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class FilterUser{

    @Test
    public void filterUser() {

        ExtentSparkReporter spark =
                new ExtentSparkReporter("reports/filterUserReport.html");

        ExtentReports extent = new ExtentReports();

        extent.attachReporter(spark);

        ExtentTest test =
                extent.createTest("Filter User API Test");

        given()

        .when()
            .get("https://dummyjson.com/users/filter?key=hair.color&value=Brown")

        .then()
            .statusCode(200)
            .log().all();

        System.out.println("Filter User API Passed");

        test.pass("Filter User API Executed Successfully");

        extent.flush();
    }
}