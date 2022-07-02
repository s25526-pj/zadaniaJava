import java.util.*;

public class Main {
    public static void main(String[] args) {

        Produkt[] listaProduktow = new Produkt[5];
        listaProduktow[0] = new Produkt("Mleko", 3);
        listaProduktow[1] = new Produkt("Chleb", 4);
        listaProduktow[2] = new Produkt("Masło", 7);
        listaProduktow[3] = new Produkt("Woda", 2);
        listaProduktow[4] = new Produkt("Jajka", 8);

        Klient[] listaKlientow = new Klient[6];
        listaKlientow[0] = new Klient("Marek","Mostowiak",losujProdukty(listaProduktow));
        listaKlientow[1] = new Klient("Mieczysław","Krzeczysław",losujProdukty(listaProduktow));
        listaKlientow[2] = new Klient("Kasia","Noga",losujProdukty(listaProduktow));
        listaKlientow[3] = new Klient("Mariusz","Szybki",losujProdukty(listaProduktow));
        listaKlientow[4] = new Klient("Stanisława","Kulawa",losujProdukty(listaProduktow));
        listaKlientow[5] = new Klient("Iwona","Przepocona",losujProdukty(listaProduktow));

        ktoWydalNajwiecej(listaKlientow);
        for (Klient klient : listaKlientow) {
            klient.getUlubionyProdukt(listaProduktow);
        }

        Pracownik[] listaPracownikow = new Pracownik[6];
        listaPracownikow[0] = new Pracownik("Jaś","Kapturek","Leśna 1",4000);
        listaPracownikow[1] = new Pracownik("Małgosia","Samosia","Miła 2a",3600);
        listaPracownikow[2] = new Pracownik("Szymon","Tymon","Krótka 29",9000);
        listaPracownikow[3] = new Pracownik("Roman","Hooman","Znana 11",5000);
        listaPracownikow[4] = new Pracownik("Kuba","Śruba","Piękna 65",3000);
        listaPracownikow[5] = new Pracownik("Sebastian","Kawka","Miejska 17",10000);

        najlepiejZarabiajacy(listaPracownikow);

        Samochod[] listaAut = new Samochod[4];
        listaAut[0] = new Samochod("Audi","A5");
        listaAut[1] = new Samochod("BMW","3");
        listaAut[2] = new Samochod("Toyota","Corolla");
        listaAut[3] = new Samochod("Skoda","Octavia");

        for (Pracownik pracownik : listaPracownikow) {
            System.out.println(pracownik.getImie());
            pracownik.jadeAutem(listaAut);
        }

        listaPracownikow[5].getDaneAuto(2);

    }

    public static Produkt[] losujProdukty(Produkt[] listaProduktow){


        Random random = new Random();
        Produkt[] listaZakupow = new Produkt[8];

        for (int i = 0; i < 8; i++) {
            int a = random.nextInt(5);
            listaZakupow[i] = listaProduktow[a];
        }
        return listaZakupow;
    }

    public static void ktoWydalNajwiecej(Klient[] listaKlientow){

        int tmp = listaKlientow[0].getWydanePieniadze();
        int klient = 0;

        for (int i = 1; i < listaKlientow.length; i++) {
            if (tmp < listaKlientow[i].getWydanePieniadze()){
                tmp = listaKlientow[i].getWydanePieniadze();
                klient = i;
            }
        }
        System.out.println("Najwięcej wydał/a: " + listaKlientow[klient].getImie());
    }

    public static void najlepiejZarabiajacy(Pracownik[] pracownicy){
        List<Pracownik> prac = new ArrayList<>();

        Collections.addAll(prac, pracownicy);

        Collections.sort(prac, Comparator.comparingInt(Pracownik::getPenjsa));

        System.out.println(prac.get(5).getImie() + " " +prac.get(5).getPenjsa());
        System.out.println(prac.get(4).getImie() + " " +prac.get(4).getPenjsa());
        System.out.println(prac.get(3).getImie() + " " +prac.get(3).getPenjsa());


        }




    }


