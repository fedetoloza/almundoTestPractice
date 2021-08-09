package navigation;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HotelsPage;
import pages.AssistancesPage;
import pages.FlightsPage;

import static org.testng.Assert.assertEquals;

public class NavigationTests extends BaseTests {

    @Test
    public void TestAlojamientosNavPage() throws InterruptedException {
        HotelsPage hotelsPage = homepage.clickHotels();
        Thread.sleep(2000);
        assertEquals(hotelsPage.getTitle(),"Encontrá alojamientos con cancelación gratuita.", "Error pestaña incorrecta");
    }

    @Test
    public void TestVuelosNavPage() throws InterruptedException{
        FlightsPage flightsPage = homepage.clickVuelos();
        Thread.sleep(2000);
        assertEquals(flightsPage.getTitle(),"Encontrá los mejores vuelos con reserva flexible.", "Error pestaña incorrecta");
    }

    @Test
    public void TestSegurosNavPage() throws InterruptedException{
        AssistancesPage assistancesPage = homepage.clickSeguros();
        Thread.sleep(2000);
        assertEquals(assistancesPage.getTitle(),"Encontrá el mejor Seguro con reserva flexible.", "Error pestaña incorrecta");
    }

}
