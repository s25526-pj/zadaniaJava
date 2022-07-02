public class Main {
    public static void main(String[] args) {

        String[] listaImion = {"Asia","Tomek","Dariusz","Jan","Michal"};
        int[] listaLiczb = {3,4,6,1,9};

        zwrocImiona(listaImion,listaLiczb);

    }

     static void zwrocImiona(String[] imiona, int[] liczby){
        boolean praca = true;
        int miejsceImion = 0;

        while (praca){
            for (int j : liczby) {
                if (imiona[miejsceImion].length() == j) {
                    System.out.println(imiona[miejsceImion]);
                }
            }
            miejsceImion++;
            if (miejsceImion == 5){
                praca = false;
            }
        }

    }

}
