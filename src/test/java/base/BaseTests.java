package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.Homepage;

public class BaseTests {
    private WebDriver driver;
    protected Homepage homepage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://almundo.com.ar/");
        homepage = new Homepage(driver);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
