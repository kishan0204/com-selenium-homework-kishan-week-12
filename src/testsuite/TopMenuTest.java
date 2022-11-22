package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class TopMenuTest extends Utility {

    String baseUrl ="https://demo.nopcommerce.com/";

    @Before
    public  void setUp() {
        openBrowser(baseUrl);
    }

        @Test
    public void verifyuserShouldNavigateToComputerPageSuccessfully() throws IllegalAccessException {

           clickOnElement(By.xpath("(//a[@href='/computers'])[1]"));

            clickOnElement(By.xpath("(//a[@href='/electronics'])[1]"));

            clickOnElement(By.xpath("(//a[@href='/apparel'])[1]"));

            clickOnElement(By.xpath("(//a[@href='/digital-downloads'])[1]"));

            clickOnElement(By.xpath("(//a[@href='/books'])[1]"));

            clickOnElement(By.xpath("(//a[@href='/jewelry'])[1]"));

            clickOnElement(By.xpath("(//a[@href='/gift-cards'])[1]"));

           // driver.findElements(By.xpath("//a[@href='/computers'])[1]"));




        }



    }

