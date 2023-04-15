package Day7_03182023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T1_SelectStatement {
    public static void main(String[] args) throws InterruptedException {

        //set up your driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //set your chrome options arguments for your web driver
        ChromeOptions options = new ChromeOptions();
        //add maximize for windows
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //define the chrome driver that you will use for automation test
        //option variable must be passed inside chromeDriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calculator
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(1000);
        //define the chrome driver that you will use for automation test
        //store the start a month locator as an WebElement
        WebElement strMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));
        //call select function to store the dropdown location
        Select startMonthDropdown = new Select(strMonth);
        //select by visible text
        startMonthDropdown.selectByVisibleText("Apr");
        //select by value
        //startMonthDropdown.selectByValue("4")
        //select by index
        //startMonthDropdown.selectByIndex(3);
        driver.quit();
    }//end of main
}//end of class


