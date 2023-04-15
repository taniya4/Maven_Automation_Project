package Day6_03122023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T1_FindElements {
    public static void main(String[] args) throws InterruptedException {

        //set up your driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //set your chrome options arguments for your web driver
        ChromeOptions options = new ChromeOptions();
        //add maximize for windows
       // options.addArguments("start-maximized");
        //add --kiosk for mac
        // options.addArguments("--kiosk");
        //add incognito mode to option
        options.addArguments("incognito");
        //add options to run your driver on the background(headless). means it doesn't show the browser
        //options.addArguments("headless");  //[if we use headless, then we do not see what's happening in the background as in how the website
        // you are calling  and what it is performing. the only thing you see that your results passed as expected and it shows on the terminal
        //as a return value of 0

        //define the chrome driver that you will use for automation test
        //option variable must be passed inside chromeDriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);

        //navigate to mlcalc.com
        driver.navigate().to("https://mlcalc.com");

        Thread.sleep(2000);

        //clear the autopopulated data from purchase price
        driver.findElement(By.xpath("//*[@name='ma']")).clear();
        driver.findElement(By.xpath("//*[@name='ma']")).sendKeys("250000");

        //click on calculate
        driver.findElement(By.xpath("//*[@value='Calculate']")).click();

        Thread.sleep(1500);
        //capture the monthly payment using findElements with index of 0
        String result = driver.findElements(By.xpath("//*[@style='font-size: 32px']")).get(0).getText();
        System.out.println("Monthly Payment: " + result);

        //capture the total 360 payment using findElements with index of 1
        String result2 = driver.findElements(By.xpath("//*[@style='font-size: 32px']")).get(1).getText();
        System.out.println("Total 360 Payment: " + result2);

        driver.quit();
    }//end of main
}//end of class