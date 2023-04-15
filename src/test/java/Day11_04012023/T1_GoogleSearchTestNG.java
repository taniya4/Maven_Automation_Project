package Day11_04012023;

import ResuableLibrary.ReusableMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.awt.geom.RectangularShape;

public class T1_GoogleSearchTestNG {
    //to make variable global, you must declare it outside of the annotation methods
    WebDriver driver;
    //create before suite method to define your chrome driver
    @BeforeSuite
    public void setUpDriver(){
        driver = ReusableMethods.defineChromeDriver();
    }// end of before suite

    //@Test is a replacement of the main method to execute your code
    @Test
    public void GoogleSearchNumber(){
        //navigate to google home
        driver.navigate().to("https://www.google.com");
        //enter bmw on search field
        ReusableMethods.sendKeysMethod(driver, "//*[@name='q']","BMW" , "Search Field");
        //submit of google search
        ReusableMethods.submitMethod(driver, "//*[@name='btnK']", "Google Search");
        //capture the text and print out the number
        String result = ReusableMethods.captureTextMethod(driver,"//*[@id='result-stats']","Search Results");
        String[]arrayResult = result.split(" ");
        System.out.println("Search number for BMW: " + arrayResult[1]);
    }//end of test
    @AfterSuite
    public void quitSession(){
        driver.quit();
    }//end of after suite

}//end of class

