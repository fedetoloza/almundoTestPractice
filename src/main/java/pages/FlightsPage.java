package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightsPage {
    private WebDriver driver;
    private By flights = By.className("flights-searchbox__title");


    public FlightsPage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle(){
        return driver.findElement(flights).getText();
    }



}
