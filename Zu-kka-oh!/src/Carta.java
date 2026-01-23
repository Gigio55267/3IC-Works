public class Carta {
    private final String nome;
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
    private int getDef;
    public Carta() {
        this.nome = creaNome(prefissi, suffissi);
        this.puntiVita = creaStatistiche()[0];
        this.atk = creaStatistiche()[1];
        this.def = creaStatistiche()[2];
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
    public static int[] creaStatistiche(){
        int atk=(int)(Math.random()*(50-0)+0);
        int def=(int)(Math.random()*(50-0)+0);
        int hp=(int)(Math.random()*(50-0)+0);
        int[]statistiche=new int[3];
        statistiche[0]=hp;
        statistiche[1]=atk;
        statistiche[2]=def;
        return statistiche;
    }
    private static String creaNome(String[] pre,String[] suf){
        int numpre=(int)(Math.random()*(15-1)+1);
        int numsuf=(int)(Math.random()*(15-1)+1);
        String spazio=" ";
        String nome = pre[numpre]+spazio+suf[numsuf];
        return nome;
    }
    private static int[] sistemazioneStatistiche(int[]Statistiche){
        int[] stat = Statistiche;
        int somma = stat[0]+stat[1]+ stat[2];
        while (somma>100) {
            stat[0]=stat[0]-1;
            stat[1]=stat[1]-1;
            stat[2]=stat[2]-1;
            somma = stat[0]+stat[1]+ stat[2];
        }
        return stat;
    }
    private static boolean controlloStatistiche(int[]Statistiche){
        int somma =Statistiche[0]+Statistiche[1]+Statistiche[2];
        //controlla che la somma delle statistiche non sia superiore a 100 e rirorna vero se non lo supera e falso se supera il limite 
        if (somma>100) {
            return false;            
        }
        return true;
    }
}
