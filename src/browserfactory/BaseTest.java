package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    public void openBrowser(String baseurl){

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // launch the url
        driver.get(baseurl);
        // maximise window
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    public void closeBrowser(){
        driver.quit();
    }
}



