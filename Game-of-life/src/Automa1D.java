import java.util.Arrays;

public class Automa1D {
        private static char[] striscia;

        protected int regola;
        char[] newgen;

        public Automa1D(int larghezza, int regola) {
                this.striscia = new char[larghezza];
                this.regola = regola;
                this.newgen = new char[larghezza];
                striscia[larghezza / 2] = 1; // solo una cella accesa al centro. Ci serve per
                // vedere se si "propaga"
        }

        public char[] calcolaStato(int sx, int centro, int dx) {
                System.out.println(Arrays.toString(striscia));
                String[] creazioneGEn = new String[8];
                String combinazione = "";
                String[] rule = new String[8];
                // String[] rule = { "111", "110", "101", "100", "011", "010", "001", "000" };
                for (int i = 0; i < 8; i++) {
                        if (i - 1 < 0)
                                combinazione = "0" + centro + dx;
                        else if (i + 1 > 0)
                                combinazione =  sx + centro+"0";
                        else
                                combinazione = "" + sx + centro + dx;
                        rule[i] = combinazione;
                        System.out.println(Arrays.toString(rule));
                        
                }
                char[] regolabin = Regola.calcolaREgola(this.regola);
                for (int i = 0; i < creazioneGEn.length; i++) {
                        switch (rule[i]) {
                                case "111":
                                        if (regolabin[i] == '1') {
                                                newgen[i] = '1';
                                        } else {
                                                newgen[i] = '0';
                                        }
                                        break;
                                case "110":
                                        if (regolabin[i] == '1') {
                                                newgen[i] = '1';
                                        } else {
                                                newgen[i] = '0';
                                        }
                                        break;
                                case "101":
                                        if (regolabin[i] == '1') {
                                                newgen[i] = '1';
                                        } else {
                                                newgen[i] = '0';
                                        }
                                        break;
                                case "100":
                                        if (regolabin[i] == '1') {
                                                newgen[i] = '1';
                                        } else {
                                                newgen[i] = '0';
                                        }
                                        break;
                                case "011":
                                        if (regolabin[i] == '1') {
                                                newgen[i] = '1';
                                        } else {
                                                newgen[i] = '0';
                                        }
                                        break;
                                case "010":
                                        if (regolabin[i] == '1') {
                                                newgen[i] = '1';
                                        } else {
                                                newgen[i] = '0';
                                        }
                                        break;
                                case "001":
                                        if (regolabin[i] == '1') {
                                                newgen[i] = '1';
                                        } else {
                                                newgen[i] = '0';
                                        }
                                        break;
                                case "000":
                                        if (regolabin[i] == '1') {
                                                newgen[i] = '1';
                                        } else {
                                                newgen[i] = '0';
                                        }
                                        break;

                                default:
                                        break;
                        }
                }
                System.out.println(Arrays.toString(newgen));
                return newgen;
        }

        public void nextStato() {
                int sx = 0;
                int dx = 0;
                char[] nuovoStato = new char[striscia.length];
                for (int i = 0; i < striscia.length; i++) {
                        if (i-1<0);
                        else
                        sx = striscia[i - 1];
                        int centro = striscia[i];
                        if (i+1>striscia.length) 
                        dx = striscia[i + 1];

                        nuovoStato[i] = calcolaStato(sx, centro, dx)[i];
                        System.out.println(Arrays.toString(nuovoStato));
                }
                striscia = nuovoStato;
                System.out.println(Arrays.toString(striscia));
        }

        public void stampa() {
                for (int c : striscia) {
                        System.out.print(c == 1 ? "█" : " ");
                }
                System.out.println();
        }

}
