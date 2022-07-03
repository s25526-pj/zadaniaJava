import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listaIm = new ArrayList<>();
        listaIm.add("Asia");
        listaIm.add("Tomek");
        listaIm.add("Dariusz");
        listaIm.add("Jan");
        listaIm.add("Michał");

        List<Integer> listLi = new ArrayList<>();
        listLi.add(3);
        listLi.add(4);
        listLi.add(6);
        listLi.add(1);
        listLi.add(9);

        System.out.println(zwrocImiona(listaIm,listLi));

    }

     static List<String> zwrocImiona(List<String> listaStringow, List<Integer> listaIntow){

        List<String> listaDoZwrocenia = new ArrayList<>();

         for (String tmp : listaStringow) {
             for (Integer integer : listaIntow) {
                 if (tmp.length() == integer) {
                     listaDoZwrocenia.add(tmp);
                 }
             }
         }

        return listaDoZwrocenia;
    }

}
