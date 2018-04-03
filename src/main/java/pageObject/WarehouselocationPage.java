package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.SeleniumUtils;

public class WarehouselocationPage extends SeleniumUtils {

    public void mouseHoverToFindAWarehouseLink() {
        delayFor(3000);
        WebElement element = driver.findElement(By.xpath("//a[@id='warehouse-locations-dropdown'and @class='header-menu-dropdown']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

    }

    public void warehousePagedropdown() {
        String title = driver.getTitle();
        Assert.assertEquals("Welcome to Costco Wholesale", title);
        System.out.println(title);
        delayFor(2000);
    }

    public void enterTheCityName() {
        WebDriverWait wait = new WebDriverWait(driver, 50);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='warehouse-search-field-desktop']")));
        element.sendKeys("Manhattan");
        delayFor(2000);
    }

    public void clickFindWarehouseButton() {
        WebElement element = driver.findElement(By.xpath("//form[@id='warehouse_locator_search-desktop']//input[@class='btn btn-primary'and@type='submit']"));
        delayFor(2000);
        element.click();
    }

    public void storeLocationDisplay() {
        String title = driver.getTitle();
        delayFor(3000);
        Assert.assertEquals("Find a Costco warehouse- Costco", title);
    }

    public void clickGasStation() {
        WebElement element = driver.findElement(By.xpath("//label[@title='Gas Station' and @for='hasGas-desktop']"));
        element.click();

    }

    public void clickTireCenter() {
        WebElement element = driver.findElement(By.xpath("//label[@title='Gas Station' and @for='hasGas-desktop']"));
        element.click();

    }

    public void clickOptical() {
        WebElement element = driver.findElement(By.xpath("//form[@id='warehouse_locator_search-desktop']//label[@title='Optical Dept']"));
        delayFor(3000);
        element.click();
    }

    public void clickPharmacy() {
        WebElement element = driver.findElement(By.xpath("//form[@id='warehouse_locator_search-desktop']//label[@title='Pharmacy']"));
        delayFor(3000);
        element.click();
    }

    public void enterState() {
        WebElement element = driver.findElement(By.xpath("//a[@id='warehouse-locations-dropdown']"));
        element.sendKeys("New York");
        delayFor(2000);
    }

    public void enterZipcode() {
        WebElement element = driver.findElement(By.xpath("//input[@id='warehouse-search-field-desktop']"));
        element.sendKeys("10461");
    }

    public void enterCityName() {
        WebElement element = driver.findElement(By.xpath("//a[@id='warehouse-locations-dropdown']"));
        element.sendKeys("xxxxx");
    }

    public void unsuccessMessageDisplay() {
        WebElement element = driver.findElement(By.xpath(".//div[@id='error-container']/div[1]"));
        String text = element.getText();
        System.out.println("TEXT IS  :" + text);
        String expected = "We were unable to find a Costco warehouse near your location. Please try searching again.";
        if (text.contains(expected)) {
            System.out.println("Match");
        } else {
            System.out.println("Don't match");
        }
    }
}