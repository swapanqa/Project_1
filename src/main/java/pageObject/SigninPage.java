package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.SeleniumUtils;

public class SigninPage extends SeleniumUtils {

    public  void clickSigninLink(){
        WebElement element = driver.findElement(By.id("header_sign_in"));
        element.click();
    }
    public  void verifySigninPagetitle(){
        String title = driver.getTitle();
        Assert.assertEquals("Sign In",title);
    }

    public  void enterEmailAdress (){
        WebElement element = driver.findElement(By.id("logonId"));
        delayFor(2000);
        element.sendKeys("ma_raz@yahoo.com");

    }

    public  void enterPassword(){
        WebElement element = driver.findElement(By.id("logonPassword"));
        delayFor(2000);
        element.sendKeys("amar1234@");

    }

    public void clickSigninButton(){
        WebElement element = driver.findElement(By.xpath("//form[@id='LogonForm']/fieldset/div[5]/input[@class = 'primary']"));
        element.click();

    }

}
