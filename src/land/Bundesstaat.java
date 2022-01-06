package land;

import java.util.ArrayList;

public class Bundesstaat extends Land {
    private ArrayList<Land> laender = new ArrayList<>();

    public Bundesstaat() {
        this.laender = laender;
    }

    public ArrayList<Land> getLaender() {
        return laender;
    }

    public void addLand (Land l){
        laender.add(l);
    }

    public double getBruttoSozialProdukt(){
        double bsp = 0;
        for(Land l : laender){
            bsp += l.getBruttoSozialProdukt();
        }
        return bsp;
    }




}
