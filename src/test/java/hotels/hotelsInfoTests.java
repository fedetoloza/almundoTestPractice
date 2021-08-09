package hotels;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.hotelsResultPage;
import pages.HotelsPage;

import static org.testng.Assert.assertEquals;

public class hotelsInfoTests extends BaseTests {

    @Test
    public void testhotelsinfo() throws InterruptedException {
        HotelsPage hotelsPage = homepage.clickHotels();
        Thread.sleep(1000);
        hotelsPage.setCityDestiny();
        Thread.sleep(500);
        hotelsPage.setDestiny("Punta Cana");
        Thread.sleep(500);
        hotelsPage.setCheckInHotel();
        Thread.sleep(500);
        hotelsPage.setCheckOutHotel();
        hotelsPage.setNumberOfGuests();
        Thread.sleep(500);
        hotelsResultPage hotelsResultPage = hotelsPage.clickSearch();
        Thread.sleep(10000);
        assertEquals(hotelsResultPage.getTitleText(), "Hoteles en Punta Cana", "Pagina incorrecta");
    }

}
