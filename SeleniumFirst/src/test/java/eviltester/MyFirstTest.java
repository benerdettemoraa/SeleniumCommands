package eviltester;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MyFirstTest {
    @Test
    public void startWebDriver(){

        System.setProperty("webdriver.chrome.driver", "/Users/sabina.moraa/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://seleniumsimplified.com");

        Assert.assertTrue("title should start differently",
                driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();

    }

}
