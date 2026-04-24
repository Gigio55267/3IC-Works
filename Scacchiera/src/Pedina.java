public abstract class Pedina {
    protected String tipo;
    protected String colore;
    protected int[] posizione;
    public Pedina(String tipo, String colore) {
        this.tipo = tipo;
        this.colore = colore;
        this.posizione[0]=0;
        this.posizione[1]=0;
    }
    public abstract void muovi(char  direzione,int caselle);
    public abstract void catturato();
    public abstract void mangia(); 
}
