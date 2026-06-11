package org.hemanth.SeleniumTest;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class paraBankTestng {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://parabank.parasoft.com/parabank/register.htm");
    }

    @Test
    public void registerAndTransferFunds() throws InterruptedException {

        // First Name
        driver.findElement(By.id("customer.firstName"))
              .sendKeys("Hemanth");

        Thread.sleep(1000);

        // Last Name
        driver.findElement(By.id("customer.lastName"))
              .sendKeys("Mupparaju");

        Thread.sleep(1000);

        // Address
        driver.findElement(By.id("customer.address.street"))
              .sendKeys("Pothuru");

        // City
        driver.findElement(By.id("customer.address.city"))
              .sendKeys("Guntur");

        // State
        driver.findElement(By.id("customer.address.state"))
              .sendKeys("Andhra pradesh");

        // Zipcode
        driver.findElement(By.id("customer.address.zipCode"))
              .sendKeys("522005");

        // Phone Number
        driver.findElement(By.id("customer.phoneNumber"))
              .sendKeys("9391941256");

        // SSN
        driver.findElement(By.id("customer.ssn"))
              .sendKeys("1234");

        // Unique Username
        String username = "Hemanth" + System.currentTimeMillis();

        driver.findElement(By.id("customer.username"))
              .sendKeys(username);

        // Password
        driver.findElement(By.id("customer.password"))
              .sendKeys("User@123");

        // Confirm Password
        driver.findElement(By.id("repeatedPassword"))
              .sendKeys("User@123");

        // Click Register
        driver.findElement(By.cssSelector("input[value='Register']"))
              .click();

        // Open Transfer Funds Page
        driver.findElement(By.linkText("Transfer Funds"))
              .click();

        Thread.sleep(2000);

        // Enter Amount
        driver.findElement(By.id("amount"))
              .sendKeys("1");

        // Click Transfer Button
        driver.findElement(By.cssSelector("input[value='Transfer']"))
              .click();

        // Wait for Success Message
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement message = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.className("title")
                )
        );

        // Print Actual Message
        System.out.println("Actual Message: " + message.getText());

        // Validation
        Assert.assertEquals(message.getText(), "Transfer Complete!");

        System.out.println("Validation Passed");

        Thread.sleep(3000);

        // Logout
        driver.findElement(By.linkText("Log Out"))
              .click();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {

        Thread.sleep(10000);

        driver.quit();
    }
}