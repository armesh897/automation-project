import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class loginsele {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Edgedriver\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("http://www.webdriveruniversity.com/Login-Portal/index.html");
        WebElement user=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        user.sendKeys(" ");


    }
}
