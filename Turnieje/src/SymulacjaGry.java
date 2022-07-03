import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class SymulacjaGry {

    private Turniej[] turnieje = new Turniej[12];
    private Gracz[] gracze = new Gracz[10];

    SymulacjaGry() {
        Gracz[] gracze = new Gracz[10];
        gracze[0] = new Gracz("Marcin", "Najman");
        gracze[1] = new Gracz("Andrzej", "Gołota");
        gracze[2] = new Gracz("Tomasz", "Adamek");
        gracze[3] = new Gracz("Tyson", "Fury");
        gracze[4] = new Gracz("Floyd", "Mayweather");
        gracze[5] = new Gracz("Nate", "Diaz");
        gracze[6] = new Gracz("Conor", "McGregor");
        gracze[7] = new Gracz("Jon", "Jones");
        gracze[8] = new Gracz("Jan", "Błachowicz");
        gracze[9] = new Gracz("Israel", "Adesanya");

        Turniej[] turnieje = new Turniej[12];
        turnieje[0] = new Turniej("UFC", "Styczeń");
        turnieje[1] = new Turniej("KSW", "Luty");
        turnieje[2] = new Turniej("Gromda", "Marzec");
        turnieje[3] = new Turniej("FEN", "Kwiecień");
        turnieje[4] = new Turniej("FAME MMA", "Maj");
        turnieje[5] = new Turniej("UFC", "Czerwiec");
        turnieje[6] = new Turniej("KSW", "Lipiec");
        turnieje[7] = new Turniej("FAME MMA", "Sierpień");
        turnieje[8] = new Turniej("FEN", "Wrzesień");
        turnieje[9] = new Turniej("UFC", "Październik");
        turnieje[10] = new Turniej("KSW", "Listopad");
        turnieje[11] = new Turniej("UFC", "Grudzień");

        ArrayList<Integer> losoweMiejsca = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            losoweMiejsca.add(i);
        }

        for (int i = 0; i < gracze.length; i++) {
            gracze[i].setTur(turnieje);
        }

        for (int iloscTurniejow = 0; iloscTurniejow < turnieje.length; iloscTurniejow++) {
            Collections.shuffle(losoweMiejsca);
            for (int iloscGraczy = 0; iloscGraczy < gracze.length; iloscGraczy++) {
                gracze[iloscGraczy].setMiejsca(iloscTurniejow, losoweMiejsca.get(iloscGraczy));
            }
        }

        getBestFromTour(gracze,turnieje);

        mostFirst(gracze,turnieje);
        bestWithNoFirst(gracze,turnieje);

    }

    public void getBestFromTour(Gracz[] gracz, Turniej[] turniej) {
        String[] nazywTurniejow = {"UFC", "KSW", "Gromda", "FEN", "FAME MMA"};
        String wybor = (String) JOptionPane.showInputDialog(null, "Wybierz z których turniejów, chcesz znaleźć najlepszego zawodnika", null, JOptionPane.QUESTION_MESSAGE, null, nazywTurniejow, nazywTurniejow[0]);
        int sumaPunktow = 0;
        int tmp = 0;
        int najlepszyGracz = 0;

        for (int i = 0; i < gracz.length; i++) {
            tmp = 0;
            for (int j = 0; j < turniej.length; j++) {
                if (turniej[j].getNazwa().equals(wybor)){
                    tmp += gracz[i].ilePunktowZTurnieju(j);
                }
            }
            if (tmp > sumaPunktow){
                sumaPunktow = tmp;
                najlepszyGracz = i;
            }
        }

        System.out.println(gracz[najlepszyGracz].getGracz());

    }

    public void mostFirst(Gracz[] gracz,Turniej[] turniej){

        int tmp = 0, iloscPierwszych = 0, ktoryGracz = 0;

        for (int i = 0; i < gracz.length; i++) {
            tmp = 0;
            for (int j = 0; j < turniej.length; j++) {
                if (gracz[i].getMiejsce(j) == 1){
                    tmp++;
                }
            }
            if (tmp > iloscPierwszych){
                iloscPierwszych = tmp;
                ktoryGracz = i;
            }
        }

        System.out.println(gracz[ktoryGracz].getGracz());
    }

    public void bestWithNoFirst(Gracz[] gracz,Turniej[] turniej){

        int sumaPunktow = 0;
        int tmp = 0;
        int najlepszyGracz = 0;

        for (int i = 0; i < gracz.length; i++) {
            tmp = 0;
            for (int j = 0; j < turniej.length; j++) {
                if (gracz[i].getMiejsce(j) != 1){
                    tmp += gracz[i].ilePunktowZTurnieju(j);
                }
                else if (gracz[i].getMiejsce(j) == 1){
                    tmp = 0;
                    break;
                }
            }
            if (tmp > sumaPunktow){
                sumaPunktow = tmp;
                najlepszyGracz = i;
            }
        }
        System.out.println(gracz[najlepszyGracz].getGracz());
    }


}
