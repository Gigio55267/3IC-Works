import java.util.Arrays;

public class Automa1D extends Regola {
        private static int[] striscia;
                private int regola;  
                char[]newgen;
                public Automa1D(int larghezza, int regola) {
                this.striscia = new int[larghezza];
                this.regola = regola;
                this.newgen=new char[larghezza];
                striscia[larghezza / 2] = 1; // solo una cella accesa al centro. Ci serve per
                // vedere se si "propaga"
                 }
        
                 public char[] calcolaStato(int sinistra, int centro, int destra) {
                        String[] creazioneGEn=new String[8];
                        String riga="";
                        int cont =0;
                        for (int i = 0; i < striscia.length; i+=3) {
                                for (int j = 0; j < 8; j++) {
                                        riga=""+striscia[j];
                                }
                                creazioneGEn[cont]=riga;
                                cont++;    
                        }
                        for (int i = 0; i < creazioneGEn.length; i++) {
                                switch (creazioneGEn[i]) {
                                        case "111":
        
                                                break;
                                        case "110":
                                                break;
                                        case "101":
                                                break;
                                        case "100":
                                                break;
                                        case "011":
                                                break;
                                        case "010":
                                                break;
                                        case "001":
                                                break;
                                        case "000":
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
                        
                         public static void main(String[] args) {
                        System.out.println(Arrays.toString(calcolaREgola(striscia)));
                 Automa1D ac = new Automa1D(61, 110);
                for (int i = 0; i < 30; i ++) {
                 ac.stampa();
                 ac.nextStato();
                 }
                }
                
         }
