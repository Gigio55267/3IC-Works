
public class Pedone extends Pedina {
    Scacchiera p = new Scacchiera(5, 5);
    Player p1 = new Player();
    char[][] tabellone = p.Generascachiera();

    // mat[riga up down ][colonna dx sx]
    public Pedone(char tipo, String colore) {
        super(tipo, colore);
    }

    @Override
    public void muovi(char direzione, int caselle) throws MovimentoNonValidoExeption {
        // verifica che il pedone non si muova più di una casella in avanti
        if (caselle != 1)
            throw new MovimentoNonValidoExeption();
        switch (direzione) {
            //verifica la posizione nella quale si muove il pedone e se è libera o no
            case 'w':
                if (this.posizione[0] + caselle > 0 && this.posizione[0] + caselle < p.rig) {
                    if (tabellone[this.posizione[0]+1][this.posizione[1]]=='#') {
                        this.posizione[0] = this.posizione[0] + caselle;
                    }
                    
                }
                break;
            case 's':
                System.out.println("non puoi tornare indietro");
                // if (this.posizione[0]-caselle>0 && this.posizione[0]-caselle<p.rig) {
                // this.posizione[0]=this.posizione[0]-caselle;
                // }
                break;
            case 'a':
                System.out.println("non puoi andare a sinistra");
                // if (this.posizione[1]-caselle>0 && this.posizione[1]-caselle<p.rig) {
                // this.posizione[1]=this.posizione[1]-caselle;
                // }
                break;
            case 'd':
                System.out.println("non puoi andare a sinistra");
                // if (this.posizione[1]+caselle>0 && this.posizione[1]+caselle<p.rig) {
                // this.posizione[1]=this.posizione[1]+caselle;
                // }
                // break;
            default:
                break;
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
        if (tabellone[x1][y2] != '#') {
            this.catturato(tabellone[x1][y2]);
            this.posizione[0] = y2;
            this.posizione[1] = x1;
            
        }
        if (tabellone[x1][y1] != '#') {
            this.catturato(tabellone[x1][y1]);
            this.posizione[0] = y1;
            this.posizione[1] = x1;
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
                System.out.println(posPOssibili[i][j]);
            }
        }
        if (tabellone[posizione[1] + 1][posizione[0] - 1] != '#') {
            System.out.println("puoi mangiare a sinistra");
        }
        if (tabellone[posizione[1] + 1][posizione[0] + 1] != '#') {
            System.out.println("puoi mangiare a destra");
        }

    }

}
