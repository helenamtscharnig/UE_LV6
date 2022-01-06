package konto;

public class KontoDemo {

    public static void main(String[] args) {
        GiroKonto g1 = new GiroKonto("Helena Tscharnig", 1000.0);
        Konto k1 = new Konto("Markus Tscharnig");
        SparKonto s1 = new SparKonto("Elisabeth Tscharnig");
        JugendGiroKonto jg1 = new JugendGiroKonto("Johannes Tscharnig", 400.0, 200.0);

        System.out.println(g1.getKontostand());
        g1.auszahlen(200);
        System.out.println(g1.getKontostand());
        System.out.println(".....");

        System.out.println(k1.getKontostand());
        k1.einzahlen(500);
        System.out.println(k1.getKontostand());
        System.out.println(".....");

        System.out.println(s1.getKontostand());
        s1.auszahlen(200);
        System.out.println(s1.getKontostand());
        System.out.println(".....");


    }


}
