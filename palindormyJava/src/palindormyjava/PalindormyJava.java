
package palindormyjava;

import java.io.*;
import java.util.Scanner;

public class PalindormyJava {
   
    public static void main(String[] args) throws IOException {
        
        File palindromy = new File("palindromy.txt");
        BufferedReader czytaj = new BufferedReader(new FileReader(palindromy));
        Scanner odczytPliku = new Scanner(palindromy);
        String linia;

        while ((linia = czytaj.readLine()) != null){
            StringBuilder odTylu = new StringBuilder(linia);
            odTylu = odTylu.reverse();
            if (odTylu.toString().equals(linia)){
                System.out.println(linia);
            }
        }
    }
   
}
