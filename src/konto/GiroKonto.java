package konto;

public class GiroKonto extends Konto {

    private double limit;

    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "GiroKonto{" +
                "limit=" + limit +
                '}';
    }

    public void auszahlen (double wert){
        if(getKontostand() - wert < (limit*-1)){
            System.out.println("Limit überschritten");
        }
        else{
            super.auszahlen(wert);
        }
    }


}
