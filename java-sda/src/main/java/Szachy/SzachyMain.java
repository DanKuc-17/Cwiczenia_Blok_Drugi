package Szachy;

import java.util.ArrayList;
import java.util.List;

public class SzachyMain {

    public static void main (String[] args){

        List<Figura> figury = new ArrayList<>(40);

        Pion pion1 = new Pion(Kolor.BIALE, new Punkt('C', (byte) 2));
        Pion pion2 = new Pion(Kolor.CZARNE, new Punkt('D', (byte) 8));

        Hetman hetman1 = new Hetman(Kolor.BIALE, new Punkt('D', (byte) 4));
        Hetman hetman2 = new Hetman(Kolor.CZARNE, new Punkt('H', (byte) 4));

        figury.add(pion1);
        figury.add(pion2);
        figury.add(hetman1);
        figury.add(hetman2);

        System.out.println("Przesuwanie");
        for (Figura figura:figury){
            figura.przesun(new Punkt('D', (byte) 5));
        }
        System.out.println("Zbijanie");
        for (Figura figura:figury){
            figura.przesun(new Punkt('D', (byte) 5));
        }

    }
}

