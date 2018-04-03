package BDDSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ProductStep extends PageBase {


    @When("^User move cursor to Optical$")
    public void user_move_cursor_to_Optical() {
        delayFor(2000);
        WebElement element = driver.findElement(By.xpath("//*[@id='Home_Ancillary_2']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    @Then("^Optical page will be drop down$")
    public void optical_page_will_be_drop_down() {
        WebElement element = driver.findElement(By.xpath("//a[@id='Home_Ancillary_2']"));
        System.out.println(element.getText());
        element.isDisplayed();
        delayFor(2000);

    }


    @Then("^User can select a category as \"([^\"]*)\"$")
    public void user_can_select_a_category_as(String arg1) {
        delayFor(3000);
        WebElement element = driver.findElement(By.xpath(".//*[@id='Home_Ancillary_Popover_2-container']/div/div[2]/ol/li[1]/a"));
        element.click();
    }


/*    @Then("^User check the price$")
    public void user_check_the_price() {
        delayFor(3000);
        WebElement element = driver.findElement(By.xpath(".//*[@id='accordion-filter_collapse-2']/div/a[1]/label"));
    }*/

    @Then("^User select a item as \"Men's Sunglasses\"$")
    public void User_select_a_item_as (){
        WebElement element = driver.findElement(By.xpath("//div[@id='search-results']//div[1]/a/h3"));
        element.click();
    }

    @Then("^Mens Sunglass page will display$")
    public void Mens_Sunglass_page_will_display() {
        String title = driver.getTitle();
        Assert.assertEquals("Men's Sunglasses | Costco",title);
    }
}