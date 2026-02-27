
import java.util.Scanner;
import turtle.Turtle;
import turtle.TurtleScreen;

public class PoligoniConcentrici extends TurtleScreen {
    private Turtle t;

    int nLati;
    int quantiPoligoni;
    public PoligoniConcentrici(int quantiLati, int quantiPoligoni) {
        super(1920, 1080);
        this.nLati = quantiLati;
        this.quantiPoligoni = quantiPoligoni;
    }

    @Override
    public void setup() {
        noLoop();
        t = createTurtle();
        double angolo = 360 / nLati;
        int avanti = 360 / nLati;
        int distanza = avanti;
        double circumraggio = 0.5 * avanti * (1 / Math.sin(Math.PI / nLati));
        double apotema = circumraggio * Math.cos(Math.PI / nLati);
        t.penUp();
        t.goTo(-Math.sqrt(Math.pow(circumraggio, 2) - Math.pow(apotema, 2)), -apotema);
        t.penDown();
        for (int i = 0; i < quantiPoligoni; i++) {
            for (int j = 0; j < nLati; j++) {
                t.forward(avanti);
                t.left(angolo);
            }
            avanti += distanza;
            t.penUp();
            t.goTo(t.position()[0] - Math.sqrt(Math.pow(circumraggio, 2) - Math.pow(apotema, 2)), t.position()[1] - apotema);
            t.penDown();
        }
    }

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Dimmi il numero di lati: ");
        int n = kbd.nextInt();
        System.out.print("Dimmi quanti poligoni disegnare: ");
        int k = kbd.nextInt();

        PoligoniConcentrici disegno = new PoligoniConcentrici(n, k);
        disegno.run();
    }
}