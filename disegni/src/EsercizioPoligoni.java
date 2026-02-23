
import java.awt.Color;
import java.util.Scanner;
import turtle.Turtle;
import turtle.TurtleScreen;

public class EsercizioPoligoni extends TurtleScreen{
    private Turtle t;
    public EsercizioPoligoni(){
        super(1200, 1200);
    }
    
    
    public void creazionePoligoni(int n,int k){
        double gradi=360;
        int y=-250;
        int x=0;
        t.setPenColor(Color.BLACK);
        gradi = (double)(gradi /n);
        int lunghezza = 300;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                t.left(gradi);
                t.penDown();
                t.forward(lunghezza);
                t.penUp();
            }
            lunghezza/=2;
            x=x-(lunghezza/2);
            y=y+lunghezza;
            t.goTo(x,y);
        }
        
    } 
    @Override
    public void setup() {
        noLoop();                                // Disegna 1 volta e poi si ferma
        title("poligoni");                // Imposta il titolo della finestra
        bgcolor(new Color(50, 50, 100));       // Colore di sfondo
        Scanner scanner = new Scanner(System.in);
        System.out.println("dimmi n");
        int n=scanner.nextInt();// numero di lati
        System.out.println("dimmi quanti poligoni vuoi");
        int k=scanner.nextInt();
        t = createTurtle(); // Crea una nuova tartaruga
        t.speed(1); // Velocità 1 = disegna veloce
        t.hideTurtle(); // Nasconde la tartaruga
        t.setPenSize(4);
        t.penUp();                       
        t.goTo(0, -250);                 
        t.penDown();                  
        t.setHeading(0);  
        creazionePoligoni(n, k);

    }
    public static void main(String[] args) {
        //numro di poligoni
        TurtleScreen app = new EsercizioPoligoni();  // Crea l'applicazione
        app.run();                                 // Avvia l'esecuzione
    }
}
