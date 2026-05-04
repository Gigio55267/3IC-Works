public abstract class Pedina {
    protected char tipo;
    protected String colore;
    protected int[] posizione= new int[2];
    public Pedina(char tipo, String colore, int rig , int col) {
        this.tipo = tipo;
        this.colore = colore;
        //posizione della pedina "y"
        this.posizione[0]=rig;
        //posizione della pedina "x"
        this.posizione[1]=col;
    }
    public abstract void muovi(int rig,int col)throws MovimentoNonValidoExeption;
    public abstract void catturato(char pezzo);
    public abstract void mangia(); 
    public abstract void posizioniPossibili();
}
