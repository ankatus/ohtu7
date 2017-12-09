package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends Peli {

    private Tekoaly tekoaly;

    public KPSTekoaly() {
        super();
        tekoaly = new Tekoaly();
    }

    @Override
    protected String tokanSiirto(String ekanSiirto) {
        String siirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + siirto);
        return siirto;
    }
}