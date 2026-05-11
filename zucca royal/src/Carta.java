public class Carta {
    private final String rarita;
    private final String nome;

    public Carta(String rarita, String nome) {
        this.rarita = rarita;
        this.nome = nome;
    }
    @Override
public String toString() {
    return "Carta [rarita=" + rarita + ", nome=" + nome + "]";
}
    public static void main(String[] args) {
        Carta c = new Carta("epica", "cavaliere negro");
        System.out.println(c.toString());
}
}

