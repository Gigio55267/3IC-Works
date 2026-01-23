public class App {
    public static void main(String[] args) throws Exception {
        Carta provCarta=new Carta();
        System.out.println(provCarta.getNome());
        System.out.println("vita "+provCarta.getPuntiVita());
        System.out.println("atk "+provCarta.getAtk());
        System.out.println("def "+provCarta.getDef());
        System.out.println("somma "+provCarta.getPuntiTotali());
    }
}
