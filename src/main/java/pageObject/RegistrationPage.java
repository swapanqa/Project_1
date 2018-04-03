package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.SeleniumUtils;

public class RegistrationPage extends SeleniumUtils {

    public void clickRegisterLink() {
        WebElement element = driver.findElement(By.id("header_sign_in"));
        element.click();
        delayFor(2000);

    }

    public void verifySigninPage() {
        String title = driver.getTitle();
        Assert.assertEquals("Sign In", title);
    }


    public void clickCreateAccountButton() {
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Create Account')]"));
        element.click();

    }

    public void verifyRegistrationPage() {
        String title = driver.getTitle();
        Assert.assertEquals("Register Account", title);

    }

    public void enterEmailAddresForRegistration() {
        WebElement element = driver.findElement(By.id("register_email1"));
        element.sendKeys("ma_raz@yahoo.com");
    }

    public void enterPasswordForRegistration() {
        WebElement element = driver.findElement(By.id("logonPassword"));
        element.sendKeys("amar1234@");

    }

    public void enterConfirmPasswordForRegistration() {
        WebElement element = driver.findElement(By.id("logonPasswordVerify"));
        element.sendKeys("amar1234@");
    }

    public void clickRegisterButton() {
        WebElement element = driver.findElement(By.xpath("//input[@class = 'primary' and @type = 'submit']"));
        element.click();

    }
}
