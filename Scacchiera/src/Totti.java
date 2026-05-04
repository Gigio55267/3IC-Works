public class Totti extends Pedina {
    Scacchiera p = new Scacchiera(5, 5);
    Player p1 = new Player();
    char[][] tabellone = p.Generascachiera();

    public Totti(char tipo, String colore) {
        super(tipo, colore, tipo, tipo);
    }

    @Override
    public void muovi(int rig, int caselle) throws MovimentoNonValidoExeption {
       
    }

    @Override
    public void catturato(char pezzo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'catturato'");
    }

    @Override
    public void mangia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mangia'");
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
    }

}
