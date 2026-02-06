import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Automa1D au = new Automa1D(12, 110);
                System.out.println(Arrays.toString(Regola.calcolaREgola(au.regola)));
                //Automa1D ac = new Automa1D(61, 110);
                for (int i = 0; i < 30; i ++) {
                    au.stampa();
                    au.nextStato();
                    }
                }
}
