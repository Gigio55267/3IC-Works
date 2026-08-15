import java.util.Arrays;

public class Scuderia {
    private final String NOME;
    private Monoposto[] auto;
    private Pilota[] piloti= {null, null};
    public void addPilota(String nome,String cognome, int numero,int eta){
        Pilota p = new Pilota(nome, cognome, numero, eta,this.NOME);
        for (int i = 0; i < 2; i++) {
            switch (this.piloti[i]){
                case null:
                    this.piloti[i]=p;
                    i=2;
                    break;
                default:
                    System.out.println("roster pieno");
            }
        }
    } 
    public Scuderia(String nome) {
        NOME = nome;
        Monoposto[] auto = new Monoposto[2];
    }
    public String inseriscinome(String name){
        String nomescu = name;
        return nomescu;
    }
    public static void main(String[] args) {
        Scuderia s=new Scuderia("ferrari");
        s.addPilota("pino", "gino", 17, 21);
        s.addPilota("gigi", "aura", 45, 54);
        s.piloti[0].infopilota();
        s.piloti[1].infopilota();
    }
    @Override
    public String toString() {
        return "Scuderia [NOME=" + NOME + ", auto=" + Arrays.toString(auto) + ", piloti=" + Arrays.toString(piloti)
                + "]";
    }
}
