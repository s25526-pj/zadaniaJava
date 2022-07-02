import java.util.Random;


public class Pracownik implements Comparable {

    private final String imie;
    private final String nazwisko;
    private final String adres;
    private final int penjsa;
    private Samochod[] jazdaAutem;

    public Pracownik(String imie,String nazwisko, String adres, int pensja){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.penjsa = pensja;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public int getPenjsa() {
        return penjsa;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public void jadeAutem(Samochod[] listaAut){
        this.jazdaAutem = listaAut;

        for (int i = 0; i < 5; i++) {
            Random r1 = new Random();
            Random r2 = new Random();
            int jakimAutem = r1.nextInt(listaAut.length);
            int ileKilometrow = r2.nextInt(400);
            jazdaAutem[jakimAutem].setPrzebieg(ileKilometrow);
            if (jazdaAutem[jakimAutem].getPrzebieg() != 0){
                jazdaAutem[jakimAutem].setPrzebieg(jazdaAutem[jakimAutem].getPrzebieg() + ileKilometrow);
            }
        }
        for (Samochod samochod : jazdaAutem) {
            System.out.println(samochod.getSamochod() + samochod.getPrzebieg());
        }
    }

    public void getDaneAuto(int ktoreAuto){
        System.out.println(jazdaAutem[ktoreAuto].getSamochod() + jazdaAutem[ktoreAuto].getPrzebieg());
    }

}
