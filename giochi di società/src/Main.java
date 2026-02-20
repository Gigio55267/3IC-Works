import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbr=new Scanner(System.in);
        System.out.print("in quanti giocate :");
        int tot=kbr.nextInt();
        kbr.nextLine();
        Giocatore[] arraypermetodo=new Giocatore[tot];
        for (int i = 0; i < tot; i++) {
            System.out.print("nome del giocatore :");
            String nome = kbr.nextLine();
            arraypermetodo[i]=new Giocatore(nome);
        }
        Partita partita = new Partita(arraypermetodo);
        System.out.println("se voui fare un torneo scrivi torneo\nse vuoi fare una sola partita scrivi partita");
        String scelta=kbr.nextLine();
        switch (scelta.toUpperCase()) {
            case "PARTITA":
                partita.gioca();
                partita.classifica();
                break;
            case "TORNEO":
                System.out.println("quante partite");
                int partite=kbr.nextInt();
                partita.torneo(partite);
                partita.classifica();
        
            default:
                break;
        }
    }
}
