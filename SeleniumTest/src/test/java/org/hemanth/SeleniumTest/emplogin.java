package org.hemanth.SeleniumTest;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class emplogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //login
        WebElement username = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.name("username")));
        username.sendKeys("Admin");
        WebElement password = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.name("password")));
        password.sendKeys("admin123");
        driver.findElement(By.className("orangehrm-login-button")).click();
        //Add
        WebElement pim = wait.until(
        	    ExpectedConditions.elementToBeClickable(
        	        By.xpath("//span[text()='PIM']"))
        	);

        	pim.click();
        	 WebElement add= wait.until(
             	    ExpectedConditions.elementToBeClickable(
             	        By.xpath("//button[contains(.,'Add')]"))
             	);
        	 add.click();
        	WebElement fn= wait.until(
             	    ExpectedConditions.elementToBeClickable(
             	    		By.name("firstName")));
         	fn.sendKeys("Hemanth");
         	Thread.sleep(3000);
        driver.findElement(By.name("lastName")).sendKeys("Mupparaju");
        
        driver.findElement(
		    By.xpath("//button[@type='submit']")
		).click();
	}

	}
	

