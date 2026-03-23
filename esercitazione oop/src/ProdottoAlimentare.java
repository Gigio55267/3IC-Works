public class ProdottoAlimentare extends Prodotto {
    protected double calorie;
    protected boolean refirigerazione;
    public ProdottoAlimentare(String name, double costo,double calorie, boolean refirigerazione) {
        super(name, costo);
        this.calorie = calorie;
        this.refirigerazione = refirigerazione;
    }
    public double getCalorie() {
        return calorie;
    }
    public boolean isRefirigerazione() {
        return refirigerazione;
    }
    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }
    public void setRefirigerazione(boolean refirigerazione) {
        this.refirigerazione = refirigerazione;
    }
    @Override
    public String toString() {
        return "Prodotto Alimentare: "+" nome: "+super.nome+" prezzo: "+super.prezzo+" calorie: "+getCalorie()+" refrigerazione: "+isRefirigerazione();
    }
    
}
