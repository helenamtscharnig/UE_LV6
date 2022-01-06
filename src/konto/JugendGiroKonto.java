package konto;

public class JugendGiroKonto extends GiroKonto {

    private double buchungslimit;

    public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
        super(inhaber, limit);
        this.buchungslimit = buchungslimit;
    }

    @Override
    public String toString() {
        return "JugendGiroKonto{" +
                "buchungslimit=" + buchungslimit +
                '}';
    }

    public void auszahlen (double wert){
        if (wert > buchungslimit) {
            System.out.println("Wert pro Buchung überschritten");
        }
        else{
            super.auszahlen(wert);
        }
    }


}
