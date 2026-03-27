public class Abbigliamento extends Prodotto implements Scontabile {
    protected String taglia;

    public Abbigliamento(String nome, double prezzo, String taglia) {
        super(nome, prezzo);
        this.taglia = taglia;
    }

    @Override
    public String toString() {
        return "Prodotto di vestiario: " + " nome: " + nome + " prezzo: " + prezzo + "€ taglia: "
                + getTaglia();
    }

    public String getTaglia() {
        return taglia;
    }

    @Override
    public void applicaSconto(int percentuale) {
        prezzo -= ((prezzo * 20) / 100);
    }

    @Override
    public double getPrezzoAttuale() {
        return prezzo;
    }
}
