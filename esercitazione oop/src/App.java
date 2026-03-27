public class App {
    public static void main(String[] args) throws Exception {
        ProdottoAlimentare a = new ProdottoAlimentare("Pasta", 1.50, 350, false);
        System.out.println(a); // "Pasta (350 kcal, no refrigerazione): €1.5"
        Elettronico e = new Elettronico("Laptop", 800.0, 24);
        System.out.println(e); // "Laptop (garanzia 24 mesi): €800.0"
        Abbigliamento ab = new Abbigliamento("Giacca", 120.0, "L");
        System.out.println(ab); // "Giacca (taglia L): €120.0"
        e.applicaIVA(0.22);
        System.out.println(e);
    }
}
