package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    private static Artikl artikl;
    private Korpa korpa;
    @BeforeAll
    static void setUp() {
        artikl = new Artikl("Biciklo", 1000, "666");
    }
    @Test
    void dodajArtiklTest() {
        korpa = new Korpa();
        assertTrue(korpa.dodajArtikl(artikl));
    }

    @Test
    void pogresnoDodajArtiklTest() {
        korpa = new Korpa();
        for (int i = 0; i < 50; i++) {
            korpa.dodajArtikl(new Artikl("Biciklo", 1000, String.valueOf(i+1)));
        }
        assertFalse(korpa.dodajArtikl(artikl));
    }

    @Test
    void dajUkupnuCijenuArtikalaTest() {
        korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "3"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "4"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "5"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "6"));
        assertEquals(6000, korpa.dajUkupnuCijenuArtikala());
    }


}