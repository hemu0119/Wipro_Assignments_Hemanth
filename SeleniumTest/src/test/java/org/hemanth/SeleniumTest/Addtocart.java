package org.hemanth.SeleniumTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Addtocart {


    public static void main(String[] args)
            throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        WebDriverWait wait =
                new WebDriverWait(driver,
                Duration.ofSeconds(20));
        driver.get("https://www.amazon.in");
        System.out.println("Amazon opened");
        WebElement searchBox =
                wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("twotabsearchtextbox")
                )
        );

        searchBox.sendKeys("toy");

        driver.findElement(
                By.id("nav-search-submit-button"))
                .click();

        System.out.println("Product searched");
        WebElement firstResult =
                wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath(
                        "(//div[@data-component-type='s-search-result'])[1]")
                )
        );

        WebElement productLink =
                firstResult.findElement(By.tagName("a"));

        productLink.click();
        Set<String> windows =
                driver.getWindowHandles();

        for (String window : windows) {

            driver.switchTo().window(window);
        }
        System.out.println("Product page opened");
        WebElement addToCart =
                wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("add-to-cart-button")
                )
        );
        System.out.println("Add to Cart button clickable");
        addToCart.click();

        System.out.println("Product added to cart");
        if (driver.getPageSource()
                .contains("Added to Cart")) {

            System.out.println("Add to Cart Successful");

        } else {
            System.out.println("Add to Cart Failed");
        }
        Thread.sleep(3000);

        driver.quit();

        System.out.println("Automation completed");
    }
}