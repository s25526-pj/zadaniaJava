public class Gracz {
    private final String imie;
    private final String nazwisko;
    private Integer[] miejsca = new Integer[12];
    private Turniej[] tur = new Turniej[12];
    private int punktyZturnieju;
    private int allScore;

    public Gracz(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public String getGracz(){
        return imie + " " + nazwisko;
    }
    public Integer getMiejsce(int zKtoregoTurnieju) {
        return miejsca[zKtoregoTurnieju];
    }
    public int[] getAllMiejsca(){
        int[] tmp = new int[12];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = miejsca[i];
        }
        return tmp;
    }

    public void setMiejsca(int ktoryTurniej,Integer ktoreMiejsce) {
        miejsca[ktoryTurniej] = ktoreMiejsce;
    }

    public void setTur(Turniej[] tur) {
        this.tur = tur;
    }

    public int ilePunktowZTurnieju(int ktoryTurniej){

        int tmp = miejsca[ktoryTurniej];

        switch (tmp) {
            case 1 -> punktyZturnieju = 100;
            case 2 -> punktyZturnieju = 80;
            case 3 -> punktyZturnieju = 60;
            case 4 -> punktyZturnieju = 40;
            case 5 -> punktyZturnieju = 20;
            default -> punktyZturnieju = 0;
        }

        return punktyZturnieju;
    }

    public void jakieMiejsceWjakimTurnieju(){
        for (int i = 0; i < tur.length; i++) {
            System.out.println(tur[i].getNazwa() + " Miejsce " + miejsca[i]);
        }
    }

    public int sumaPunktow(){
        for (int i = 0; i < tur.length; i++) {
            allScore += ilePunktowZTurnieju(i);
        }
        return allScore;
    }

}

