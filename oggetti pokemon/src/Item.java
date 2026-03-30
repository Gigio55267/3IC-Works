public abstract class Item implements Medicine{
    protected final String NOME;
    protected final String DESCRIZIONE;
    protected int quantita;
    protected final int STAK;

    public Item(String nome, String dESCRIZIONE, int stak, int quantita) {
        this.NOME = nome;
        DESCRIZIONE = dESCRIZIONE;
        this.quantita = quantita;
        STAK = stak;
    }

    @Override
    public String toString() {
        return "Item [NOME=" + NOME + ", quantita=" + quantita + "]";
    }
}
