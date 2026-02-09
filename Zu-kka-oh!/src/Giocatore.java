
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

    private static Carta[] creaMazzo() {
        Carta[] mazzo = new Carta[50];
        for (int i = 0; i < mazzo.length; i++) {
            mazzo[i] = new Carta();
        }
        return mazzo;
    }

    private static Carta[] prendiPrimaMano(Carta[] mazzo) {
        Carta[] mano = new Carta[10];
        int contatore = 49;
        for (int i = 0; i < 5; i++) {
            mano[i] = mazzo[contatore];
            mazzo[contatore] = null;
            contatore--;
        }
        return mano;
    }

    public int spazioCampo() {
        int counter = 0;
        for (int i = 0; i < campo.length; i++) {
            if (campo[i] == null) {
                counter++;
            }
        }
        return counter;
    }

    public void pescaCarte(Carta[] mazzo, Carta[] mano, int turno) {
        int turnoatt=turno-1;
        for (int i = 0; i < mano.length; i++) {
            if (mano[i] == null) {
                // for (int j = 0; j < mazzo.length; j++) {
                //if (mazzo[turno-5] != null) {
                    mano[i] = mazzo[turnoatt-1];
                    System.out.println("hai pescato");
                }
                break;
            //}
            //break;
        }
        // }
        mano = Utility.insertionSortVita(mano);
    }

    public void evocaCarta(Carta[] mano, Carta[] campo) {
        int indexCartaDaPiazzare = 0;
        Carta[] carte = mano;
        for (int i = 0; i < carte.length; i++) {
            if (carte[i] != null) {
                indexCartaDaPiazzare = i;
                System.out.println("hai evocato " + carte[i].getNome());
                for (int j = 0; j < campo.length; j++) {
                    if (campo[j] == null) {
                        campo[j] = carte[indexCartaDaPiazzare];
                        break;
                    }
                }
                carte[i] = null;
                break;
            }
        }
    }

    public void attacca(Giocatore avversario) {
        for (int i = 0; i < campo.length; i++) {
            if (campo[i] != null) {
                if (avversario.spazioCampo() == 5) {
                    if (avversario.vita > 0) {
                        avversario.vita--;
                        System.out.println(avversario.nomegiocatore + " non ha carte in campo. " + this.nomegiocatore
                                + " infligge 1 danno diretto.");
                    } else {
                        System.out.println(avversario.nomegiocatore + " è morto.");
                        return;
                    }
                } else {
                    Carta cartaSottoAttacco = avversario.campo[campo[i].trovaTarget(campo[i].target, avversario.campo)];

                    if (campo[i].atk - cartaSottoAttacco.def > 1) {
                        int dannoInflitto = campo[i].atk - cartaSottoAttacco.def;
                        cartaSottoAttacco.puntiVita -= dannoInflitto;
                        System.out.println(campo[i].nome + " attacca " + cartaSottoAttacco.nome + " infliggendo "
                                + dannoInflitto + " danni.");
                    } else {
                        cartaSottoAttacco.puntiVita -= 1;
                        System.out.println(
                                campo[i].nome + " attacca " + cartaSottoAttacco.nome + " infliggendo 1 danno.");
                    }
                    if (cartaSottoAttacco.puntiVita <= 0) {
                        System.out.println(cartaSottoAttacco.nome + " è stato distrutto!");
                        for (int j = 0; j < avversario.campo.length; j++) {
                            if (avversario.campo[j] == cartaSottoAttacco) {
                                avversario.campo[j] = null;
                                break;
                            } else {
                                System.out.println(cartaSottoAttacco.nome + " ha " + cartaSottoAttacco.puntiVita
                                        + " HP rimanenti.");
                            }
                        }

                    }
                }
            }

        }
    }

    public void setVita(int vita) {
        this.vita = vita;
    }
}
