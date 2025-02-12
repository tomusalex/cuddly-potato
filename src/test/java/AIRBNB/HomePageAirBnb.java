package AIRBNB;


//import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePageAirBnb {
    public WebDriver driver;
    @Test
    public void testMethod(){
        // open a browser
        driver = new ChromeDriver();
//        elementsMethods = new ElementsMethods(driver);
//        javaScriptMethods = new JavaScriptMethods();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // accesing a web page
        driver.get("https://www.airbnb.ie");


        // maximize browser
        driver.manage().window().maximize();


//        identify by ID

//        WebElement bookButtonXpath = driver.findElement(By.id("rhfCategoryFlyout_Books"));
//        WebElement bookButtonCSS = driver.findElement(By.cssSelector("#rhfCategoryFlyout_Books"));

//        identify by HREF





            driver.close();
//        elementsMethods.clickOnElement(alertsFrameWindowsField);
    }


}
