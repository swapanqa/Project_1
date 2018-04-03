package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.SeleniumUtils;

public class ShopingCartPage extends SeleniumUtils {

    public void mouseHoverToGrocery(){
        delayFor(4000);
        WebElement element = driver.findElement(By.xpath(".//*[@id='Home_Ancillary_0']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();


    }
    public void groceryPageDropDown(){
        WebElement element = driver.findElement(By.xpath("//div[@class='col-sm-3 col-md-3']//a[contains(text(),'Kirkland Signature')]"));
        //delayFor(1000);
        String text = element.getText();
        System.out.println(text);
        String expected = "Kirkland Signature";
        delayFor(1000);
        if (text.contains(expected)) {
            System.out.println("Match");
        } else {
            System.out.println("Don't Match");
        }
    }
    public void selectWaterAndBeverage(){
        WebElement element = driver.findElement(By.xpath(".//*[@id='Home_Ancillary_Popover_0-container']/div/div[1]/ol/li[4]/a"));//
        element.click();

    }
    public void popUpForZipCode(){
        WebElement element = driver.findElement(By.xpath("//div[@class= 'col-md-5 hidden-xs hidden-sm']/p[@class='added-to-cart success']"));
        String text = element.getText();
        String expected = "Item Added to Cart";
        if (text.contains(expected)) {
            System.out.println("Match");
        } else {
            System.out.println("Don't Match");
        }



    }
    public void verifyWaterBeveragepage(){
        String title = driver.getTitle();
        Assert.assertEquals("Water & Beverages | Costco", title);

    }
    public void enterZipCode(){
        WebElement element = driver.findElement(By.xpath(".//*[@id='postal-code-input']"));
        delayFor(2000);
        element.sendKeys("10461");
        delayFor(2000);


    }
    public void clickDeliveryZipCode(){
        WebElement element = driver.findElement(By.xpath(".//*[@id='postal-code-submit']"));
        element.click();


    }
    public void clickAddButton(){
        WebElement element = driver.findElement(By.id("addbutton-1"));
        scrollToElement(element);
        delayFor(2000);
        element.click();
    }
    public void clickCartButton(){
        WebElement element = driver.findElement(By.id("cart-d"));
        delayFor(2000);
        element.click();
    }
    public void verifyShopingCartPage(){
        String title = driver.getTitle();
        Assert.assertEquals("Shopping Cart", title);
        System.out.println(title);


    }







}