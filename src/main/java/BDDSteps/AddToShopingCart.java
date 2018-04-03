package BDDSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.ShopingCartPage;

public class AddToShopingCart extends PageBase {

    ShopingCartPage shopingCartPage = new ShopingCartPage();

    @When("^User move cursor to grocery$")
    public void user_move_cursor_to_grocery() {
       shopingCartPage.mouseHoverToGrocery();

    }

    @Then("^grocery page will be drop down$")
    public void grocery_page_will_be_drop_down() {
     shopingCartPage.groceryPageDropDown();

    }

    @And("^User select a category as \"([^\"]*)\"$")
    public void user_select_a_category_as(String arg1) {
     shopingCartPage.selectWaterAndBeverage();


    }

    @When("^Popup window will open$")
    public void popup_window_will_open() {
        shopingCartPage.popUpForZipCode();
    }

    @Then("^Water & Beverages page will be display$")
    public void water_Beverages_page_will_be_display() {
      shopingCartPage.verifyWaterBeveragepage();

    }

    @Then("^User enter zipcode as \"([^\"]*)\"$")
    public void user_enter_zipcode_as(String arg1) {
     shopingCartPage.enterZipCode();
    }

    @Then("^User click set delivery zip code$")
    public void user_click_set_delivery_zip_code() {
        shopingCartPage.clickDeliveryZipCode();

    }

    @When("^User click Add button$")
    public void user_click_Add_button() {
       shopingCartPage.clickAddButton();
    }

    @When("^User click cart button$")
    public void user_click_cart_button() {
     shopingCartPage.clickCartButton();
    }

    @Then("^shopping cart page will open$")
    public void shopping_cart_page_will_open() {
      shopingCartPage.verifyShopingCartPage();
    }
}


