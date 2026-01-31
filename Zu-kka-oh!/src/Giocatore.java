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
                        System.out.println("hai pescato");
                        break;
                    }
                    break;
                }
                break;
            }
        }
        mano=Utility.insertionSortVita(mano);
    }
    public void evocaCarta(Carta[] mano,Carta[] campo){
        int indexCartaDaPiazzare=0;
        Carta[] carte = mano;
        for (int i = 0; i < carte.length; i++) {
            if (carte[i]!=null) {
                indexCartaDaPiazzare=i;
               System.out.println("hai evocato "+carte[i].getNome());
               for (int j = 0; j < campo.length; j++) {
             if (Utility.trovaSpazioVuoto(campo)) {
                campo[i]=carte[indexCartaDaPiazzare];
                break;
                }
            }
            carte[i]=null;   
            break;
            } 
        }  
    }
    public void attacca(Carta[]campo, Giocatore avversario){
        int min = 1000000000;
        int max = 0;
        int index =0;
        int danno =0;
        int cont=0;
        for (int i = 0; i < campo.length; i++) {
            this.carteincampo=Utility.insertionSortTotale(this.carteincampo);
            if (campo[i]==null) {
                if (cont==5) {
                    avversario.setVita(avversario.getVita()-1);
                    
                }
                break;
            }
            else{}
            switch (this.getCarteincampo()[i].getTarget()) {
            case DEF_DEBOLE:
                for (int j = 0; j < campo.length; j++) {
                    if (campo[j]!=null) {
                        if (min>campo[j].getDef()) {
                        min=campo[j].getDef();
                        index = j;
                    }
                    }
                }
                danno = campo[i].getAtk() - campo[i].getDef();
                if (danno==0){
                    danno=Utility.dannominimo();
                }
                campo[index].setPuntiVita(campo[index].getPuntiVita()-danno);
                if (campo[index].getPuntiVita()<=0) {
                    campo[index]=null;
                }

                break;
            case DEF_FORTE:
                for (int j = 0; j < campo.length; j++) {
                    if (campo[j]!=null) {
                    if (max<campo[j].getDef()) {
                        max=campo[j].getDef();
                    }
                }
                }
                danno = campo[i].getAtk() - campo[i].getDef();
                if (danno==0){
                    danno=Utility.dannominimo();
                }
                campo[index].setPuntiVita(campo[index].getPuntiVita()-danno);
                if (campo[index].getPuntiVita()<=0) {
                    campo[index]=null;
                }
                break;
            case ATK_DEBOLE:
                for (int j = 0; j < campo.length; j++) {
                    if (campo[j]!=null) {
                    if (min>campo[j].getAtk()) {
                        min=campo[j].getAtk();
                        index = j;
                    }
                }
                }
                danno = campo[i].getAtk() - campo[i].getDef();
                if (danno==0){
                    danno=Utility.dannominimo();
                }
                campo[index].setPuntiVita(campo[index].getPuntiVita()-danno);
                if (campo[index].getPuntiVita()<=0) {
                    campo[index]=null;
                }
                break;
            case ATK_FORTE:
                for (int j = 0; j < campo.length; j++) {
                    if (campo[j]!=null) {
                    if (max<campo[j].getAtk()) {
                        max=campo[j].getAtk();
                    }
                }
                }
                danno = campo[i].getAtk() - campo[i].getDef();
                if (danno==0){
                    danno=Utility.dannominimo();
                }
                campo[index].setPuntiVita(campo[index].getPuntiVita()-danno);
                if (campo[index].getPuntiVita()<=0) {
                    campo[index]=null;
                }
                break;
            case HP_ALTO:
                for (int j = 0; j < campo.length; j++) {
                    if (campo[j]!=null) {
                    if (max<campo[j].getPuntiVita()) {
                        max=campo[j].getPuntiVita();
                    }
                }
                }
                danno = campo[i].getAtk() - campo[i].getDef();
                if (danno==0){
                    danno=Utility.dannominimo();
                }
                campo[index].setPuntiVita(campo[index].getPuntiVita()-danno);
                if (campo[index].getPuntiVita()<=0) {
                    campo[index]=null;
                }
                break;
            case HP_BASSO:
                for (int j = 0; j < campo.length; j++) {
                    if (campo[j]!=null) {
                    if (min>campo[j].getPuntiVita()) {
                        min=campo[j].getPuntiVita();
                        index = j;
                    }
                }
                }
                danno = campo[i].getAtk() - campo[i].getDef();
                if (danno==0){
                    danno=Utility.dannominimo();
                }
                campo[index].setPuntiVita(campo[index].getPuntiVita()-danno);
                if (campo[index].getPuntiVita()<=0) {
                    campo[index]=null;
                }
                break;
        
            default:
                break;
        }
        }
        
    }

    public void setVita(int vita) {
        this.vita = vita;
    }
}
