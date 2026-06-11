package com.parabank.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.parabank.base.BaseClass;
import com.parabank.pages.LoginPage;
import com.parabank.pages.RegisterPage;
import com.parabank.utils.ExtentManager;
import com.parabank.utils.Utility;

public class RegisterTest extends BaseClass {

    @Test
    public void registerAndLoginTest() {

        ExtentReports extent =
                ExtentManager.getReportInstance();

        ExtentTest test =
                extent.createTest("Register And Login Test");

        setup();

        driver.get(
                "https://parabank.parasoft.com/parabank/register.htm");

        test.info("Application Opened");

        String username =
                Utility.getUniqueUsername();

        String password = "Test123";

        RegisterPage registerPage =
                new RegisterPage(driver);

        registerPage.registerUser(username, password);

        test.pass("Registration Completed");

        String pageText =
                driver.getPageSource();

        if(pageText.contains("Welcome")) {

            test.pass("Registration Verified");
        }

        driver.findElement(
                By.linkText("Log Out"))
                .click();

        test.pass("Logout Successful");

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.login(username, password);

        test.pass("Login Successful");

        extent.flush();

        tearDown();
    }
}