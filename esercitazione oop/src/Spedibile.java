public interface Spedibile {
    public double calcolaSpese(); // restituisce le spese di spedizione

    public default String corriere() {
        return "GLS";
    }
}
