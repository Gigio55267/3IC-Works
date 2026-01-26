public class Giocatore {
    private String nomegiocatore;
    private Carta[] mazzo;
    private Carta[] mano;
    private Carta[] carteincampo;
    private int vita;
    private final Target target;
    public Giocatore(String nomegiocatore) {
        this.nomegiocatore = nomegiocatore;
        this.mazzo = creaMazzo();
        this.mano = prendiPrimaMano(mazzo);
        this.carteincampo = new Carta[5];
        this.vita = 3;
        this.target = Target.targetRandom();
    }
    public String getNomegiocatore() {
        return nomegiocatore;
    }
    public Carta[] getMazzo() {
        return mazzo;
    }
    public Carta[] getMano() {
        return mano;
    }
    public Carta[] getCarteincampo() {
        return carteincampo;
    }
    public int getVita() {
        return vita;
    }
    public Target getTarget() {
        return target;
    }
    private static Carta[] creaMazzo(){
        Carta[] mazzo=new Carta[50];
        for (int i = 0; i < mazzo.length; i++) {
            mazzo[i]=new Carta();
        }
        return mazzo;
    }
    private static Carta[] prendiPrimaMano(Carta[]mazzo){
        Carta[] mano=new Carta[10];
        int contatore=49;
        for (int i = 0; i < 5; i++) {
            mano[i]=mazzo[contatore];
            mazzo[contatore]=null;
            contatore--;
        }
        return mano;
    }
    public void  pescaCarte(Carta[]mazzo,Carta[]mano){
        for (int i = 0; i < mano.length; i++) {
            if (mano[i]==null) {
                for (int j = 0; j < mazzo.length; j++) {
                    if (mazzo[j]!=null) {
                        mano[i]=mazzo[j];
                        break;
                    }
                    break;
                }
                break;
            }
        }
    }
    public void evocaCarta(Carta[] mano,Carta[] campo){
        int indexCartaDaPiazzare=0;
        int piuhp=mano[0].getPuntiVita();
        for (int i = 0; i < mano.length; i++) {
            if (mano[i]!=null) {
               if (piuhp<mano[i].getPuntiVita()){
                indexCartaDaPiazzare=i;
            } 
            }
        }
        for (int i = 0; i < campo.length; i++) {
             if (Utility.trovaSpazioVuoto(campo)) {
                campo[i]=mano[indexCartaDaPiazzare];
                break;
        }
        }
       
    }
    public void attacca(Carta[]campo){
        for (int i = 0; i < campo.length; i++) {
            switch (this.getCarteincampo()[i].getTarget()) {
            case DEF_DEBOLE:
                
                break;
            case DEF_FORTE:
                break;
            case ATK_DEBOLE:
                break;
            case ATK_FORTE:
                break;
            case HP_ALTO:
                break;
            case HP_BASSO:
                break;
        
            default:
                break;
        }
        }
        
    }
}
