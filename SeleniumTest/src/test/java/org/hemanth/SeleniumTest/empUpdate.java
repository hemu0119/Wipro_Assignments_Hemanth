package org.hemanth.SeleniumTest;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
public class empUpdate {

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
        WebElement pim = wait.until(
        	    ExpectedConditions.elementToBeClickable(
        	        By.xpath("//span[text()='PIM']"))
        	);

        	pim.click();

      
        	WebElement searchBox = wait.until(
        		    ExpectedConditions.elementToBeClickable(
        		        By.xpath("//input[@placeholder='Type for hints...']"))
        		);

        		searchBox.sendKeys("Hemanth");
        		WebElement search= wait.until(
                 	    ExpectedConditions.elementToBeClickable(
                 	        By.xpath("//button[contains(.,'Search')]"))
                 	);
            	 search.click();
            	 WebElement editBtn = wait.until(
            			    ExpectedConditions.elementToBeClickable(
            			        By.xpath("//div[contains(.,'Hemanth')]//button[i[contains(@class,'bi-pencil-fill')]]"))
            			);

            			editBtn.click();
            			WebElement firstName = wait.until(
            				    ExpectedConditions.elementToBeClickable(
            				        By.name("firstName"))
            				);

            				firstName.click();

            				Thread.sleep(1000);
            				firstName.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            				Thread.sleep(500);
            				firstName.sendKeys(Keys.DELETE);
            				Thread.sleep(500);
            				firstName.sendKeys("Hemu");
			wait.until(ExpectedConditions.elementToBeClickable(
			        By.xpath("(//button[@type='submit'])[1]")))
			        .click();
	}

}