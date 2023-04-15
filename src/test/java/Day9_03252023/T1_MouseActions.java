package Day9_03252023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class T1_MouseActions {
    public static void main(String[] args) throws InterruptedException {
        //set up your driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //set your chrome options arguments for your web driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");

        //define the chrome driver that you will use for automation test
        //option variable must be passed inside chromeDriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);

        //navigate to yahoo home page
        driver.navigate().to("https://www.usps.com");

        //put few seconds wait
        Thread.sleep(2000);

        //add maximized window
        driver.manage().window().maximize();

        //declare and define the mouse action
        Actions mouseAction = new Actions(driver);

        //hover to send tab to open up submodules/functionalities
        try{
            WebElement sendTab = driver.findElement(By.xpath("//*[@id='mail-ship-width']"));
            mouseAction.moveToElement(sendTab).perform();
        } catch (Exception e) {
            System.out.println("Unable to hover to Send Tab: " + e);
        }//end of send tab exception

        //click on Tracking using mouse click
        try{
            WebElement trackingLink = driver.findElements(By.xpath("//*[text()='Tracking']")).get(0);
            mouseAction.moveToElement(trackingLink).click().perform();
        } catch (Exception e) {
            System.out.println("Unable to click on Tracking: " + e);
        }//end of tracking exception

        //type on Tracking Field using mouse click
        try{
            WebElement trackingField = driver.findElement(By.xpath("//*[@id='tracking-input']"));
            mouseAction.moveToElement(trackingField).click().sendKeys("12345678").perform();
            System.out.println("Successfully type invaid tracking number on Tracking Input field");
        } catch (Exception e) {
            System.out.println("Unable to type on Tracking Input: " + e);
        }//end of tracking input exception

        driver.quit();

    }
}
