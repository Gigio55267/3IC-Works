public abstract class Prodotto {
    protected String nome;
    protected double prezzo;

    public Prodotto(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public void applicaIVA(double liquota) {
        prezzo = (prezzo + (prezzo / 100 * liquota));
    }

    public abstract String toString();
}
