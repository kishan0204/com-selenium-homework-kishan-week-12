package testsuite;

import browserfactory.BaseTest;
import graphql.VisibleForTesting;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class LoginTest extends Utility {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

//2. userShouldLoginSuccessfullyWithValidCredentials
    @Test
    public void verifyuserShouldLoginSuccessfullyWithValidCredentials() {

        clickOnElement(By.linkText("Log in"));

        //This from requirement
        String expectedMessage = "Welcome, Please Sign In!";

      //1. userShouldNavigateToLoginPageSuccessfully
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]\n"));
        String actualText = actualTextMessageElement.getText();

        // validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualText);


        sendTextToElement(By.id("Email"), "kishan_0204@yahoo.co.in");

        sendTextToElement(By.name("Password"), "123456");
        //driver.wait(10);

        clickOnElement(By.xpath("//button[normalize-space()='Log in']"));

       clickOnElement(By.xpath("//a[@class='ico-logout']"));
    }

    @After
    public void testDown() {
        //closeBrowser();

    }
}