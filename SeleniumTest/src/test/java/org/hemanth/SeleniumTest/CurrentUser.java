package org.hemanth.SeleniumTest;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class CurrentUser {

    @Test
    public void getCurrentUser() {

        // Extent Report Setup
        ExtentSparkReporter spark =
                new ExtentSparkReporter("reports/GetCurrentUserReport.html");

        ExtentReports extent = new ExtentReports();

        extent.attachReporter(spark);

        ExtentTest test =
                extent.createTest("Get Current User API Test");
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwidXNlcm5hbWUiOiJlbWlseXMiLCJlbWFpbCI6ImVtaWx5LmpvaG5zb25AeC5kdW1teWpzb24uY29tIiwiZmlyc3ROYW1lIjoiRW1pbHkiLCJsYXN0TmFtZSI6IkpvaG5zb24iLCJnZW5kZXIiOiJmZW1hbGUiLCJpbWFnZSI6Imh0dHBzOi8vZHVtbXlqc29uLmNvbS9pY29uL2VtaWx5cy8xMjgiLCJpYXQiOjE3Nzk3MDY5ODEsImV4cCI6MTc3OTcwODc4MX0.OJUq91tZMPTzalW-50OfHavt3db5pOAFao-xIn9xrPM";
        given()
            .header("Authorization", "Bearer " + token)

        .when()
            .get("https://dummyjson.com/user/me")

        .then()
            .statusCode(200)
            .log().all();


        test.pass("User Details Retrieved Successfully");
        extent.flush();
    }
}