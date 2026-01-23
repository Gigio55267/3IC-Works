public class Carta {
    private String nome;
    private int puntiVita;
    private int atk;
    private int def;
    public Carta(String nome, int puntiVita, int atk, int def) {
        this.nome = nome;
        this.puntiVita = puntiVita;
        this.atk = atk;
        this.def = def;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPuntiVita() {
        return puntiVita;
    }
    public void setPuntiVita(int puntiVita) {
        this.puntiVita = puntiVita;
    }
    public int getAtk() {
        return atk;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }
    public int getDef() {
        return def;
    }
    public void setDef(int def) {
        this.def = def;
    };
    
}
