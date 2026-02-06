
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
                String[] creazioneGEn = new String[8];
                String combinazione = "";
                String[] rule = new String[8];
                // String[] rule = { "111", "110", "101", "100", "011", "010", "001", "000" };
                for (int i = 0; i < rule.length; i++) {
                        if (i - 1 < 0)
                                combinazione = "" + centro + dx;
                        else if (i + 1 > 0)
                                combinazione = "" + sx + centro;
                        else
                                combinazione = "" + sx + centro + dx;
                        rule[i] = combinazione;
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

                return newgen;
        }

        public void nextStato() {
                char[] nuovoStato = new char[striscia.length];
                for (int i = 0; i < striscia.length; i++) {
                        int sx = striscia[i - 1];
                        int centro = striscia[i];
                        int dx = striscia[i + 1];

                        nuovoStato[i] = calcolaStato(sx, centro, dx)[i];
                }
                striscia = nuovoStato;
        }

        public void stampa() {
                for (int c : striscia) {
                        System.out.print(c == 1 ? "█" : " ");
                }
                System.out.println();
        }

}
