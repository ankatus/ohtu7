package ohtu.kivipaperisakset;

public class PeliTehdas {

    public static Peli luoTekoalyPeli() {
        return new KPSTekoaly();
    }

    public static Peli luoPelaajaVsPelaajaPeli() {
        return new KPSPelaajaVsPelaaja();
    }

    public static Peli luoParempiTekoalyPeli() {
        return new KPSParempiTekoaly();
    }
}
