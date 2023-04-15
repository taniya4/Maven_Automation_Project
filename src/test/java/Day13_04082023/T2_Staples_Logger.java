package Day13_04082023;

import ResuableLibrary.ReusableAnnotations;
import ResuableLibrary.ReusableMethods_Logger;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class T2_Staples_Logger extends ReusableAnnotations {
    @Test(priority = 1)
    public void searchForIphoneOnStaples() {
            logger.log(LogStatus.INFO,"Navigate to Staples home page");
            //navigate to staples home page
            driver.navigate().to("https://www.staples.com");

            //type on search field using sendkeys method
            ReusableMethods_Logger.sendKeysMethod(driver,"//*[@id='searchInput']","iphone",logger,"Search Field");

            //click on the search icon
            ReusableMethods_Logger.clickMethod(driver,"//*[@class='search-bar-input__searchIcon']",logger,"Search Icon");
        }//end of test 1

        @Test(priority = 2)
        public void printOutSearchNumber() throws InterruptedException {
            //click on first image by index
            ReusableMethods_Logger.clickMethodByIndex(driver,"//*[@class='standard-tile__image standard-tile__image_hover']",0,logger,"Iphone Image");

            //click on add to the cart button
            ReusableMethods_Logger.clickMethodByIndex(driver,"//*[@id='ctaButton']",0,logger,"Add to cart");

            //capture the starting price and print it out
            Thread.sleep(3000);
            String result = ReusableMethods_Logger.captureTextMethod(driver,"//*[contains(text(),'starting at')]",logger,"Starting Price");
            System.out.println("Iphone result is " + result);
            logger.log(LogStatus.INFO,"Iphone result is " + result);
        }//end of test 2

    }

