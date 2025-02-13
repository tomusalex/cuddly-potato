package BarnesAndNoble;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePageBarnesAndNoble {
    public WebDriver driver;

    @Test
    public void testMethod() {
        // open a browser
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // accesing a web page
        driver.get("https://www.barnesandnoble.com/");


        // maximize browser
        driver.manage().window().maximize();


//        Identify eBooks -> General Fiction element

        WebElement generalFictionElement = driver.findElement(By.xpath())


        driver.close();

    }


}
