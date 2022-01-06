package konto;

public class SparKonto extends Konto {

    public SparKonto(String inhaber) {
        super(inhaber);
    }

    @Override
    public String toString() {
        return "SparKonto{}";
    }

    public void auszahlen(double wert){
        if(getKontostand() - wert > 0){
            System.out.println("Das Limit wurde überschritten");
        }
        else{
            super.auszahlen(wert);
        }
    }


}
