
import turtle.Turtle;
import turtle.TurtleScreen;

public class FigureFrattali extends TurtleScreen{
    int lunghezza;
    Turtle t;
    public FigureFrattali(int lunghezza) {
        this.lunghezza = lunghezza;
    }
    public void triangolo(){
        for (int i = 0; i < 3; i++) {
            t.penDown();
            t.forward(lunghezza);
            t.left(120);
            
        }
    }
    public void curvaCoch(int livello, double lunghezza){
        if (livello==0)t.forward(lunghezza);
        else {
            curvaCoch(livello-1, lunghezza/3);
            t.left(60);
            curvaCoch(livello-1, lunghezza/3);
            t.right(120);
            curvaCoch(livello-1, lunghezza/3);
            t.left(60);
            curvaCoch(livello-1, lunghezza/3);
        }
    }
    public void fioccoDiNeveDiKoch(){
        for (int i = 0; i < 3; i++) {
            curvaCoch(5, lunghezza);
            t.right(120);
        }
    }
    @Override
    public void setup() {
        noLoop();
        t = createTurtle();
        t.penDown();
        t.speed(0);
        fioccoDiNeveDiKoch();
        
    }
     public static void main(String[] args) {

        FigureFrattali poligonoDisegnato = new FigureFrattali(200);
        poligonoDisegnato.run();
    }

}
