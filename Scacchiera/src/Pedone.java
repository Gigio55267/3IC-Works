

public class Pedone extends Pedina {
    Scacchiera p =new Scacchiera(5,5);
    Player p1=new Player();
    //mat[riga up down ][colonna dx sx]
    public Pedone(String tipo, String colore) {
            super(tipo, colore);
            //TODO Auto-generated constructor stub
        }
    
        @Override
    public void muovi(char direzione, int caselle) throws MovimentoNonValidoExeption {
        if (caselle!=1) 
            throw new MovimentoNonValidoExeption();
        switch (direzione) {
            case 'w':
                if (this.posizione[0]+caselle>0 && this.posizione[0]+caselle<p.rig) {
                    this.posizione[0]=this.posizione[0]+caselle;
                }
                break;
            case's':
                System.out.println("non puoi tornare indietro");
            //if (this.posizione[0]-caselle>0 && this.posizione[0]-caselle<p.rig) {
            //    this.posizione[0]=this.posizione[0]-caselle;
            //}
            break;
            case 'a':
                System.out.println("non puoi andare a sinistra");
            //    if (this.posizione[1]-caselle>0 && this.posizione[1]-caselle<p.rig) {
            //        this.posizione[1]=this.posizione[1]-caselle;
            //    }
                break;
            case'd':
            System.out.println("non puoi andare a sinistra");
            //if (this.posizione[1]+caselle>0 && this.posizione[1]+caselle<p.rig) {
            //    this.posizione[1]=this.posizione[1]+caselle;
            //}
            //break;
            default:
                break;
        }
    }

    @Override
    public void catturato() {
        p1.catturati.add(this);
    }

    @Override
    public void mangia() {
        int x1=posizione[1]+1;
        int y1=posizione[0]+1;
        int y2=posizione[0]-1;
        if (p[x1][y2]=='#') {
            
        }
    }
    
}
