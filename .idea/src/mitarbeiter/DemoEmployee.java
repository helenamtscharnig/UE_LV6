package mitarbeiter;

public class DemoEmployee {
    public static void main(String[] args) {
        Employee e1 = new FixCommissionEmployee("Tscharnig", "Helena", "BPS", 3000.0,300.0);

        System.out.println("Gehalt: "+ e1);

    }


}
