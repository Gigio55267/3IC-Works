
public class Scacchiera {
    protected int col;
    protected int rig;
    protected char[][] tabellone = new char[rig][col];

    public Scacchiera(int col, int rig) {
        this.col = col;
        this.rig = rig;
        this.tabellone = new char[rig][col];
    }

    // riempie la matrice con # per considerare gli spazzi liberi
    public char[][] Generascachiera() {
        for (int i = 0; i < tabellone.length; i++) {
            for (int j = 0; j < tabellone[i].length; j++) {
                tabellone[i][j] = '#';
            }
        }
        return tabellone;
    }

    public void stampaScacchiera() {
        System.out.println("la scacchiera è:");
        for (int i = 0; i < tabellone.length; i++) {
            for (int j = 0; j < tabellone[i].length; j++) {
                if (j < tabellone[i].length - 1) {
                    System.out.print(tabellone[i][j] + " ");
                } else {
                    System.out.println(tabellone[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scacchiera s1 = new Scacchiera(8, 8);
        s1.Generascachiera();
        s1.stampaScacchiera();
    }
}
