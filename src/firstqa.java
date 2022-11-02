import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class firstqa {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Edgedriver\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
        WebElement food = driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
         food.sendKeys("a");
         Thread.sleep(5000);
         WebElement name= driver.findElement(By.cssSelector("#myInputautocomplete-list > div:nth-child(1)"));
         name.click();
         WebElement button=driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
       button.click();

    }
}
