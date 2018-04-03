package BDDSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.WarehouselocationPage;

public class Warehouselocation extends PageBase {
   WarehouselocationPage warehouselocation = new WarehouselocationPage();

    @When("^User move cursor to find a Warehouse link$")
    public void user_move_cursor_to_find_a_Warehouse_link()  {
     warehouselocation.mouseHoverToFindAWarehouseLink();
    }

    @Then("^Find warehouse page should be dropdown$")
    public void find_warehouse_page_should_be_dropdown()  {
       warehouselocation.warehousePagedropdown();
    }

    @Then("^User enter the city name\"([^\"]*)\"$")
    public void user_enter_the_city_name(String arg1) {
        warehouselocation.enterTheCityName();

    }

    @Then("^User click find a warehouse button$")
    public void user_click_find_a_warehouse_button()  {
        warehouselocation.clickFindWarehouseButton();
    }

    @Then("^Store location will be display$")
    public void store_location_will_be_display()  {
       warehouselocation.storeLocationDisplay();

    }


    @Then("^User click Gas station check box$")
    public void user_click_Gas_station_check_box()  {
        warehouselocation.clickGasStation();
    }

    @Then("^User click Tire center check box$")
    public void user_click_Tire_center_check_box() {
        warehouselocation.clickTireCenter();
    }


    @Then("^User click Optical check box$")
    public void user_click_Optical_check_box()  {
       warehouselocation.clickOptical();
    }

    @Then("^User click pharmacy check box$")
    public void user_click_pharmacy_check_box() {
       warehouselocation.clickPharmacy();

    }
    @Then("^User enter state name as \"([^\"]*)\"$")
    public void user_enter_state_name_as(String arg1)  {
       warehouselocation.enterState();
    }

    @Then("^User enter zip as \"([^\"]*)\"$")
    public void user_enter_zip_as(String arg1)  {
       warehouselocation.enterZipcode();
    }
    @Then("^User enter city name as \"([^\"]*)\"$")
    public void user_enter_city_name_as(String arg1)  {
       warehouselocation.enterCityName();
    }

    @Then("^Unsuccess message will be display$")
    public void unsuccess_message_will_be_display()  {

        }
    }



