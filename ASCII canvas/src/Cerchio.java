public class Cerchio implements Forma {
    private double centroX;
    private double centroY;
    private double raggio;
    private char carattere; // da stampare
    public Cerchio(double centroX, double centroY, double raggio, char carattere) {
        this.centroX = centroX;
        this.centroY = centroY;
        this.raggio = raggio;
        this.carattere = carattere;
    }
    @Override
    public boolean contiene(double x, double y) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contiene'");
    }
    @Override
    public char getCarattere() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCarattere'");
    }
    }