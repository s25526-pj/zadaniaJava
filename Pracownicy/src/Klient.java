
public class Klient {

    private final String imie;
    private final String nazwisko;
    public Produkt[] listaZakupow;



    public Klient(String imie, String nazwisko,Produkt[] listaZakupow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZakupow = listaZakupow;
    }


    public void getUlubionyProdukt(Produkt[] listaProduktow){

        int najwyzszy = 0;
        String nazwaNajwyzszego = new String();

        int aktualny;

        for (Produkt produkt : listaProduktow) {
            aktualny = 0;
            for (Produkt value : listaZakupow) {
                if (produkt.getNazwa().equals(value.getNazwa())) {
                    aktualny++;
                    if (aktualny != 0 && aktualny > najwyzszy) {
                        najwyzszy = aktualny;
                        nazwaNajwyzszego = produkt.getNazwa();
                    }
                }
            }

        }

        System.out.println("Ulubiony produkt to: " + nazwaNajwyzszego);
    }

    public int getWydanePieniadze(){

        int wydanePieniadze = 0;

        for (Produkt produkt : listaZakupow) {
            wydanePieniadze += produkt.getCena();
        }

        return wydanePieniadze;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
}
