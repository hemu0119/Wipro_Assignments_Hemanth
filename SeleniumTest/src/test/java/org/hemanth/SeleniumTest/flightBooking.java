package org.hemanth.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flightBooking {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://phptravels.net/");

        Thread.sleep(5000);

        driver.findElement(By.xpath("(//a[contains(text(),'Flights')])[1]")).click();

        Thread.sleep(5000);

        WebElement from = driver.findElement(
                By.xpath("//input[@placeholder='Flying From']"));

        from.click();

        Thread.sleep(2000);

        from.sendKeys("Delhi");

        Thread.sleep(3000);

        from.sendKeys(Keys.ARROW_DOWN);
        from.sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        WebElement to = driver.findElement(
                By.xpath("//input[@placeholder='To Destination']"));

        to.click();

        Thread.sleep(2000);

        to.sendKeys("Mumbai");

        Thread.sleep(3000);

        to.sendKeys(Keys.ARROW_DOWN);
        to.sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        driver.findElement(By.id("flights-search")).click();

        System.out.println("Flight Search Successful");

        Thread.sleep(8000);

        driver.findElement(
                By.xpath("(//button[contains(text(),'Book Now')])[1]"))
                .click();

        Thread.sleep(5000);

        driver.findElement(By.name("firstname"))
                .sendKeys("Hemanth");

        driver.findElement(By.name("lastname"))
                .sendKeys("Kumar");

        driver.findElement(By.name("email"))
                .sendKeys("hemanth@gmail.com");

        driver.findElement(By.name("phone"))
                .sendKeys("9391941256");

        Thread.sleep(3000);

        driver.findElement(By.id("booking")).click();

        Thread.sleep(5000);

        System.out.println("Automation Completed");

        driver.quit();
    }
}