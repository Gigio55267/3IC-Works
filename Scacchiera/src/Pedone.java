
public class Pedone extends Pedina {
    Scacchiera p = new Scacchiera(5, 5);
    Player p1 = new Player();
    char[][] tabello = p.Generascachiera();

    // mat[riga up down ][colonna dx sx]
    public Pedone(char tipo, String colore , int rig , int col) {
        super(tipo, colore, rig, col);
    }

    @Override
    public void muovi(int rig, int col) throws MovimentoNonValidoExeption {
        if (p.tabellone[rig][col]=='#' && tabello[rig][col]=='x') {
            
        }
    }

    @Override
    public void catturato(char pezzo) {
        p1.catturati.add(pezzo+"");
    }

    @Override
    public void mangia() {
        int x1 = posizione[1] + 1;
        int y1 = posizione[0] + 1;
        int y2 = posizione[0] - 1;
        if (tabello[x1][y2] != '#') {
            this.catturato(tabello[x1][y2]);
            this.posizione[0] = y2;
            this.posizione[1] = x1;
            
        }
        if (tabello[x1][y1] != '#') {
            this.catturato(tabello[x1][y1]);
            posizione[0] = y1;
            posizione[1] = x1;
        }
    }

    @Override
    public void posizioniPossibili() {
        char posPOssibili[][] = new char[p.rig][p.col];
        for (int i = 0; i < posPOssibili.length; i++) {
            for (int j = 0; j < posPOssibili.length; j++) {
                posPOssibili[i][j] = '#';
                if (posizione[0] + 1 != '#') {
                    posPOssibili[posizione[0] + 1][posizione[1]] = 'x';
                }
                if (j<7) {
                    System.out.print(posPOssibili[i][j]);
                }
                else System.out.println(posPOssibili[i][j]);
                
            }
        }
        if (tabello[posizione[1] + 1][posizione[0] - 1] != '#') {
            System.out.println("puoi mangiare a sinistra");
        }
        if (tabello[posizione[1] + 1][posizione[0] + 1] != '#') {
            System.out.println("puoi mangiare a destra");
        }

    }
public static void main(String[] args) {
}
}
