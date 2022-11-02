import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class asiaonly {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Edgedriver\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.justwatch.com/");
        WebElement asia = driver.findElement(By.xpath("/html/body/div/div[4]/div/div/div/div[2]/div[5]/div/div[1]/div[4]/div[2]/div"));
        List<WebElement> centralAmerica = asia.findElements(By.tagName("a"));
        for (WebElement e : centralAmerica) {

            System.out.println(e.getText());
        }
    }
}

