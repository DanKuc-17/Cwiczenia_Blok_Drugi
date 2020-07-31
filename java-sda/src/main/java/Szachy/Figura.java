package Szachy;

public abstract class Figura implements Porusza {

    private final String nazwa;
    private final Kolor kolor;
    protected Punkt punktNaSzachownicy;

    protected Figura(String nazwa, Kolor kolor, Punkt punktNaSzachownicy) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.punktNaSzachownicy = punktNaSzachownicy;
    }

    @Override
    public void zbij(Punkt punkt) {
        przesun(punkt);
        System.out.println("Zbijam figure na " + punkt);
    }

    @Override
    public String toString() {
        return "Figura: " + nazwa + ", "
                + kolor + ", " + punktNaSzachownicy;
    }
}
