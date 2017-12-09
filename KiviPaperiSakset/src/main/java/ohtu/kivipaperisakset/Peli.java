package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class Peli {

    protected Scanner scanner;
    protected Tuomari tuomari;

    public Peli() {
        scanner = new Scanner(System.in);
        tuomari = new Tuomari();
    }

    public void pelaa() {
        Tekoaly tekoaly = new Tekoaly();

        System.out.print("Ensimmäisen pelaajan siirto: ");
        String ekanSiirto = scanner.nextLine();

        String tokanSiirto = tokanSiirto(ekanSiirto);


        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();

            System.out.println("Ensimmäisen pelaajan siirto: ");
            ekanSiirto = scanner.nextLine();

            tokanSiirto = tokanSiirto(ekanSiirto);
        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

    protected abstract String tokanSiirto(String ekanSiirto);

    protected static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
}
