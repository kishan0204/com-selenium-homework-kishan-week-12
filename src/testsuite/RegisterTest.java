package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

import java.time.Month;
import java.time.Year;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }
    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully() throws IllegalAccessException{
//* click on the ‘Register’ link
        clickOnElement(By.xpath("//a[normalize-space()='Register']"));

        //* Select gender radio button
        clickOnElement(By.xpath("//input[@id='gender-male']"));
        //* Enter First name
        //clickOnElement(By.xpath("//input[@id='FirstName']"));
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("kishan");

        //* Enter Last name
      driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Malaviya");
        //* Select Day Month and Year

//driver.findElement(By.xpath("\"Date of birth:\"")).sendKeys("");
driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("15");
driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("01");
driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1995");
        //* Enter Email address

        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("kishan_1234@yahoo.co.in");

        //* Enter Password
driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Vivek241990");
        //* Enter Confirm password
driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Vivek241990");
        //* Click on REGISTER button
       // driver.findElement(By.xpath("////button[@id='register-button']")).sendKeys("");
        clickOnElement(By.xpath("//button[@id='register-button']"));
  }
}