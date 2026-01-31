import java.util.Arrays;

public class Giocatore {
    protected String nomegiocatore;
    protected Carta[] mazzo;
    protected Carta[] mano;
    protected Carta[] campo;
    protected int vita;
    private final Target target;
    public Giocatore(String nomegiocatore) {
        this.nomegiocatore = nomegiocatore;
        this.mazzo = creaMazzo();
        this.mano = prendiPrimaMano(mazzo);
        this.campo = new Carta[5];
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
        return campo;
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
                if (campo[j]==null) {
                campo[j]=carte[indexCartaDaPiazzare];
                break;
                }
            }
            carte[i]=null;   
            break;
            } 
        }  
    }
    public void attacca( Giocatore avversario){
        int min = 1000000000;
        int max = 0;
        int index =0;
        int danno =0;
        int cont=0;
        for (int i = 0; i < this.campo.length; i++) {
            this.campo=Utility.insertionSortTotale(this.campo);
            System.out.println("prova campo in attacco "+Arrays.toString(campo));
            if (this.campo[i]==null) {
                if (cont==5) {
                    avversario.setVita(avversario.getVita()-1);
                    cont++;
                }
                break;
            }
            else{}
            System.out.println(this.getCarteincampo()[i].getNome()+" sta attaccando");
            switch (this.getCarteincampo()[i].getTarget()) {
            case DEF_DEBOLE:
                System.out.println("La carta " + campo[i].getNome() + ", di " + this.getNomegiocatore() + ", attaccherà la carta con la DEF più bassa di " + avversario.getNomegiocatore() + ".");
                        Carta sottoAttacco = avversario.campo[0];
                        for (int j = 0; j < avversario.campo.length; j++) {
                            if (sottoAttacco == null) {
                                sottoAttacco = avversario.campo[j];
                                continue;
                            }
                            if (avversario.campo[j] != null) {
                                if (sottoAttacco.getDef() > avversario.campo[j].getDef()) {
                                    sottoAttacco = avversario.campo[j];
                                }
                            }
                        }
                        danno = campo[i].getAtk() - sottoAttacco.getDef();
                        if (danno > 0) {
                            System.out.println("La carta " + campo[i].getNome() + ", di " + this.getNomegiocatore() + ", ha inflitto " + danno + " danni alla carta " + sottoAttacco.getNome() + ", di " + avversario.getNomegiocatore() + ".");
                            sottoAttacco.setPuntiVita((sottoAttacco.getPuntiVita()-danno));
                        }
                        else {
                            System.out.println("La carta " + campo[i].getNome() + ", di " + this.getNomegiocatore() + ", ha inflitto 1 danno alla carta " + sottoAttacco.getNome() + ", di " + avversario.getNomegiocatore() + ".");
                            sottoAttacco.setPuntiVita(sottoAttacco.getPuntiVita()-1);
                        }
                        if (sottoAttacco.puntiVita <= 0) {
                            System.out.println("La carta " + sottoAttacco.nome + ", di " + avversario.nomegiocatore + ", è stata distrutta!");
                            for (int k = 0; k < avversario.campo.length; k++) {
                                if (avversario.campo[k] != null && avversario.campo[k].equals(sottoAttacco)) {
                                    avversario.campo[k] = null;
                                    break;
                                }
                            }
                        }
                        

                break;
            case DEF_FORTE:
                System.out.println("La carta " + campo[i].nome + ", di " + this.nomegiocatore + ", attaccherà la carta con la DEF più alta di " + avversario.nomegiocatore + ".");
                        sottoAttacco = avversario.campo[0];
                        for (int j = 0; j < avversario.campo.length; j++) {
                            if (sottoAttacco == null) {
                                sottoAttacco = avversario.campo[j];
                                continue;
                            }
                            if (avversario.campo[j] != null) {
                                if (sottoAttacco.def < avversario.campo[j].def) {
                                    sottoAttacco = avversario.campo[j];
                                }
                            }
                        }
                        danno = campo[i].atk - sottoAttacco.def;
                        if (danno > 0) {
                            System.out.println("La carta " + campo[i].nome + ", di " + this.nomegiocatore + ", ha inflitto " + danno + " danni alla carta " + sottoAttacco.nome + ", di " + avversario.nomegiocatore + ".");
                            sottoAttacco.puntiVita -= danno;
                        }
                        if (sottoAttacco.puntiVita <= 0) {
                            System.out.println("La carta " + sottoAttacco.nome + ", di " + avversario.nomegiocatore + ", è stata distrutta!");
                            for (int k = 0; k < avversario.campo.length; k++) {
                                if (avversario.campo[k] != null && avversario.campo[k].equals(sottoAttacco)) {
                                    avversario.campo[k] = null;
                                    break;
                                }
                            }
                        }
                break;
            case ATK_DEBOLE:
                System.out.println("La carta " + campo[i].nome + ", di " + this.nomegiocatore + ", attaccherà la carta con l'ATK più basso di " + avversario.nomegiocatore + ".");
                        sottoAttacco = avversario.campo[0];
                        for (int j = 0; j < avversario.campo.length; j++) {
                            if (sottoAttacco == null) {
                                sottoAttacco = avversario.campo[j];
                                continue;
                            }
                            if (avversario.campo[j] != null) {
                                if (sottoAttacco.atk > avversario.campo[j].atk) {
                                    sottoAttacco = avversario.campo[j];
                                }
                            }
                        }
                        danno = campo[i].atk - sottoAttacco.def;
                        if (danno > 0) {
                            System.out.println("La carta " + campo[i].nome + ", di " + this.nomegiocatore + ", ha inflitto " + danno + " danni alla carta " + sottoAttacco.nome + ", di " + avversario.nomegiocatore + ".");
                            sottoAttacco.puntiVita -= danno;
                        }
                        else {
                            System.out.println("La carta " + campo[i].nome + ", di " + this.nomegiocatore + ", ha inflitto 1 danno alla carta " + sottoAttacco.nome + ", di " + avversario.nomegiocatore + ".");
                            sottoAttacco.puntiVita -= 1;
                        }
                        if (sottoAttacco.puntiVita <= 0) {
                            System.out.println("La carta " + sottoAttacco.nome + ", di " + avversario.nomegiocatore + ", è stata distrutta!");
                            for (int k = 0; k < avversario.campo.length; k++) {
                                if (avversario.campo[k] != null && avversario.campo[k].equals(sottoAttacco)) {
                                    avversario.campo[k] = null;
                                    break;
                                }
                            }
                        }
                break;
            case ATK_FORTE:
                System.out.println("La carta " + campo[i].nome + ", di " + this.nomegiocatore + ", attaccherà la carta con l'ATK più alto di " + avversario.nomegiocatore + ".");
                        sottoAttacco = avversario.campo[0];
                        for (int j = 0; j < avversario.campo.length; j++) {
                            if (sottoAttacco == null) {
                                sottoAttacco = avversario.campo[j];
                                continue;
                            }
                            if (avversario.campo[j] != null) {
                                if (sottoAttacco.atk < avversario.campo[j].atk) {
                                    sottoAttacco = avversario.campo[j];
                                }
                            }
                        }
                        danno = campo[i].atk - sottoAttacco.def;
                        if (danno > 0) {
                            System.out.println("La carta " + campo[i].nome + ", di " + this.nomegiocatore + ", ha inflitto " + danno + " danni alla carta " + sottoAttacco.nome + ", di " + avversario.nomegiocatore + ".");
                            sottoAttacco.puntiVita -= danno;
                        }
                        //eccezione attacco
                        else {
                            System.out.println("La carta " + campo[i].nome + ", di " + this.nomegiocatore + ", ha inflitto 1 danno alla carta " + sottoAttacco.nome + ", di " + avversario.nomegiocatore + ".");
                            sottoAttacco.puntiVita -= 1;
                        }
                        if (sottoAttacco.puntiVita <= 0) {
                            System.out.println("La carta " + sottoAttacco.nome + ", di " + avversario.nomegiocatore + ", è stata distrutta!");
                            for (int k = 0; k < avversario.campo.length; k++) {
                                if (avversario.campo[k] != null && avversario.campo[k].equals(sottoAttacco)) {
                                    avversario.campo[k] = null;
                                    break;
                                }
                            }
                        }
                break;
            case HP_ALTO:
                System.out.println("La carta " + campo[i].nome + ", di " + this.nomegiocatore + ", attaccherà la carta con gli HP più alti di " + avversario.nomegiocatore + ".");
                        sottoAttacco = avversario.campo[0];
                        for (int j = 0; j < avversario.campo.length; j++) {
                            if (sottoAttacco == null) {
                                sottoAttacco = avversario.campo[j];
                                continue;
                            }
                            if (avversario.campo[j] != null) {
                                if (sottoAttacco.puntiVita < avversario.campo[j].puntiVita) {
                                    sottoAttacco = avversario.campo[j];
                                }
                            }
                        }
                        danno = campo[i].atk - sottoAttacco.def;
                        if (danno > 0) {
                            System.out.println("La carta " + campo[i].nome + ", di " + this.nomegiocatore + ", ha inflitto " + danno + " danni alla carta " + sottoAttacco.nome + ", di " + avversario.nomegiocatore + ".");
                            sottoAttacco.puntiVita -= danno;
                        }
                        else {
                            System.out.println("La carta " + campo[i].nome + ", di " + this.nomegiocatore + ", ha inflitto 1 danno alla carta " + sottoAttacco.nome + ", di " + avversario.nomegiocatore + ".");
                            sottoAttacco.puntiVita -= 1;
                        }
                        if (sottoAttacco.puntiVita <= 0) {
                            System.out.println("La carta " + sottoAttacco.nome + ", di " + avversario.nomegiocatore + ", è stata distrutta!");
                            for (int k = 0; k < avversario.campo.length; k++) {
                                if (avversario.campo[k] != null && avversario.campo[k].equals(sottoAttacco)) {
                                    avversario.campo[k] = null;
                                    break;
                                }
                            }
                        }
                        
                break;
            case HP_BASSO:
                System.out.println("La carta " + campo[i].nome + ", di " + this.nomegiocatore + ", attaccherà la carta con gli HP più bassi di " + avversario.nomegiocatore + ".");
                        sottoAttacco = avversario.campo[0];
                        for (int j = 0; j < avversario.campo.length; j++) {
                            if (sottoAttacco == null) {
                                sottoAttacco = avversario.campo[j];
                                continue;
                            }
                            if (avversario.campo[j] != null) {
                                if (sottoAttacco.puntiVita > avversario.campo[j].puntiVita) {
                                    sottoAttacco = avversario.campo[j];
                                }
                            }
                        }
                        danno = campo[i].atk - sottoAttacco.def;
                        if (danno > 0) {
                            System.out.println("La carta " + campo[i].nome + ", di " + this.nomegiocatore + ", ha inflitto " + danno + " danni alla carta " + sottoAttacco.nome + ", di " + avversario.nomegiocatore + ".");
                            sottoAttacco.puntiVita -= danno;
                        }
                        else {
                            System.out.println("La carta " + campo[i].nome + ", di " + this.nomegiocatore + ", ha inflitto 1 danno alla carta " + sottoAttacco.nome + ", di " + avversario.nomegiocatore + ".");
                            sottoAttacco.puntiVita -= 1;
                        }
                        if (sottoAttacco.puntiVita <= 0) {
                            System.out.println("La carta " + sottoAttacco.nome + ", di " + avversario.nomegiocatore + ", è stata distrutta!");
                            for (int k = 0; k < avversario.campo.length; k++) {
                                if (avversario.campo[k] != null && avversario.campo[k].equals(sottoAttacco)) {
                                    avversario.campo[k] = null;
                                    break;
                                }
                            }
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
