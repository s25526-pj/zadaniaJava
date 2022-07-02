import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        String[] brzydkieSlowa = {"Kurde", "Kurczę", "Kurka"};

        File plik = new File("Slownik.txt");
        BufferedReader czytanieSlownika = new BufferedReader(new FileReader(plik));
        BufferedWriter pisanieSlownika = new BufferedWriter(new FileWriter("Slownik-poprawiony.txt"));


        String aktualnaLinia;
        while ((aktualnaLinia = czytanieSlownika.readLine()) != null) {
            if (sprawdzCzyBrzydkie(aktualnaLinia,brzydkieSlowa) != aktualnaLinia){
                pisanieSlownika.write(sprawdzCzyBrzydkie(aktualnaLinia,brzydkieSlowa));
                pisanieSlownika.newLine();
            }
            else {
                pisanieSlownika.write(aktualnaLinia);
                pisanieSlownika.newLine();
            }
        }
        czytanieSlownika.close();
        pisanieSlownika.close();

    }
    public static String sprawdzCzyBrzydkie (String slowo, String[]zamiana){

        for (int i = 0; i < zamiana.length; i++) {
            if (slowo.contains(zamiana[i])) {
                slowo = slowo.replace(zamiana[i], "*****");
            }
        }

        return slowo;
    }
}
