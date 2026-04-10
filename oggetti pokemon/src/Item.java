public abstract class Item extends HeldItem implements Medicine,Consumable{
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
    @Override
    public boolean equipped() {
        if (this.equipaggiato) {
            System.out.println("c'è gia qualcosa equipaggiato");
            return true;
        } else {
            System.out.println("libero");
            return false;
        }
    }

    @Override
    public void equipaggia(Item equipaggia) {
            this.item = equipaggia;
            this.equipaggiato=true;
    }

    @Override
    public void disequipaggia() {
        this.item=null;
        this.equipaggiato=false;
    }
}
