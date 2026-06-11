package org.hemanth.SeleniumTest;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_db {

    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/selenium_ddt",
                "root",
                "hemanth");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(
                "SELECT * FROM login_data");
        while (rs.next()) {
            String username = rs.getString("username");
            String password = rs.getString("password");
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.saucedemo.com");

            driver.findElement(By.id("user-name"))
                    .sendKeys(username);

            driver.findElement(By.id("password"))
                    .sendKeys(password);

            driver.findElement(By.id("login-button"))
                    .click();

            Thread.sleep(3000);

            driver.quit();
        }
        con.close();
    }
}