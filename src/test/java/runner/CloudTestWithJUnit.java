package runner;

import cloud.CloudWithJunit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CloudTestWithJUnit extends CloudWithJunit {

    @Test
    public void CustomerServicePageFunctionalityOne(){
        homePage.notAValidUser();
        homePage.browseToTheSite();
        homePage.verifyHomePageTitle();

        cServicePage.clickCustomerServiceLink();
        cServicePage.verifyCustomerServicePageTitle();
        cServicePage.selectCreditCardFromList();
        cServicePage.verifyRelatedPagetitle();

    }
    @Test
    public void CustomerServicePageFunctionalityTwo(){
        homePage.notAValidUser();
        homePage.browseToTheSite();
        homePage.verifyHomePageTitle();

        cServicePage.clickCustomerServiceLink();
        cServicePage.verifyCustomerServicePageTitle();
        cServicePage.selectMembershipFromList();
        cServicePage.verifyRelatedPagetitle();

    }

    //@Test
    public void signInFunctionality(){
        homePage.notAValidUser();
        homePage.browseToTheSite();
        homePage.verifyHomePageTitle();
        signinPage.clickSigninLink();
        signinPage.verifySigninPagetitle();
        signinPage.enterEmailAdress();
        signinPage.enterPassword();
        signinPage.clickSigninButton();
        homePage.verifyHomePageTitle();
    }

    @Test
    public void imageFunctionality(){
        imagePage.countAllImage();
    }

   // @Test
    public void registrationFunctionality(){
        homePage.notAValidUser();
        homePage.browseToTheSite();
        homePage.verifyHomePageTitle();

        registrationPage.clickRegisterLink();
        registrationPage.verifySigninPage();
        registrationPage.clickCreateAccountButton();
        registrationPage.verifyRegistrationPage();
        registrationPage.enterEmailAddresForRegistration();
        registrationPage.enterPasswordForRegistration();
        registrationPage.enterConfirmPasswordForRegistration();
        registrationPage.clickRegisterButton();
        homePage.verifyHomePageTitle();


    }

   // @Test
    public void warehouselocationFunctionalityOne(){
        homePage.notAValidUser();
        homePage.browseToTheSite();
        homePage.verifyHomePageTitle();

        warehouselocation.mouseHoverToFindAWarehouseLink();
        warehouselocation.warehousePagedropdown();
        warehouselocation.enterTheCityName();
        warehouselocation.clickFindWarehouseButton();
        warehouselocation.storeLocationDisplay();

    }
   // @Test
    public void warehouselocationFunctionalityTwo(){
        homePage.notAValidUser();
        homePage.browseToTheSite();
        homePage.verifyHomePageTitle();

        warehouselocation.mouseHoverToFindAWarehouseLink();
        warehouselocation.warehousePagedropdown();
        warehouselocation.enterTheCityName();
        warehouselocation.clickGasStation();
        warehouselocation.clickTireCenter();
        warehouselocation.clickFindWarehouseButton();
        warehouselocation.storeLocationDisplay();

    }
   // @Test
    public void shopingCartPageFunctionality(){
        homePage.notAValidUser();
        homePage.browseToTheSite();
        homePage.verifyHomePageTitle();

        shopingCartPage.mouseHoverToGrocery();
        shopingCartPage.groceryPageDropDown();
        shopingCartPage.selectWaterAndBeverage();
        shopingCartPage.verifyWaterBeveragepage();
        shopingCartPage.enterZipCode();
        shopingCartPage.clickDeliveryZipCode();
        shopingCartPage.clickAddButton();
        shopingCartPage.clickCartButton();
        shopingCartPage.verifyShopingCartPage();


    }

}
