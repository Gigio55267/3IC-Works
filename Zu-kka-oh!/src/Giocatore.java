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
        int min = 1000000000;
        int max = 0;
        int index =0;
        int danno =0;
        int cont=0;
        for (int i = 0; i < campo.length; i++) {
            if (campo[i]==null) {
                if (cont==5) {
                    this.vita-=1;
                    
                }
            }
            else{}
            switch (this.getCarteincampo()[i].getTarget()) {
            case DEF_DEBOLE:
                for (int j = 0; j < campo.length; j++) {
                    if (min>campo[j].getDef()) {
                        min=campo[j].getDef();
                        index = j;
                    }
                }
                danno = min - campo[i].getAtk();
                campo[index].setPuntiVita(campo[index].getPuntiVita()-danno);

                break;
            case DEF_FORTE:
                for (int j = 0; j < campo.length; j++) {
                    if (max<campo[j].getDef()) {
                        max=campo[j].getDef();
                    }
                }
                danno = max - campo[i].getAtk();
                campo[index].setPuntiVita(campo[index].getPuntiVita()-danno);
                break;
            case ATK_DEBOLE:
                for (int j = 0; j < campo.length; j++) {
                    if (min>campo[j].getAtk()) {
                        min=campo[j].getAtk();
                        index = j;
                    }
                }
                danno = min - campo[i].getAtk();
                campo[index].setPuntiVita(campo[index].getPuntiVita()-danno);
                break;
            case ATK_FORTE:
                for (int j = 0; j < campo.length; j++) {
                    if (max<campo[j].getAtk()) {
                        max=campo[j].getAtk();
                    }
                }
                danno = max - campo[i].getAtk();
                campo[index].setPuntiVita(campo[index].getPuntiVita()-danno);
                break;
            case HP_ALTO:
                for (int j = 0; j < campo.length; j++) {
                    if (max<campo[j].getPuntiVita()) {
                        max=campo[j].getPuntiVita();
                    }
                }
                danno = max - campo[i].getAtk();
                campo[index].setPuntiVita(campo[index].getPuntiVita()-danno);
                break;
            case HP_BASSO:
                for (int j = 0; j < campo.length; j++) {
                    if (min>campo[j].getPuntiVita()) {
                        min=campo[j].getPuntiVita();
                        index = j;
                    }
                }
                danno = min - campo[i].getAtk();
                campo[index].setPuntiVita(campo[index].getPuntiVita()-danno);
                break;
        
            default:
                break;
        }
        }
        
    }
}
