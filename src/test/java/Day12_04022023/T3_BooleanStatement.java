package Day12_04022023;

import ResuableLibrary.ReusableAnnotations;
import ResuableLibrary.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class T3_BooleanStatement extends ReusableAnnotations {
    @Test(priority = 1)
    public void verifyCheckBoxIsChecked(){
        driver.navigate().to("https://www.yahoo.com");
        //click on Sign In
        ReusableMethods.clickMethod(driver,"//*[@class='_yb_1dbys']","Sign In");
        //store the xpath in boolean statement
        WebDriverWait wait = new WebDriverWait(driver, 7);
        try {
            boolean elementState = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='persistent']"))).isSelected();
            System.out.println("Value: " + elementState);
            if (elementState == true) {
                System.out.println("Passed: Checkbox is checked by default");
            } else {
                System.out.println("Failed: Checkbox is not checked by default");
            }
        } catch (Exception e) {
            System.out.println("Unable to verify check box " + e);
        }//end of exception
    }//end of test 1

    @Test(priority = 2)
    public void verifyCheckBoxISnotChecked() throws InterruptedException {
        //click on check box to uncheck it
        Thread.sleep(2000);
        ReusableMethods.clickMethod(driver,"//*[@class='stay-signed-in checkbox-container']","Checkbox");
        Thread.sleep(2000);
        ReusableMethods.verifyBooleanStatement(driver,"//*[@id='persistent']",false,"Checkbox");
    }//end of test 2
}//end of test
