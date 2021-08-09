package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelsPage {

    private WebDriver driver;
    private By hotelsTitle = By.className("hotels-searchbox__title");
    private By cityHotels = By.id("lodging");
    private By checkInHotel = By.id("checkin");
    private By numberOfGuests = By.id("guests");
    private By search = By.xpath("//button[@type=\"submit\"]");
    private By rightArrow = By.xpath("//*[@id=\"cdk-overlay-3\"]//div/div[2]/mb-calendar-header/button");
    private By subButtonAdult = By.xpath("//div[2]/div[1]/am-passengers-dialog-selector/div/div[2]/mb-icon[1]");
    private By doneButton = By.xpath("//*[@id=\"cdk-overlay-1\"]/am-passengers-dialog/div/div[4]/button");

    public HotelsPage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle(){
        return driver.findElement(hotelsTitle).getText();
    }

    public void setCityDestiny() throws InterruptedException {
        driver.findElement(cityHotels).click();
    }
    public void setDestiny(String destiny) throws InterruptedException {
        driver.findElement(cityHotels).sendKeys(destiny);
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-2\"]/am-autocomplete/div/div[2]/div[2]/div")).click();
    }

    public void setCheckInHotel() throws InterruptedException {
        driver.findElement(checkInHotel).click();
        Thread.sleep(500);
        for(int i=0 ; i < 1; i++){
            clickRightArrow();
            Thread.sleep(500);
        }

        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-3\"]/mb-range-datepicker-content/mb-range-month-view/div/div[1]/mb-calendar-body/table/tbody/tr[3]/td[4]/button")).click();
    }
    public void clickRightArrow(){
        driver.findElement(rightArrow).click();
    }
    public void setCheckOutHotel(){
        driver.findElement(By.xpath("//*[@id=\"cdk-overlay-4\"]/mb-range-datepicker-content/mb-range-month-view/div/div[1]/mb-calendar-body/table/tbody/tr[4]/td[5]/button")).click();
    }
    public void setNumberOfGuests(){
        driver.findElement(numberOfGuests).click();
        driver.findElement(subButtonAdult).click();
        driver.findElement(doneButton).click();
    }
    public hotelsResultPage clickSearch(){
        driver.findElement(search).click();
        return new hotelsResultPage(driver);
    }
}
