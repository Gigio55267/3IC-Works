
public class Carta {
    private final String nome;
    private int puntiVita;
    private int atk;
    private int def;
    Target target;
    private static String [] prefissi={
    "Drago", "Lupo", "Tigre", "Serpente", "Aquila","Golem", "Spirito", "Ombra",
    "Fuoco", "Ghiaccio","Tuono", "Terra", "Vento", "Luce", "Oscuro"
    };
    private static String[] suffissi = {
    "Antico", "Furioso", "Mistico", "Selvaggio", "Celeste","Infernale","Glaciale",
    "Tonante","Sacro", "Maledetto","Supremo", "Eterno", "Fatale", "Divino", "Spettrale"
    };
    public Carta() {
        //int[] statistiche=creaStatistiche();
        this.nome = creaNome(prefissi, suffissi);
        do {
            this.puntiVita =(int) (Math.random()*(50-1)+1);
            this.atk =(int) (Math.random()*(50-0)+0);
            this.def = (int)(Math.random()*(50-0)+0);
        } while (atk+def+puntiVita>100);
        this.target = Target.targetRandom();
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
    @Override
    public String toString() {
        return  nome+"[" + " puntiVita= " + puntiVita + ", atk= " + atk + ", def= " + def + ", totale statistiche= "+this.getPuntiTotali()+"]";
    }
    //public static int[] creaStatistiche(){
    //    int atk=(int)(Math.random()*(50-0)+0);
    //    int def=(int)(Math.random()*(50-0)+0);
    //    int hp=(int)(Math.random()*(50-1)+1);
    //    int[]statistiche=new int[3];
    //    statistiche[0]=hp;
    //    statistiche[1]=atk;
    //    statistiche[2]=def;
    //    if (controlloStatistiche(statistiche)){
    //        while (controlloStatistiche(statistiche)) {
    //            statistiche[0]=sistemazioneStatistiche(statistiche)[0];
    //            statistiche[1]=sistemazioneStatistiche(statistiche)[1];
    //            statistiche[2]=sistemazioneStatistiche(statistiche)[2];
    //        } 
    //    }
    //    return statistiche;
    //}
    private static String creaNome(String[] pre,String[] suf){
        int numpre=(int)(Math.random()*(pre.length));
        int numsuf=(int)(Math.random()*(suf.length));
        String spazio=" ";
        String nome = pre[numpre]+spazio+suf[numsuf];
        return nome;
    }
    //private static int[] sistemazioneStatistiche(int[]Statistiche){
    //    int[] stat = Statistiche;
    //    int somma = Statistiche[0]+Statistiche[1]+ Statistiche[2];
    //    //System.out.println("somma prima della sistemazione "+somma);
    //    while (somma>100) {
    //        stat[0]=(int)(Math.random()*(50-0)+0);
    //        stat[1]=(int)(Math.random()*(50-0)+0);
    //        stat[2]=(int)(Math.random()*(50-0)+0);
    //        somma = stat[0]+stat[1]+ stat[2];
    //        //System.out.println("somma dentro sistemazione "+somma);
    //        //System.out.println(Arrays.toString(stat));
    //    }
    //    return stat;
    //}
    //private static boolean controlloStatistiche(int[]Statistiche){
    //    int somma =Statistiche[0]+Statistiche[1]+Statistiche[2];
    //    //System.out.println("somma dentro controllo "+somma);
    //    //controlla che la somma delle statistiche non sia superiore a 100 e rirorna falso se non lo supera e vero se supera il limite
    //    return somma>100;
    //}
    public int getPuntiTotali(){
        int somma = this.atk+this.def+this.puntiVita;
        return  somma;
    }
    public Target getTarget() {
        return target;
    }
    public void setPuntiVita(int puntiVita) {
        this.puntiVita = puntiVita;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }
    public void setDef(int def) {
        this.def = def;
    }
    public void setTarget(Target target) {
        this.target = target;
    }
    public static void setPrefissi(String[] prefissi) {
        Carta.prefissi = prefissi;
    }
    public static void setSuffissi(String[] suffissi) {
        Carta.suffissi = suffissi;
    }
}
