package Szachy;

public class Punkt {

    private char kolumna;
    private byte wiersz;

    public Punkt(char kolumna, byte wiersz) {
        this.kolumna = kolumna;
        this.wiersz = wiersz;
    }

    @Override
    public String toString() {
        return "Punkt: " + kolumna + wiersz;
    }
}
