package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssistancesPage {

    private WebDriver driver;
    private By assistancesLink = By.className("assistances-searchbox__title");

    public AssistancesPage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle(){
        return driver.findElement(assistancesLink).getText();
    }


}
