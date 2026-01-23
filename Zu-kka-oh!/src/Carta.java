public class Carta {
    private String nome;
    private int puntiVita;
    private int atk;
    private int def;
    private static String [] prefissi={
    "Drago", "Lupo", "Tigre", "Serpente", "Aquila","Golem", "Spirito", "Ombra",
    "Fuoco", "Ghiaccio","Tuono", "Terra", "Vento", "Luce", "Oscuro"
    };
    private static String[] suffissi = {
    "Antico", "Furioso", "Mistico", "Selvaggio", "Celeste","Infernale","Glaciale",
    "Tonante","Sacro", "Maledetto","Supremo", "Eterno", "Fatale", "Divino", "Spettrale"
    };
    public Carta() {
        this.nome = nome;
        this.puntiVita = creaStatistiche();
        this.atk = creaStatistiche();
        this.def = creaStatistiche();
    }
    public String getNome() {
        return nome;
    }
    public int getPuntiVita() {
        return puntiVita;
    }
    
    public int getAtk() {
        return atk;
    }
    
    public int getDef() {
        return def;
    }
    public static int creaStatistiche(){
        int stat=(int)Math.random()*(50-0)+0;
        return stat;
    }
    
}
