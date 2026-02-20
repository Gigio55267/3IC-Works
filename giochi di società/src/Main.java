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
        partita.gioca();
        partita.torneo();
        partita.classifica();
    }
}
