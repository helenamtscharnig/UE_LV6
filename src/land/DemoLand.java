package land;

public class DemoLand {
    public static void main(String[] args) {


        Bundesland bl1 = new Bundesland(1000000);
        Bundesland bl2 = new Bundesland(2000000);

        Bundesstaat aut = new Bundesstaat();
        aut.addLand(bl1);
        aut.addLand(bl2);

        System.out.println("BSP von AUT: "+aut.getBruttoSozialProdukt());

    }

}
