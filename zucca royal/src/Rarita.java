import java.util.ArrayList;

public class Rarita {
    private final String rarity;
    private double percentuale;
    private ArrayList<Rarita> probabilita = new ArrayList<Rarita>();

    public Rarita(String rar, double percentuale) {
        this.percentuale = percentuale;
        this.rarity = rar;
    }

    public void correggiProbabiliita(Rarita b) {
        for (int j = 0; j < probabilita.size(); j++) {
            if (!probabilita.get(j).getRarity().equals(b.getRarity())) {
                double perc=((b.getPercentuale() * probabilita.get(j).getPercentuale()) / 100);
                probabilita.get(j).setPercentuale(probabilita.get(j).getPercentuale()-perc);
            }
        }

    }

    public String getRarity() {
        return rarity;
    }

    public ArrayList<Rarita> getProbabilita() {
        return probabilita;
    }

    public void setPercentuale(double percentuale) {
        this.percentuale = percentuale;
    }

    
    public void stampa() {
       for (int i = 0; i < probabilita.size(); i++) {
        System.out.println("rarita: "+probabilita.get(i).getRarity()+"  probabilita: "+probabilita.get(i).getPercentuale()+"%");
       }
    }

    public double getPercentuale() {
        return percentuale;
    }

    public void aggiungirarita(Rarita b) {
        Rarita e =new Rarita(b.getRarity(), b.getPercentuale());
        probabilita.add(e);
    }

    public static void main(String[] args) {
        Rarita c = new Rarita("ultra", 3.0);
        Rarita p = new Rarita("comunista", 22.0);
        Rarita k = new Rarita("mitico", 15.0);
        Rarita m = new Rarita("comune", 60.0);
        Rarita l = new Rarita("leggendario", 1.0);
        m.aggiungirarita(m);
        m.aggiungirarita(c);
        m.aggiungirarita(p);
        m.aggiungirarita(k);
        m.aggiungirarita(l);
        m.correggiProbabiliita(l);
        
        m.stampa();
    }

}
