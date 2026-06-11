package org.hemanth.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class AmzLogin {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.amazon.in");

        wait.until(ExpectedConditions
                .elementToBeClickable(By.id("nav-link-accountList")))
                .click();

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.id("ap_email_login")))
                .sendKeys("9391941256");

        driver.findElement(By.id("continue")).click();
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.id("ap_password")))
                .sendKeys("User@123");

        driver.findElement(By.id("signInSubmit")).click();

        System.out.println(driver.getTitle());
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.id("twotabsearchtextbox")))
                .sendKeys("toy");

        driver.findElement(By.id("nav-search-submit-button"))
                .click();
        WebElement firstResult = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("(//div[@data-component-type='s-search-result'])[1]")
                )
        );
        WebElement productLink = firstResult.findElement(By.tagName("a"));

        productLink.click();

        Set<String> windows = driver.getWindowHandles();

        for (String window : windows) {
            driver.switchTo().window(window);
        }
        WebElement addToCart =
                wait.until(ExpectedConditions.elementToBeClickable(
                        By.id("add-to-cart-button")));

        addToCart.click();
        WebElement proceedToBuy = wait.until(
              ExpectedConditions.elementToBeClickable(
                  By.name("proceedToRetailCheckout")
              )
          );

          proceedToBuy.click();
        System.out.println(driver.getTitle());

        //driver.quit();
    }
}

