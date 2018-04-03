package BDDSteps;

import cucumber.api.java.en.Then;
import pageObject.ImagePage;

public class ImagePageStep extends PageBase {

ImagePage imagePage=new ImagePage();


    @Then("^User can see all the images$")
    public void user_can_see_all_the_images()  {
    imagePage.countAllImage();
        }

    }


