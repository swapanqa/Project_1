package cloud;

import org.junit.After;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import pageObject.*;
import utils.DriverFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public class CloudWithJunit {
    protected WebDriver driver;

    public HomePage homePage;
    public ImagePage imagePage;
    public SigninPage signinPage;
    public RegistrationPage registrationPage;
    public WarehouselocationPage warehouselocation;
    public CustomerServicePage cServicePage;
    public ShopingCartPage shopingCartPage;

    //public WebElementUtils webElementUtils;

    @Parameterized.Parameter()
    public String browserName = "chrome";

    @Before
    public void setUp() throws Exception {
        driver = DriverFactory.getInstance(browserName).getDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.costco.com/");

        homePage =new HomePage();
        imagePage= new ImagePage();
        signinPage = new SigninPage();
        registrationPage = new RegistrationPage();
        warehouselocation=new WarehouselocationPage();
        cServicePage = new CustomerServicePage();
        //webElementUtils=new WebElementUtils();
        shopingCartPage=new ShopingCartPage();


    }
    @After
    public void teardown(){
        homePage=null;
        signinPage = null;
        imagePage=null;
        registrationPage = null;
        warehouselocation=null;
        cServicePage = null;
        shopingCartPage=null;

       // webElementUtils=null;

        DriverFactory.getInstance().removeDriver();
    }
    @Parameterized.Parameters(name = "{index} - Browser - {0}")
    public static Collection<Object[]> browsers() {
        return Arrays.asList(new Object[][]{
                {"chrome"},
                //{"firefox"},
                {"cloud_chrome_64"},
                //{"cloud_ie_11"}
        });
    }
}