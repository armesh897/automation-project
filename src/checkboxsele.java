import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class checkboxsele {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/");
        WebElement title= driver.findElement(By.xpath("//*[@id=\"dropdown-checkboxes-radiobuttons\"]/div/div[1]/h1"));
        title.click();

        WebElement check= driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[3]/input"));

        check.click();
        WebElement check1= driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[4]/input"));
        check1.click();


    }
}
