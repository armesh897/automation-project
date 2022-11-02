import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class selamazon {

        public static void main(String[] args) {
            System.setProperty("webdriver.edge.driver", "C:\\Edgedriver\\edgedriver_win64\\msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
            driver.get("https://www.amazon.com/?tag=hymsabk-20&ref=pd_sl_7j18redljw_e&adgrpid=1338106215055591&hvadid=83631916315028&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=92429&hvtargid=kwd-83631981824880:loc-190&hydadcr=28883_14580406");
            WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
            search.sendKeys("sidhumoosewala");
            WebElement button= driver.findElement(By.id("nav-search-submit-button"));
            button.click();



}}
