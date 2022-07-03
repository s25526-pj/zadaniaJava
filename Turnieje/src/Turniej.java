public class Turniej {

    private final String nazwa;
    private final String miesiac;

    public Turniej(String nazwa, String miesiac) {
        this.nazwa = nazwa;
        this.miesiac = miesiac;
    }

    public String getTurniej(){
        return nazwa + " " + miesiac;
    }

    public String getNazwa() {
        return nazwa;
    }


}
