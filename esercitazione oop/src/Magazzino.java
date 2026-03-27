public class Magazzino {
    public static void stampaInventario(Prodotto[] prodotti) {
        for (int i = 0; i < prodotti.length; i++) {
            System.out.println(prodotti[i].toString());
        }
    }

    public static void scontaTutto(Prodotto[] prodotti, int percentuale) {
        for (int j = 0; j < prodotti.length; j++) {
            if (prodotti[j] instanceof Scontabile s)
                s.applicaSconto(percentuale);
        }

    }

    public static void stampaSpedizioni(Object[] ordini) {
        for (int i = 0; i < ordini.length; i++) {
            if (ordini[i] instanceof Spedibile c){
                System.out.println("spedizioni: "+c.calcolaSpese());
            }
                
        }
    }
}
