public class Elettronico extends Prodotto implements Scontabile {
    protected int garanziaMesi;

    public Elettronico(String nome, double prezzo, int garanzia) {
        super(nome, prezzo);
        this.garanziaMesi = garanzia;
    }

    public int getGaranzia() {
        return garanziaMesi;
    }

    @Override
    public String toString() {
        return "Prodotto Eletronico: " + " nome: " + nome + " prezzo: " + prezzo + "€ garanzia: "
                + getGaranzia();
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
