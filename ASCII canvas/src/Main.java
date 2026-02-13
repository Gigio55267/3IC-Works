public class Main {
    public static void main(String[] args) {
        Rettangolo prova=new Rettangolo(5, 3, '#');
        ASCIICanvas main =new ASCIICanvas(15, 10);
        main.aggiungiForma(prova);
        main.disegna();
    }
}
