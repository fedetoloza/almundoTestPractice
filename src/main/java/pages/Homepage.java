package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
    private WebDriver driver;

    public Homepage(WebDriver driver){
        this.driver = driver;
    }

    public HotelsPage clickHotels(){
        clickLink("//li[@data-au=\"tab-hotels\"]");
        return new HotelsPage(driver);
    }

    public VuelosPage clickVuelos(){
        clickLink("//li[@data-au=\"tab-flights\"]");
        return new VuelosPage(driver);
    }

    public AssistancesPage clickSeguros() {
        clickLink("//li[@data-au=\"tab-assistance\"]");
        return new AssistancesPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.xpath(linkText)).click();
    }
}
