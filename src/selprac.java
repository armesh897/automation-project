import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class selprac {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Edgedriver\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.bing.com/search?q=amazon+music&cvid=a77ccfa8d45b4c17bcf4058b8454caa1&aqs=edge.5.46j69i57j0l7.4226j0j1&pglt=297&FORM=ANNTA1&PC=LCTS");
        WebElement music= driver.findElement(By.xpath("//*[@id=\"b_results\"]/li[3]/div[1]/h2/a"));
        music.click();
        WebElement song= driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
        song.sendKeys("Sidhumoosewala");
  //      WebElement submit= driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
   //     submit.click();

    }
}
