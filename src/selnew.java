import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class selnew {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        WebElement searchbox = driver.findElement(By.name("field-keywords"));
        searchbox.sendKeys("Avengers");
        searchbox.submit();

    }
}
