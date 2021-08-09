package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class hotelsResultPage {
    private WebDriver driver;
    private By hotelsPageTitle = By.xpath("/html/body/am-root/div[2]/am-app-results/div[1]/div[2]/div[1]/div");

    public hotelsResultPage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitleText(){
        return driver.findElement(hotelsPageTitle).getText();
    }


}
