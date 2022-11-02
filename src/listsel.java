import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class listsel {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Edgedriver\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.justwatch.com/");

        WebElement central= driver.findElement(By.xpath("//*[@id=\"base\"]/div/div/div/div[2]/div[5]/div/div[1]/div[4]/div[2]"));
        List<WebElement> centralAmerica= central.findElements(By.tagName("a"));
        for(WebElement e :centralAmerica){
            if(e.getText()== ""){
                continue;
            }
            System.out.println(e.getText());
        }


    }
}
