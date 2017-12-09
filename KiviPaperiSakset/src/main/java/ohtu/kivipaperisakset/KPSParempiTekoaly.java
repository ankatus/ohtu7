package ohtu.kivipaperisakset;

import java.util.Scanner;

import java.util.Scanner;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends Peli {

    private TekoalyParannettu tekoaly;

    public KPSParempiTekoaly() {
        super();
        tekoaly = new TekoalyParannettu(20);
    }

    @Override
    protected String tokanSiirto(String ekanSiirto) {
        String siirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + siirto);
        tekoaly.asetaSiirto(ekanSiirto);
        return siirto;
    }
}
