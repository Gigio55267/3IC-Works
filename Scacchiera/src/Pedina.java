public abstract class Pedina {
    protected char tipo;
    protected String colore;
    protected int[] posizione;
    public Pedina(char tipo, String colore) {
        this.tipo = tipo;
        this.colore = colore;
        //posizione della pedina "y"
        this.posizione[0]=0;
        //posizione della pedina "x"
        this.posizione[1]=0;
    }
    public abstract void muovi(char  direzione,int caselle)throws MovimentoNonValidoExeption;
    public abstract void catturato(char pezzo);
    public abstract void mangia(); 
    public abstract void posizioniPossibili();
}
