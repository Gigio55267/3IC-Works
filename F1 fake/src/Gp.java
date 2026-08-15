import java.util.Arrays;
import java.util.Scanner;

public class Gp {
    public Gp() {
    }
    Scanner sk= new Scanner(System.in);
    public void creagp(int scuderiePartecipanti, String circuito){
        int partecipanti=scuderiePartecipanti;
        Scuderia[] scuderie = new Scuderia[partecipanti];
        for (int i = 1; i < scuderie.length+1; i++) {
            System.out.print(i+"nome scuderia:");
            String nomscu=sk.nextLine();
            System.out.println();
            Scuderia scud =new Scuderia(nomscu);
            scuderie[i-1]= scud;
        }
        System.out.println(Arrays.toString(scuderie));
    }
    public static void main(String[] args) throws Exception {
        Pilota p = new Pilota("sid", "ano", 18, 76, null);
        p.infopilota();
        Gp gp =new Gp();
        gp.creagp(3, "SPA");

    }
}
