import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SymulacjaGry {

    private Turniej[] turnieje = new Turniej[12];
    private Gracz[] gracze = new Gracz[10];

    SymulacjaGry(){
        Gracz[] gracze = new Gracz[10];
        gracze[0] = new Gracz("Marcin","Najman");
        gracze[1] = new Gracz("Andrzej","Gołota");
        gracze[2] = new Gracz("Tomasz","Adamek");
        gracze[3] = new Gracz("Tyson","Fury");
        gracze[4] = new Gracz("Floyd","Mayweather");
        gracze[5] = new Gracz("Nate","Diaz");
        gracze[6] = new Gracz("Conor","McGregor");
        gracze[7] = new Gracz("Jon","Jones");
        gracze[8] = new Gracz("Jan","Błachowicz");
        gracze[9] = new Gracz("Israel","Adesanya");

        List<Gracz> listaGraczy = new ArrayList<>();
        for (Gracz gracz:gracze) {
            listaGraczy.addAll(List.of(gracze));
        }

        Turniej[] turnieje = new Turniej[12];
        turnieje[0] = new Turniej("UFC","Styczeń");
        turnieje[1] = new Turniej("KSW","Luty");
        turnieje[2] = new Turniej("Gromda","Marzec");
        turnieje[3] = new Turniej("FEN","Kwiecień");
        turnieje[4] = new Turniej("FAME MMA","Maj");
        turnieje[5] = new Turniej("UFC","Czerwiec");
        turnieje[6] = new Turniej("KSW","Lipiec");
        turnieje[7] = new Turniej("FAME MMA","Sierpień");
        turnieje[8] = new Turniej("FEN","Wrzesień");
        turnieje[9] = new Turniej("UFC","Październik");
        turnieje[10] = new Turniej("KSW","Listopad");
        turnieje[11] = new Turniej("UFC","Grudzień");

        List<Turniej> listaTurniejow = new ArrayList<>();
        for (Turniej turniej:turnieje) {
            listaTurniejow.addAll(List.of(turnieje));
        }

        ArrayList<Integer> losoweMiejsca = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            losoweMiejsca.add(i);
        }



        for (int iloscTurniejow = 0; iloscTurniejow < turnieje.length; iloscTurniejow++) {
            Collections.shuffle(losoweMiejsca);
            for (int iloscGraczy = 0; iloscGraczy < gracze.length; iloscGraczy++) {
                listaGraczy.get(iloscGraczy).trn[iloscTurniejow] = listaTurniejow.get(iloscTurniejow);
                listaGraczy.get(iloscGraczy).trn[iloscTurniejow].setMiejsceIPunkty(losoweMiejsca.get(iloscGraczy));
            }
        }

        System.out.println(losoweMiejsca.get(0));
        System.out.println(losoweMiejsca.get(9));
        listaGraczy.get(1).getAllPozycje();
        listaGraczy.get(2).getAllPozycje();

       // getBestFromTour(listaGraczy,listaTurniejow);

    }

    public void getBestFromTour(List<Gracz> graczList,List<Turniej> turniejList){
        String[] turnieje = {"UFC","KSW","Gromda","FEN","FAME MMA"};
        String wybor = (String) JOptionPane.showInputDialog(null,"Wybierz z których turniejów, chcesz znaleźć najlepszego zawodnika",null,JOptionPane.QUESTION_MESSAGE,null,turnieje,turnieje[0]);

        for (int i = 0; i < turnieje.length; i++) {
            if (turniejList.get(i).getNazwa().equals(wybor)){
                for (int j = 0; j < gracze.length; j++) {
                    System.out.println(graczList.get(j).getScoreFrom1Tour(i));
                }
            }
        }

    }

}
