import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class multipltscreenshots {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.edge.driver", "C:\\Edgedriver\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        HashMap<String, String> web = new HashMap<String, String>();
        web.put("facebook", "https://www.facebook.com/");
        web.put("amazon", "https://www.amazon.com/");
        web.put("imdb", "https://www.imdb.com/");
        web.put("youtube", "https://www.youtube.com/");
        web.put("ebay", "https://www.ebay.com/");

for ( String i: web.keySet()){
    System.out.println(web.get(i));
    driver.get(web.get(i));
    File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(src,new File("C:\\screenshot\\"+i+".png"));

}


    }
}
