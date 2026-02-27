
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
    public void fioccoDiNeveDiKoch(){

    }
    @Override
    public void setup() {
        noLoop();
        t = createTurtle();
    }

}
