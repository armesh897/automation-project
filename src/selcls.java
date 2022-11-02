import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class selcls {
    public static void main(String[] args) {
            System.setProperty("webdriver.edge.driver", "C:\\Edgedriver\\edgedriver_win64\\msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
            driver.get("http://www.webdriveruniversity.com/Accordion/index.html");
        WebElement result= driver.findElement(By.xpath("//*[@id=\"cucumber-accordion\"]"));
        result.click();
        WebElement text= driver.findElement(By.xpath("//*[@id=\"cucumber-testing-description\"]/p/text()"));
        text.click();{
        System.out.println(text);
    }
}}
