package Day22;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        driver.manage().window().maximize();

        driver.findElement(By.linkText("Register")).click();

        Thread.sleep(3000);

        driver.findElement(By.id("customer.firstName")).sendKeys("Hemanth");
        driver.findElement(By.id("customer.lastName")).sendKeys("Kumar");
        driver.findElement(By.id("customer.address.street")).sendKeys("ramga Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("guntur");
        driver.findElement(By.id("customer.address.state")).sendKeys("Andhra pradesh");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("522005");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("9391941256");
        driver.findElement(By.id("customer.ssn")).sendKeys("2345678");
        driver.findElement(By.id("customer.username")).sendKeys("hemanth_22");
        driver.findElement(By.id("customer.password")).sendKeys("5555");
        driver.findElement(By.id("repeatedPassword")).sendKeys("5520");

        driver.findElement(By.xpath("//input[@value='Register']")).click();

        Thread.sleep(5000);

        System.out.println("Registration Successful");

        driver.findElement(By.xpath("//a[text()='home']")).click();

        Thread.sleep(3000);

        driver.findElement(By.name("username")).sendKeys("hemanth_22");

        Thread.sleep(2000);

        driver.findElement(By.name("password")).sendKeys("5520");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Log In']")).click();

        System.out.println("Login Successful");

        Thread.sleep(5000);

        driver.quit();
    }
}