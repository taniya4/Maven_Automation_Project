package Day10_03262023;

import ResuableLibrary.ReusableMethods;
import org.openqa.selenium.WebDriver;

public class T1_Staples_ResuableMethods {
    public static void main(String[] args) throws InterruptedException {

        //set up the chrome driver
        WebDriver driver = ReusableMethods.defineChromeDriver();

        //navigate to staples home page
        driver.navigate().to("https://www.staples.com");

        //type on search field using sendkeys method
        ReusableMethods.sendKeysMethod(driver,"//*[@id='searchInput']","iphone","Search Field");

        //click on the search icon
        ReusableMethods.clickMethod(driver,"//*[@class='search-bar-input__searchIcon']","Search Icon");

        //click on first image by index
        ReusableMethods.clickMethodByIndex(driver,"//*[@class='standard-tile__image standard-tile__image_hover']",0,"Iphone Image");

        //click on add to the cart button
        ReusableMethods.clickMethod(driver,"//*[@id='ctaButton']","Add to cart");

        //capture the starting price and print it out
        Thread.sleep(3000);
        String result = ReusableMethods.captureTextMethod(driver,"//*[contains(text(),'starting at')]","Starting Price");

        System.out.println("My result is " + result);


    }
}
