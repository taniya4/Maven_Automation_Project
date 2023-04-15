package Day7_03182023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_SelectDropdownByClick {
    public static void main(String[] args) throws InterruptedException {
        //set up your driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //set your chrome options arguments for your web driver
        ChromeOptions options = new ChromeOptions();
        //add maximize for windows
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        //define the chrome driver that you will use for automation test
        //option variable must be passed inside chromeDriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calculator
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(1000);

        //select start month as April from the dropdown using select function
        //if the dropdown is not under select tag then click on the dropdown first
        driver.findElement(By.xpath("//*[@name='param[start_month]']")).click();
        //click on the dropdown value by using xpath text
        driver.findElement(By.xpath("//*[text()='Apr']")).click();

        //click on empty area to close the dropdown
        driver.findElement(By.xpath("//*[@class='content-area']")).click();

        driver.quit();
    }//end of main


}//end of main
