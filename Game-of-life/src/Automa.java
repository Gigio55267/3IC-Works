public class Automa {
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RESET = "\u001B[0m";
    protected String striscia;
    protected final int regola;

    public Automa(int lunghezza, int regola) {
        this.striscia = creaStriscia(lunghezza);
        this.regola = regola;
    }

    private String creaStriscia(int lunghezza) {
        String striscia = "";
        for (int i = 0; i < lunghezza;i++) {
            if (i == lunghezza / 2) {
                striscia += "1";
            }
            else {
                striscia += 0;
            }
        }
        return striscia;
    }

    protected String calcolaStato(char sinistra, char centro, char destra) {
        String[] nuovostato = new String[8];
        String binario = Integer.toBinaryString(regola);
        while (binario.length() < 8) binario = "0" + binario;

        for (int i = 0; i < nuovostato.length; i++) {
            nuovostato[7 - i] = String.valueOf(binario.charAt(i));
        }
        String stato = "" + sinistra + centro + destra;
        return nuovostato[Integer.parseInt(stato, 2)];
    }

    protected void nextStato() {
        striscia = "0" + striscia + "0";
        String nuovoStato = "";
        // Il primo e l'ultimo valore non li comprendiamo nel for perche cosi il nosto indice non dara mai index out of bounds
        for (int i = 1; i < striscia.length() - 1; i++) {
            nuovoStato += calcolaStato(striscia.charAt(i - 1), striscia.charAt(i), striscia.charAt(i + 1));
        }
        striscia = nuovoStato;
    }

    protected void stampaStriscia() {
        for (int i = 0; i < striscia.length(); i++) {
            if (striscia.charAt(i) == '0') System.out.print(ANSI_BLACK_BACKGROUND + " " + ANSI_RESET);
            else System.out.print(ANSI_WHITE_BACKGROUND + " " + ANSI_RESET);
        }
        System.out.println();
    }
    
    protected void eseguiStati(int quanti) {
        for (int i = 0; i < quanti; i++) {
            stampaStriscia();
            nextStato();
        }
        stampaStriscia();
    }

    public static void main(String[] args) {
        Automa a = new Automa(100, 110);
        a.eseguiStati(100);
    }
}