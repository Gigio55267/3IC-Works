public class Abbigliamento extends Prodotto {
    protected String taglia;
    public Abbigliamento(String nome, double prezzo,String taglia) {
            super(nome, prezzo);
            this.taglia=taglia;
        }
    @Override
    public String toString() {
        return "Prodotto di vestiario: "+" nome: "+super.nome+" prezzo: "+super.prezzo+" taglia: "+getTaglia();
    }

    public String getTaglia() {
        return taglia;
    }
    
}
