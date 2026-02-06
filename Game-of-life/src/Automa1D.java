
public class Automa1D {
        private static int[] striscia;
        
                protected  int regola;  
                char[]newgen;
                public Automa1D(int larghezza, int regola) {
                this.striscia = new int[larghezza];
                this.regola = regola;
                this.newgen=new char[larghezza];
                striscia[larghezza / 2] = 1; // solo una cella accesa al centro. Ci serve per
                // vedere se si "propaga"
                 }
        
                public char[] calcolaStato() {
                        String[] creazioneGEn=new String[8];
                        String[] rule={"111","110","101","100","011","010","001","000"};
                        char[] regolabin=Regola.calcolaREgola(this.regola);
                       for (int i = 0; i < creazioneGEn.length; i++) {
                               switch (rule[i]) {
                                        case "111":
                                                if (regolabin[i]=='1') {
                                                        newgen[i]='1';
                                                }
                                                else {
                                                        newgen[i]='0';
                                                }
                                               break;
                                        case "110":
                                                if (regolabin[i]=='1') {
                                                        newgen[i]='1';
                                                }
                                                else {
                                                        newgen[i]='0';
                                                }
                                               break;
                                        case "101":
                                                if (regolabin[i]=='1') {
                                                        newgen[i]='1';
                                                }
                                                else {
                                                        newgen[i]='0';
                                                }
                                               break;
                                        case "100":
                                                if (regolabin[i]=='1') {
                                                        newgen[i]='1';
                                                }
                                                else {
                                                        newgen[i]='0';
                                                }
                                               break;
                                        case "011":
                                                if (regolabin[i]=='1') {
                                                        newgen[i]='1';
                                                }
                                                else {
                                                        newgen[i]='0';
                                                }
                                               break;
                                        case "010":
                                                if (regolabin[i]=='1') {
                                                        newgen[i]='1';
                                                }
                                                else {
                                                        newgen[i]='0';
                                                }
                                                break;
                                        case "001":
                                                if (regolabin[i]=='1') {
                                                        newgen[i]='1';
                                                }
                                                else {
                                                        newgen[i]='0';
                                                }
                                                break;
                                        case "000":
                                                if (regolabin[i]=='1') {
                                                        newgen[i]='1';
                                                }
                                                else {
                                                        newgen[i]='0';
                                                }
                                                break;
                                
                                        default:
                                                break;
                                }
                        }
                        
                    return newgen;
                 }
        
                 public void nextStato() {
                 int[] nuovoStato = new int[striscia.length];
        
                 // TODO Completa qui:
                 // per ogni cella, prendi i vicini e calcola il nuovo stato usando "calcolaStato"
                 striscia = nuovoStato;
                 }
                public void stampa() {
                         for (int c : striscia) {
                         System.out.print(c == 1 ? "█" : " ");
                         }
                         System.out.println();
                         }
                
         }
