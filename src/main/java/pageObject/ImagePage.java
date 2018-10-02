package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.SeleniumUtils;

import java.util.List;

public class ImagePage extends SeleniumUtils {
	
	

    public void countAllImage(){
        WebElement imageFile = driver.findElement(By.xpath(".//*[@id='slick-slide02']/img[1]"));
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript
                ("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", imageFile);
        if (!ImagePresent) {
            System.out.println("Image not displayed.");
        } else {
            System.out.println("Image displayed.");
        }

        List<WebElement> allImages = driver.findElements(By.tagName("img"));
        int countAllImages = allImages.size();
        System.out.println("Total number of images is  :"+countAllImages);

        for(int x =0;x >= countAllImages;x++){
            System.out.println(allImages.get(x));
        }
    }
}
