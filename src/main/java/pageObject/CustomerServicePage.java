package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.SeleniumUtils;

public class CustomerServicePage extends SeleniumUtils {

    public void clickCustomerServiceLink() {
        WebElement element = driver.findElement(By.xpath(".//*[@id='customer-service-link']"));
        element.click();
    }

    public void verifyCustomerServicePageTitle() {
        String title = driver.getTitle();
        Assert.assertEquals("Support Home Page", title);
    }


    public void selectCreditCardFromList() {
        WebElement element = driver.findElement(By.xpath("//div/ul[1]/li[1]/a[@class='rn_ListItemLink']"));
        element.click();
    }

    public void verifyRelatedPagetitle() {
        String title = driver.getTitle();
        Assert.assertEquals("Find Answers", title);
    }

    public void selectMembershipFromList() {
        WebElement element = driver.findElement(By.xpath("//div/ul[1]/li[2]/a[@class='rn_ListItemLink']"));
        element.click();
    }
}


