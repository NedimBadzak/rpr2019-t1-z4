package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = null;
    private final int max = 50;
    private int velicinaKorpe = 0;

    public Korpa() {
        artikli = new Artikl[max];
    }
    public Artikl[] getArtikli() {
        return artikli;
    }

    public void setArtikli(Artikl[] artikli) {
        this.artikli = artikli;
    }

    public int getMax() {
        return max;
    }

    public int getVelicinaKorpe() {
        return velicinaKorpe;
    }

    public boolean dodajArtikl(Artikl a) {
        if(getVelicinaKorpe() < max) {
            artikli[getVelicinaKorpe()] = new Artikl(a);
            velicinaKorpe++;
            return true;
        }
        return false;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl temp = null;
        for (int i = 0; i < getVelicinaKorpe(); i++) {
            if (this.artikli[i].getKod().equals(kod)) {
                temp = artikli[i];
                artikli[i] = null;
            }
        }
        return temp;
    }

    public int dajUkupnuCijenuArtikala() {
        int zbir = 0;
        for (int i = 0; i < getVelicinaKorpe(); i++) {
            if(artikli[i] != null) zbir = zbir + artikli[i].getCijena();
        }
        return zbir;
    }
}
