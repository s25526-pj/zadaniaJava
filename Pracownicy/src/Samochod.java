public class Samochod {
    private final String marka;
    private final String model;
    private int przebieg;

    public Samochod(String model,String marka){
        this.model = model;
        this.marka = marka;
    }

    public String getSamochod() {
        return model+ " " + marka + " ";
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }
}
