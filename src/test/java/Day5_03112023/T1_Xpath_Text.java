package Day5_03112023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Xpath_Text {
    public static void main(String[] args) throws InterruptedException {
        //set up your driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //define the chrome driver that you will use for automation test
        WebDriver driver = new ChromeDriver();

        //navigate the Google home
        driver.navigate().to("https://www.google.com");

        Thread.sleep(3000);

        //click on About text link using xpath text()
        driver.findElement(By.xpath("//*[text()= 'About']")).click();

        driver.quit();

    }//end of main
}//end of class
