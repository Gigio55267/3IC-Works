

public class Scacchiera {
    protected int col;
    protected int rig;
    protected char[][] tabellone=new char[rig][col];
    public Scacchiera(int col, int rig) {
        this.col = col;
        this.rig = rig;
    }
    // riempie la matrice con # per considerare gli spazzi liberi 
    public char[][] Generascachiera(){
        for (int i = 0; i < tabellone.length; i++) {
            for (int j = 0; j < tabellone[i].length; j++) {
                tabellone[i][j]='#';
                System.out.println();
            }
        }
        return tabellone;
    }
}
