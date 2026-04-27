public class Pedone extends Pedina {
    Scacchiera p =new Scacchiera(5,5);
    //mat[riga up down ][colonna dx sx]
    public Pedone(String tipo, String colore) {
            super(tipo, colore);
            //TODO Auto-generated constructor stub
        }
    
        @Override
    public void muovi(char direzione, int caselle) {
        switch (direzione) {
            case 'w':
                if (this.posizione[0]+caselle>0 && this.posizione[0]+caselle<p.rig) {
                    
                }
                break;
        
            default:
                break;
        }
    }

    @Override
    public void catturato() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'catturato'");
    }

    @Override
    public void mangia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mangia'");
    }
    
}
