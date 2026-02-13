public class ASCIICanvas {
    private Forma[] forme;
    private String [][] stampa;
    private int numeroForme;
    private int larghezza; // Numero di "colonne"
    private int altezza; // Numero di "righe"

    public ASCIICanvas(int larghezza, int altezza) {
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.forme = new Forma[larghezza];
    }

    public void aggiungiForma(Forma f) {
        forme[numeroForme++]=f;
    }
    public void rimuoviForma(int indice) {
        try { 
            forme[indice]=null;
        } catch (Exception e) {
            System.out.println("errore index out of bound "+ indice);
           return;
        }
        for (int i = indice; i < forme.length-1; i++) {
            forme[i]=forme[i+1];
            forme[i+1]=null;
        }
    }

    public void disegna() {// implemetare una matrice che usi confronta il valore x y della matrice con quello della forma da disegnare 
        for (int i = 0; i < stampa.length; i++) {
            for (int j = 0; j < stampa[i].length; j++) {
                for (int k = 0; k < forme.length; k++) {
                    if (forme[k]==null) {
                        break;
                    }
                    if (forme[k].contiene(i, j)) {
                        
                    }
                }
            }
        }
    }
}