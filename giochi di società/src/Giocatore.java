public class Giocatore {
    protected  int partitevinte;
    String nome ;
    public Giocatore(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Giocatore [partitevinte=" + partitevinte + ", nome=" + nome + "]";
    }
}
