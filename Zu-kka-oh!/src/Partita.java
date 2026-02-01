import java.util.Arrays;

public class Partita {
private Giocatore giocatore1;
private Giocatore giocatore2;
private int turno;
private boolean primoTurno;
public Partita(String nome1, String nome2) {
giocatore1 = new Giocatore(nome1);
giocatore2 = new Giocatore(nome2);
turno = 0;
primoTurno = true;
}
// Gioca 1 solo turno. Se `turno` è pari, tocca al giocatore1,
// altrimenti tocca al giocatore2
public void turno() {
    
    System.out.println();
    if (primoTurno){
        primoTurno=false;
        System.out.println(primoTurno);
        System.out.println("turno di "+giocatore1.getNomegiocatore());
        giocatore1.pescaCarte(giocatore1.getMazzo(), giocatore1.getMano());
        giocatore1.evocaCarta(giocatore1.getMano(), giocatore1.getCarteincampo());}
        else if (turno % 2 == 0){
            System.out.println("turno di "+giocatore1.getNomegiocatore());
        giocatore1.pescaCarte(giocatore1.getMazzo(), giocatore1.getMano());
        //System.out.println(Arrays.toString(giocatoreCorrente.getMano()) );
        giocatore1.evocaCarta(giocatore1.getMano(), giocatore1.getCarteincampo()); 
        System.out.println("giocatore corrente "+Arrays.toString(giocatore1.getCarteincampo()));
        giocatore1.attacca( giocatore2);
        System.out.println("avversario "+Arrays.toString(giocatore2.getCarteincampo())); 
        System.out.println(giocatore1.getVita());
        System.out.println("mano "+ Arrays.toString(giocatore1.getMano()));
        }else {
        System.out.println("turno di "+giocatore2.getNomegiocatore());
        giocatore2.pescaCarte(giocatore2.getMazzo(), giocatore2.getMano());
        //System.out.println(Arrays.toString(giocatoreCorrente.getMano()) );
        giocatore2.evocaCarta(giocatore2.getMano(), giocatore2.getCarteincampo()); 
        System.out.println("giocatore corrente "+Arrays.toString(giocatore2.getCarteincampo()));
        giocatore2.attacca( giocatore1);
        System.out.println("avversario "+Arrays.toString(giocatore1.getCarteincampo())); 
        System.out.println(giocatore2.getVita());
        System.out.println("mano "+ Arrays.toString(giocatore2.getMano()));
    }     
 }
    

// Controlla se la partita è finita
public boolean isFinita() {
    return giocatore1.vita <= 0 || giocatore2.vita <= 0;
 }
// Ritorna il vincitore
public Giocatore getVincitore() {
    if (giocatore1.getVita() <=0){
        return giocatore2;
    } else if (giocatore2.getVita() <=0){
        return giocatore1;
    }else {
        return null;
    }
 }
// Simula l'intera partita (vedi dopo)
public void gioca() {
    System.out.println("inizio della partita tra "+giocatore1.getNomegiocatore()+" e "+giocatore2.getNomegiocatore());
    while (!isFinita()) {
        turno();
        turno++;
    }
    System.out.println((getVincitore().nomegiocatore));
 }
}
