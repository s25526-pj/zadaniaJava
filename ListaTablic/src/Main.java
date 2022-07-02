import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<String[]> listaTablic = new ArrayList<>();

        String[] imiona = {"Asia","Basia","Tomek","Janek"};
        String[] jedzenie = {"Pizza","Zupa","Zapiekanka","Czekolada"};
        String[] auta = {"Sedan","Kombi","Coupe","Suv"};

        listaTablic.add(imiona);
        listaTablic.add(jedzenie);
        listaTablic.add(auta);

        System.out.println(zworcDlogosc(listaTablic));
    }

    public static int zworcDlogosc(ArrayList<String[]> listaTablic){

        int dlugosc = 0;
        String kolejneTablice;

        for (int i = 0; i < listaTablic.size(); i++) {

            kolejneTablice = Arrays.toString(listaTablic.get(i));
            dlugosc += kolejneTablice.length();

        }
        return dlugosc;
    }

}
