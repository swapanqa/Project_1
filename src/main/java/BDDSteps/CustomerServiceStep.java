package BDDSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.CustomerServicePage;

public class CustomerServiceStep extends PageBase {
    CustomerServicePage cServicePage = new CustomerServicePage();

    @When("^User click customer service page link$")
    public void user_click_customer_service_page_link(){
        cServicePage.clickCustomerServiceLink();

    }

    @Then("^Customer service page will open$")
    public void customer_service_page_will_open(){
        cServicePage.verifyCustomerServicePageTitle();

    }

    @When("^User select credit Card from list$")
    public void user_select_credit_Card_from_list() {
        cServicePage.selectCreditCardFromList();

    }

    @Then("^Related page will open$")
    public void related_page_will_open() {
    cServicePage.verifyRelatedPagetitle();
    }

    @When("^User select membership from list$")
    public void user_select_membership_from_list(){
        cServicePage.selectMembershipFromList();

    }
}
