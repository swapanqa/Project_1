package BDDSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.HomePage;
import pageObject.RegistrationPage;

public class RegistrationStep extends PageBase {

    RegistrationPage registrationPage = new RegistrationPage();
    HomePage homePage = new HomePage();


    @When("^User click Register link$")
    public void user_click_Register_link() throws Throwable {
        registrationPage.clickRegisterLink();
    }

    @Then("^Signin form will be dispaly$")
    public void Signin_form_will_be_dispaly() {
        registrationPage.verifySigninPage();
    }


    @When("^User click on Create Account$")
    public void user_click_on_Create_Account() throws Throwable {
       registrationPage.clickCreateAccountButton();
    }

    @Then("^Registration Page will display$")
    public void registration_Page_will_display() throws Throwable {
     registrationPage.verifyRegistrationPage();

    }

    @Then("^User enter email address as \"([^\"]*)\"$")
    public void user_enter_email_address_as(String arg1) throws Throwable {
        registrationPage.enterEmailAddresForRegistration();

    }

    @Then("^User enter password as \"([^\"]*)\"$")
    public void user_enter_password_as(String arg1) throws Throwable {
        registrationPage.enterPasswordForRegistration();
    }

    @Then("^user enter confirm password as \"([^\"]*)\"$")
    public void user_enter_confirm_password_as(String arg1) throws Throwable {
        registrationPage.enterConfirmPasswordForRegistration();
    }

    @When("^User click Register button$")
    public void user_click_Register_button() throws Throwable {
        registrationPage.clickRegisterButton();
    }

    @Then("^User will get welcome message$")
    public void user_will_get_welcome_message() throws Throwable {
       homePage.verifyHomePageTitle();


    }
}



