public class Digitale extends Prodotto implements Scontabile, Spedibile {

    public Digitale(String nome, double prezzo) {
        super(nome, prezzo);
    }

    @Override
    public void applicaSconto(int percentuale) {
        prezzo -= ((prezzo * 20) / 100);
    }

    @Override
    public double getPrezzoAttuale() {
        return prezzo;
    }

    @Override
    public String toString() {
        return nome+" (digitale): " + getPrezzoAttuale() + "€";// da finire
    }

    @Override
    public double calcolaSpese() {
        return 0.0;
    }

    @Override
    public String corriere() {
        return "dowload diretto";
    }

}
