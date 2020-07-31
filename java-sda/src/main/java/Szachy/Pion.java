package Szachy;

public class Pion extends Figura {

    public Pion(Kolor kolor, Punkt punktNaSzachownicy) {
        super("Pion", kolor, punktNaSzachownicy);
    }

    @Override
    public void przesun(Punkt punkt) {
        System.out.println("Przesun z " + this.punktNaSzachownicy + " na " + punkt);
        this.punktNaSzachownicy = punkt;
    }

    @Override
    public void zbij(Punkt punkt) {
        super.zbij(punkt);
        System.out.println("Jestem Pionem");
    }
}
