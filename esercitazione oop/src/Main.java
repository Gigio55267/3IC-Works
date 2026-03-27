public class Main {
    public static void main(String[] args) throws Exception {
        /*Elettronico e = new Elettronico("Laptop", 1000.0, 24);
        System.out.println(e.getPrezzoAttuale()); // 1000.0
        e.applicaSconto(20);
        System.out.println(e.getPrezzoAttuale()); // 800.0
        Digitale d = new Digitale("Suite Office", 149.0);
        System.out.println(d); // "Suite Office (digitale): €149.0"
        System.out.println(d.calcolaSpese()); // 0.0
        System.out.println(d.corriere());*/
        Prodotto[] catalogo = {
            new ProdottoAlimentare("Pasta", 1.50, 350, false),
            new Elettronico("Laptop", 999.0, 24),
            new Digitale("Antivirus", 29.99)
            };
            Magazzino.stampaInventario(catalogo);
            Magazzino.scontaTutto(catalogo, 10);
            Object[] ordini = {
            new Digitale("Ebook", 9.99),
            new Elettronico("Mouse", 30.0, 12),
            new Digitale("Gioco", 19.99)
            };
            Magazzino.stampaSpedizioni(ordini);
    }
}
