public class Gracz {
    private final String imie;
    private final String nazwisko;
    private int overallScore;
    private int score;
    public Turniej[] trn = new Turniej[12];


    public Gracz(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public String getGracz(){
        return imie + " " + nazwisko;
    }
    public void getAllPozycje(){
        System.out.println(this.getGracz());
        for (int i = 0; i < trn.length; i++) {
            System.out.println(trn[i].getNazwa() + " Miejsce: "+trn[i].getMiejsce());
        }
    }
    public void getIlePunktowNaDanycmTurnieju(){
        System.out.println(this.getGracz());
        for (int i = 0; i < trn.length; i++) {
            System.out.println(trn[i].getNazwa() + " Punkty: "+trn[i].getPunkty());
        }
    }
    public void getFullScore(){
        for (int i = 0; i < trn.length; i++) {
            this.overallScore += trn[i].getPunkty();
        }
        System.out.println(this.getGracz() + ", Punkty: " + overallScore);
    }
    public int getScoreFrom1Tour(int numerTurnieju){
        this.score = trn[numerTurnieju].getPunkty();
        return score;
    }

}

