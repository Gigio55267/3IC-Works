public class Elettronico extends Prodotto {
    protected  int garanziaMesi;
    public Elettronico(String nome, double prezzo,int garanzia) {
            super(nome, prezzo);
            this.garanziaMesi=garanzia;
        }
    
        public int getGaranzia() {
            return garanziaMesi;
        }
    
    @Override
    public String toString() {
        return "Prodotto Eletronico: "+" nome: "+super.nome+" prezzo: "+super.prezzo+" garanzia: "+getGaranzia();
    }
    
}
