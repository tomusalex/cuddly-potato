package Tests.LetCodeIt;


//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DriverCommand;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class HomePageLetCodeIt {
    public WebDriver driver;

    @Test
    public void testMethod() throws InterruptedException {
        // open a browser
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // accesing a web page
        driver.get("https://letcode.in/forms");


        // maximize browser
        driver.manage().window().maximize();


//        create a list with all the elements

        List<WebElement> elementsList = driver.findElements(By.xpath("//input"));

        selectAndFillElementFromListByAttribute(elementsList, "firstname", "Aleksander");
        selectAndFillElementFromListByAttribute(elementsList, "lasttname", "Brajic");
        selectAndFillElementFromListByAttribute(elementsList, "email", "Brajic@yahoo.com");
        selectAndFillElementFromListByAttribute(elementsList, "Phno", "35347494957575");
        selectAndFillElementFromListByAttribute(elementsList, "Addl1", "Addres1");
        selectAndFillElementFromListByAttribute(elementsList, "Addl2", "Address2");
        selectAndFillElementFromListByAttribute(elementsList, "state", "Romania");
        selectAndFillElementFromListByAttribute(elementsList, "postalcode", "400234");


//        selectElementFromListByText(elementsList, "Last Name");
//        selectElementFromListByText(elementsList, "Email");

//        identify COUNTRY CODE

        WebElement countryCode = driver.findElement(By.xpath("//label[@id='countrycode']/parent::*"));

        WebElement countryCodeChild = countryCode.findElement(By.xpath("//option[@data-countrycode='DZ']"));
        clickOnElement(countryCodeChild);

        //        Alternative method COUNTRY CODE
//        WebElement countryCodeChild = driver.findElement(By.xpath("//option[@data-countrycode='DZ']"));
//        clickOnElement(countryCodeChild);

//        identify COUNTRY

        WebElement country = driver.findElement(By.xpath("//label[@id='country']/parent::*"));

        WebElement countryChild = country.findElement(By.xpath(" //option[@value='Algeria']"));
        clickOnElement(countryChild);

        //        Alternative method COUNTRY
//        WebElement countryCodeChild = driver.findElement(By.xpath("//option[@value='Algeria']"));
//        clickOnElement(countryChild);

        WebElement datePicker = driver.findElement(By.id("Date"));
        datePicker.sendKeys("12.12.2024");



        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");

        WebElement genderOption = driver.findElement(By.cssSelector("#trans"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(genderOption);
//        actions.perform();
//        javascriptExecutor.executeScript("arguments[0].click()",genderOption);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", genderOption);
//        Thread.sleep(500);
        genderOption.click();

        WebElement iAgre = driver.findElement(By.xpath("//label[@class='checkbox']"));
        iAgre.click();

        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        submitButton.click();

//        WebElement succesTitle = driver.findElement(By.xpath("//h1[text()=' LetCode with Koushik ']"));
//      Assert.assertEquals(succesTitle.getText()," LetCode with Koushik ");


//    driver.close();
    }

    public void selectAndFillElementFromListByAttribute(List<WebElement> elementsList, String id, String value) {
        for (int i = 0; i < elementsList.size(); i++) {
            if (elementsList.get(i).getAttribute("id").equals(id)) {
                clickOnElement(elementsList.get(i));
                elementsList.get(i).sendKeys(value);
                break;
            }

        }
    }

    public void clickOnElement(WebElement element) {
        element.click();

    }
}
//    public void fillElement(WebElement element, String value){
//        element.sendKeys(value);
//    }

