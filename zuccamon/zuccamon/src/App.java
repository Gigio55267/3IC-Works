public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Zuccamon zambelli=new Zuccamon("zambelli", Elemento.ERBA, 250, 150);
        ZuccamoneEvolvibile peris =new  ZuccamoneEvolvibile("peris", Elemento.FUOCO, 150,200, "super peris EX");
        peris.attacca(zambelli);
        System.out.println(peris.toString());
        System.out.println(zambelli.toString());
        System.out.println(zambelli.isVivo());
        peris.guadagnaEsperienza(60);
        System.out.println(peris.toString());
    }
}
