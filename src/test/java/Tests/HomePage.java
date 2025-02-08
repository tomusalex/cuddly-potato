package Tests;


//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.*;

import java.time.Duration;

public class HomePage {
    public WebDriver driver;
    @Test
    public void testMethod(){
        // open a browser
        driver = new ChromeDriver();
//        elementsMethods = new ElementsMethods(driver);
//        javaScriptMethods = new JavaScriptMethods();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // accesing a web page
        driver.get("https://www.barnesandnoble.com/");


        // maximize browser
        driver.manage().window().maximize();


//        identify by ID

        WebElement bookButtonXpath = driver.findElement(By.id("rhfCategoryFlyout_Books"));
        WebElement bookButtonCSS = driver.findElement(By.cssSelector("#rhfCategoryFlyout_Books"));

//        identify by HREF






//        elementsMethods.clickOnElement(alertsFrameWindowsField);
    }


}
