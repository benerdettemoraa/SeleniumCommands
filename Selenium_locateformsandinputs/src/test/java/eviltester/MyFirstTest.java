package eviltester;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class MyFirstTest {
    @Test
    public void startWebDriver(){

        //system property  for chrome driver
        System.setProperty("webdriver.chrome.driver", "/Users/sabina.moraa/Downloads/chromedriver");
        //initialize
        WebDriver driver = new ChromeDriver();

        //PerformingClickEvent
        //fetchAWebPage
        driver.navigate().to("https://isobarke-staging.com/safaricom/websites/2021/billmanager");
        //locateForms&SendUserInputs
        driver.findElement(By.className("form-control")).sendKeys("serabi moraa");
        driver.close();

    }


}
