package org.hemanth.SeleniumTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class paraBankLogin {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://parabank.parasoft.com/parabank/register.htm");
driver.findElement(By.id("customer.firstName")).sendKeys("Hemanth");

driver.findElement(By.id("customer.lastName")).sendKeys("Mupparaju");

driver.findElement(By.id("customer.address.street")).sendKeys("Pothuru");

driver.findElement(By.id("customer.address.city")).sendKeys("Guntur");
driver.findElement(By.id("customer.address.state")).sendKeys("Andhra Pradesh");
driver.findElement(By.id("customer.address.zipCode")).sendKeys("522005");

driver.findElement(By.id("customer.phoneNumber")).sendKeys("9391941256");

driver.findElement(By.id("customer.ssn")).sendKeys("1234");
driver.findElement(By.id("customer.username")).sendKeys("hemanth1672535");
Thread.sleep(2000);
driver.findElement(By.id("customer.password")).sendKeys("User@123");
Thread.sleep(2000);
driver.findElement(By.id("repeatedPassword")).sendKeys("User@123");
driver.findElement(By.cssSelector("input[value='Register']")).click();
driver.findElement(By.linkText("Transfer Funds")).click();
Thread.sleep(3000);
driver.findElement(By.id("amount")).sendKeys("10");
Thread.sleep(3000);
driver.findElement(By.cssSelector("input[value='Transfer']")).click();
Thread.sleep(3000);
String heading = driver.findElement(By.className("title")).getText();

if(heading.equals("Transfer Complete!")) {
    System.out.println("Validation Passed");
} else {
    System.out.println("Validation Failed");
}
Thread.sleep(3000);
driver.findElement(By.linkText("Log Out")).click();

	}

}