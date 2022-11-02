import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class selassignment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Login-Portal/index.html");

        WebElement user=driver.findElement(By.xpath("//*[@id=\"text\"]"));

        user.sendKeys("webdriver");
        WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));

        password.sendKeys("webdriver123");
        WebElement Login= driver.findElement(By.id("login-button"));

        Login.click();




    }
}
