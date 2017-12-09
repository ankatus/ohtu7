package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends Peli {

    public KPSPelaajaVsPelaaja() {
        super();
    }

    @Override
    protected String tokanSiirto(String ekanSiirto) {
        System.out.println("Toisen pelaajan siirto: ");
        String siirto = scanner.nextLine();
        return siirto;
    }

}