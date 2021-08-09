package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class VuelosPage {
    private WebDriver driver;
    private By vuelos = By.className("flights-searchbox__title");
    private By departureDateInput = By.xpath("//input[contains(@data-au, 'departureDate-0')]");


    public VuelosPage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle(){
        return driver.findElement(vuelos).getText();
    }



}
