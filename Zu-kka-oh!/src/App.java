import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Carta provCarta=new Carta();
        //System.out.println(provCarta.toString());
        Giocatore giocatore=new Giocatore("piero");
        //System.out.println(Arrays.toString(giocatore.getCarteincampo()));
        //System.out.println(Arrays.toString(giocatore.getMano()));
        //giocatore.pescaCarte(giocatore.getMazzo(), giocatore.getMano());
        //System.out.println("mano aggiornata "+Arrays.toString(giocatore.getMano()));
        giocatore.evocaCarta(giocatore.getMano(),giocatore.getCarteincampo());
        System.out.println(Arrays.toString(giocatore.getCarteincampo()));
    }
}
