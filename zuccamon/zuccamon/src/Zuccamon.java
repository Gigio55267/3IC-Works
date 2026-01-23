public class Zuccamon {
    private String nome;
    private Elemento tipo;
    private int puntiVita;
    private int attacco;
    public Zuccamon(String nome, Elemento tipo, int puntiVita, int attacco) {
        this.nome = nome;
        this.tipo = tipo;
        this.puntiVita = puntiVita;
        this.attacco = attacco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Elemento getTipo() {
        return tipo;
    }
    public void setTipo(Elemento tipo) {
        this.tipo = tipo;
    }
    public int getPuntiVita() {
        return puntiVita;
    }
    public void setPuntiVita(int puntiVita) {
        this.puntiVita = puntiVita;
    }
    public int getAttacco() {
        return attacco;
    }
    public void setAttacco(int attacco) {
        this.attacco = attacco;
    }
    @Override
    public String toString() {
        return "Zuccamon [nome=" + nome + ", tipo=" + tipo + ", puntiVita=" + puntiVita + ", attacco=" + attacco + "]";
    }
    //metodi
    public void attacca(Zuccamon bersaglio){
        double danno = 0;
        danno = this.getTipo().calcolaEfficacia(bersaglio.getTipo());
        danno = this.getAttacco()*danno;
        bersaglio.setPuntiVita(bersaglio.getPuntiVita()-(int)danno);
    }
    public void riceviDanno(int danno){
        this.setPuntiVita(this.getPuntiVita()-danno);
    }
    public boolean  isVivo(){
        if(this.getPuntiVita()>0)
            return true;
        return false;
    }   
}
