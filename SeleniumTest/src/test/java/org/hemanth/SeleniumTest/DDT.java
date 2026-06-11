package org.hemanth.SeleniumTest;

import java.io.FileInputStream;
import java.io.IOException;
 
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class DDT {
 
    public static void main(String[] args)
            throws EncryptedDocumentException, IOException, InterruptedException {
 
        FileInputStream fis = new FileInputStream("C:/Users/21000/OneDrive/Desktop/Book1.xlsx");
 
        Workbook wb = WorkbookFactory.create(fis);
 
        Sheet sh = wb.getSheet("Sheet1");
 
        int rows = sh.getLastRowNum();
 
        DataFormatter formatter = new DataFormatter();
 
        for (int i = 1; i <= rows; i++) {
 
            Row row = sh.getRow(i);
            if (row != null) {
 
                String Username =
                        formatter.formatCellValue(row.getCell(0));
 
                String Password =
                        formatter.formatCellValue(row.getCell(1));
 
                WebDriver driver = new ChromeDriver();
 
                driver.get("https://www.saucedemo.com");
 
                driver.findElement(By.id("user-name"))
                        .sendKeys(Username);
                Thread.sleep(2000);
                driver.findElement(By.id("password"))
                        .sendKeys(Password);
                Thread.sleep(2000);
                driver.findElement(By.id("login-button"))
                        .click();
                Thread.sleep(2000);
                driver.quit();
            }
        }
 
        wb.close();
        fis.close();
    }
}