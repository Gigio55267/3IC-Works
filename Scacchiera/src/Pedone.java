public class Pedone extends Pedina {

    public Pedone(String tipo, String colore) {
            super(tipo, colore);
            //TODO Auto-generated constructor stub
        }
    
        @Override
    public void muovi(char direzione, int caselle) {
        switch (direzione) {
            case 'w':
                if (this.posizione[0]+caselle>) {
                    
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
