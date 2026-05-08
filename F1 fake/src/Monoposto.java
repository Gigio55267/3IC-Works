import java.util.ArrayList;

public class Monoposto {
    private int numerogare;
    private String pilotatitolare;
    protected ArrayList<Componente> componenti;
    public Monoposto(int numerogare, String pilotatitolare) {
        this.numerogare = numerogare;
        this.pilotatitolare = pilotatitolare;
    }
    public void aggiungiComponente(Componente comp){
        componenti.add(comp);
    }
    public void rimuoviomponente(Componente comp){
        componenti.remove(comp);
    }
    public int getNumerogare() {
        return numerogare;
    }
    public String getPilotatitolare() {
        return pilotatitolare;
    }
    public double pesoTotale(){
        return 0.0;
    }
    public double prezzoTotale(){
        return 0.0;
    }
}
