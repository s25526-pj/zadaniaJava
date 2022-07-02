public class Produkt {

    private final String nazwa;
    private final int cena;

    public Produkt(String nazwa, int cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public int getCena(){
        return cena;
    }
    public String getNazwa(){
        return this.nazwa;
    }


}
