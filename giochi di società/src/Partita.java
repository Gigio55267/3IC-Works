public class Partita {
    Giocatore[] players;
    int ultimovincitore;
    public Partita(Giocatore[] players) {
        this.players = players;
    }
    public void gioca(){
        int somma=0;
        for (int i = 0; i < players.length; i++) {
            int numero = (int)(Math.random()*(10-1))+1;
            somma+=numero;
        }
        int ris = somma % players.length;
        players [ris].partitevinte++;
        System.out.println("il vincitore è :"+players [ris].nome);
    }
    public void torneo (){
        for (int i = 0; i < 10; i++) {
            gioca();
        }
    }
    public void classifica(){
        Giocatore[]classifica=new Giocatore[players.length];
        classifica=Utility.insertionSortTotale(players);
        for (int i = 0; i < classifica.length; i++) {
            System.out.println((i+1)+" "+classifica[i].nome+" vittorie:"+classifica[i].partitevinte);
        }
    }
}
