package Day5_03112023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_Xpath_Contains {
    public static void main(String[] args) throws InterruptedException {
        //set up your driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //define the chrome driver that you will use for automation test
        WebDriver driver = new ChromeDriver();

        //navigate to yahoo hoe page
        driver.navigate().to("https://www.yahoo.com");

        Thread.sleep(3000);

        //using xpath contains click on the mail link by ignoring the white space on the text property to find that element
        driver.findElement(By.xpath("//a[contains(text(), 'Mail')]")).click();
    }//end of main
}//end of class
