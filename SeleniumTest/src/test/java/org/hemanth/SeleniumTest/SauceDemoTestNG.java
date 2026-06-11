package org.hemanth.SeleniumTest;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;


import org.testng.annotations.*;

public class SauceDemoTestNG {

    WebDriver driver;

    @Parameters("browser")

    @BeforeMethod

    public void setup(String browser) {

        if(browser.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();
        }

        
        else if(browser.equalsIgnoreCase("edge")) {

            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com/");
    }

    @Test

    public void loginTest() {

        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
              .click();

        System.out.println(driver.getTitle());
    }

    @AfterMethod

    public void tearDown() {

        driver.quit();
    }
}