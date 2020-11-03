package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    private static Supermarket supermarket;
    private static Artikl artikl;

    @BeforeAll
    static void setUp() {
        artikl = new Artikl("Biciklo", 1000, "666");
        supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "3"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "4"));
    }

    @Test
    void izbaciArtiklSaKodom() {
        supermarket.dodajArtikl(artikl);
        int broj = supermarket.getBrojArtikala();
        supermarket.izbaciArtiklSaKodom("2");
        assertEquals(broj-1, supermarket.getBrojArtikala());

    }

    @Test
    void dodajArtikl() {

        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "3"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "4"));

        assertEquals(8, supermarket.getBrojArtikala());

    }
}