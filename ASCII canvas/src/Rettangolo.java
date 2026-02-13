public class Rettangolo implements  Forma{
    int larghezza;
    int altezza;
    char carattere;
    char[][] rettangolo;
    public Rettangolo(int larghezza, int altezza, char carattere) {
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.carattere = carattere;
        this.rettangolo = new char[altezza][larghezza]; 
    }
    public char[][] creaRettangolo(int altezza, int larghezza){
        for (int i = 0; i < rettangolo.length; i++) {
            for (int j = 0; j < rettangolo[i].length; j++) {
                rettangolo[i][j]=carattere;
            }
        }
        return rettangolo;
    }

    @Override
    public boolean contiene(double x, double y) {
        if (x>0 && x <larghezza && y>0 && y <altezza) {
            return true ;
        }
        return false;
    }

    @Override
    public char getCarattere() {
        return carattere;
    }
    
}
