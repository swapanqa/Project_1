package pageObject;

import org.junit.Assert;
import utils.SeleniumUtils;

public class HomePage extends SeleniumUtils {

    public  void notAValidUser(){
        driver.manage().deleteAllCookies();
    }

    public void browseToTheSite(){
        driver.navigate().to("https://www.costco.com/");
    }
    public void verifyHomePageTitle(){
        String title = driver.getTitle();
        Assert.assertEquals("Welcome to Costco Wholesale",title);
    }

}
