package Day9_03252023;

import ResuableLibrary.ReusableMethods;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T4_ResuableConceptUPS {
    public static void main(String[] args) throws InterruptedException {

        //on your test classes you still to declare the webdriver command you want to use
        WebDriver driver = ReusableMethods.defineChromeDriver();


        //navigate to ups website
        driver.navigate().to("http://www.ups.com/us");

        //click on shipping
        //your explicit wait condition replaces your driver.findElement(s)
        //presenceOfAllElementsLocatedBy is same as findElements
        ReusableMethods.clickMethod(driver,"//*[@id='mainNavDropdown1']","Shipping Link");

        //click on Schedule a Pickup
        //when you see element not intractable exception then you have to use Thread.sleep for few seconds before
        Thread.sleep(2000);
        ReusableMethods.clickMethod(driver,"//*[text()='Schedule a Pickup']","Schedule a Pickup");


        //click on Freight
       // ReusableMethods.clickMethod(driver,"//*[text()='Freight']","Freight");
    }//end of main
}//end of class

