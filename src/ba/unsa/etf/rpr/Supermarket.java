package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = null;
    private final int max = 1000;
    private static int brojArtikala = 0;

    public Supermarket() {
        this.artikli = new Artikl[max];
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

    public static int getBrojArtikala() {
        return brojArtikala;
    }

    public void dodajArtikl(Artikl a) {
        artikli[getBrojArtikala()] = new Artikl(a);
        brojArtikala++;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl temp = null;
        for (int i = 0; i < getBrojArtikala(); i++) {
            if (artikli[i].getKod().equals(kod)) {
                temp = artikli[i];
                artikli[i] = null;
                for(int j = i; j<artikli.length-1; j++) artikli[j] = artikli[j+1];
                brojArtikala--;
                break;
            }
        }
        return temp;
    }
}
