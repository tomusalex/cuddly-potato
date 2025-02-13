package AIRBNB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HomePageAirBnb {
    public WebDriver driver;

    @Test
    public void testMethod() {

        // open a browser
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // accesing a web page
        driver.get("https://www.airbnb.ie");

        // maximize browser
        driver.manage().window().maximize();


//        Create a list with all the WebElements

        List<WebElement> elementsList = driver.findElements(By.xpath("//input[@name='categoryScroller']"));

        selectElementFromListByText(elementsList, "Bed & breakfasts");
        selectElementFromListByText(elementsList, "Domes");
        selectElementFromListByText(elementsList, "Islands");


//            driver.close();

    }

    public void selectElementFromListByText(List<WebElement> elementsList, String value) {
        for (int i = 0; i < elementsList.size(); i++) {
            if (elementsList.get(i).getText().equals(value)) {
                elementsList.get(i).click();
            }
        }
    }

}
