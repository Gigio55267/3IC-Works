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
public void turno(boolean primoturno) {
    Giocatore giocatoreCorrente= new Giocatore(null);
    Giocatore avversario =new Giocatore(null);
    
    System.out.println(primoturno);
    while (turno<8) {
        if (turno % 2 == 0){
        giocatoreCorrente=giocatore1;
        avversario=giocatore2;
    }else {
        giocatoreCorrente=giocatore2;
        avversario=giocatore1;
    }
        if (primoturno){
        primoturno=false;
        System.out.println(primoturno);
        System.out.println("turno di "+giocatoreCorrente.getNomegiocatore());
        giocatoreCorrente.pescaCarte(giocatoreCorrente.getMazzo(), giocatoreCorrente.getMano());
        giocatoreCorrente.evocaCarta(giocatoreCorrente.getMano(), giocatoreCorrente.getCarteincampo());    
    } 
    else {
        System.out.println("turno di "+giocatoreCorrente.getNomegiocatore());
        giocatoreCorrente.pescaCarte(giocatoreCorrente.getMazzo(), giocatoreCorrente.getMano());
        System.out.println(Arrays.toString(giocatoreCorrente.getMano()) );
        giocatoreCorrente.evocaCarta(giocatoreCorrente.getMano(), giocatoreCorrente.getCarteincampo()); 
        System.out.println(Arrays.toString(giocatoreCorrente.getCarteincampo()));
        giocatoreCorrente.attacca(avversario.getCarteincampo(), avversario);
        System.out.println(Arrays.toString(avversario.getCarteincampo()));   
    }
    turno++;
 }
    }
    

// Controlla se la partita è finita
public boolean isFinita() {
    return giocatore1.getVita() <= 0 || giocatore2.getVita() <= 0;
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
        turno(primoTurno);
        System.out.println(giocatore1.getVita());
    getVincitore();
 }
}
