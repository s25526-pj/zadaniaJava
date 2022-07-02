public class Turniej {

    private final String nazwa;
    private final String miesiac;
    private int miejsce;
    private int punkty;


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

    public int getMiejsce() {
        return miejsce;
    }

    public void setMiejsceIPunkty(int miejsce) {
        this.miejsce = miejsce;
        if (miejsce != 0) {
            switch (miejsce) {
                case 1:
                    punkty = 100;
                    break;
                case 2:
                    punkty = 80;
                    break;
                case 3:
                    punkty = 60;
                    break;
                case 4:
                    punkty = 40;
                    break;
                case 5:
                    punkty = 20;
                    break;
                default:
                    punkty = 0;
                    break;
            }
        }

    }

    public int getPunkty() {
        return punkty;
    }

//    public int setPunkty(int miejsce) {
//        this.getMiejsce();
//        if (miejsce != 0) {
//            switch (miejsce) {
//                case 1:
//                    punkty = 100;
//                case 2:
//                    punkty = 80;
//                case 3:
//                    punkty = 60;
//                case 4:
//                    punkty = 40;
//                case 5:
//                    punkty = 20;
//                default:
//                    punkty = 0;
//            }
//        }
//            return punkty;
//
//    }
}
