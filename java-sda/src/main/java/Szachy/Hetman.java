package Szachy;

public class Hetman extends Figura {

    public Hetman(Kolor kolor, Punkt punktNaSzachownicy) {
        super("Hetman", kolor, punktNaSzachownicy);
    }

    @Override
    public void przesun(Punkt punkt) {
        System.out.println("Przesun z " + this.punktNaSzachownicy + " na " + punkt);
        this.punktNaSzachownicy = punkt;
    }

    @Override
    public void zbij(Punkt punkt) {
        super.zbij(punkt);
        System.out.println("Jestem Hetmanem");
    }
}

