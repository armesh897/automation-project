import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class iframework {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://thulotechnology.github.io/SampleTestWebsite/");
        driver.switchTo().frame("ourframe");

        WebElement intro= driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/ul/li[1]/a"));
        intro.click();

        WebElement dart= driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/ul/li[1]/ul/li[2]/a"));
        dart.click();
    }
    }

