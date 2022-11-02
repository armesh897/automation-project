import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import zmq.ZError;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class screenshot {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.edge.driver", "C:\\Edgedriver\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\screenshot\\screenshot.png"));






}}
