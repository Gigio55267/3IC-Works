import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Carta provCarta=new Carta();
        System.out.println(provCarta.toString());
        Giocatore giocatore=new Giocatore("piero");
        System.out.println(Arrays.toString(giocatore.getCarteincampo()));
        System.out.println(Arrays.toString(giocatore.getMano()));
    }
}
