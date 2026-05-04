
public class Scacchiera {
    protected int col;
    protected int rig;
    protected char[][] tabellone;
    public static final String ANSI_NER = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[1;37m";

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
        int cont = 0;
        System.out.println(ANSI_RESET + "la scacchiera è:");
        for (int i = 0; i < tabellone.length; i++) {
            for (int j = 0; j < tabellone[i].length; j++) {
                if (j < tabellone[j].length - 1) {
                    if (cont == 0) {
                        System.out.print(ANSI_NER + tabellone[i][j] + ANSI_RESET + " ");
                        cont++;
                    } else {
                        System.out.print(tabellone[i][j] + " ");
                        cont--;
                    }
                } else {
                    if (cont == 0) {
                        System.out.println(ANSI_NER + tabellone[i][j] + ANSI_RESET);
                        cont++;
                    } else {
                        System.out.println(tabellone[i][j] + " ");
                        cont--;
                    }
                    
                }
            }
            if (cont == 0) {
                        cont++;
                    } else {
                        cont--;
                    }
        }
    }

    public static void main(String[] args) {
        Scacchiera s1 = new Scacchiera(8, 8);
        s1.Generascachiera();
        s1.stampaScacchiera();
    }
}
