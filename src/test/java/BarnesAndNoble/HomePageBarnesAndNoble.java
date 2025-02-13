package BarnesAndNoble;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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


//        Identify eBooks -> General Fiction element BY ID and XPATH
        WebElement eBookElement = driver.findElement(By.id("rhfCategoryFlyout_eBooks"));
        eBookElement.click();
//        Identify elements using Chrome inspector
//      WebElement generalFictionElement = driver.findElement(By.xpath(               "//*[@id="navbarSupportedContent"]/div/ul/li[4]/div/div/div[1]/div/div[3]/div/dd/a[1]"));
        WebElement generalFictionElement = driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/div/ul/li[4]//div[1]/div/div[3]//a[1]"));
        generalFictionElement.click();

//       Check if the page was succesfully opened
        String expectedTitle = "Fiction eBooks";
        WebElement actualTitleElement = driver.findElement(By.xpath("//*[@id='main-content']//h1"));
        Assert.assertEquals(actualTitleElement.getText(), expectedTitle, "The expected title was not found.");


        driver.close();

    }


}
