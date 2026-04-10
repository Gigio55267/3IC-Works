public class FormatoVotoStringaErrato extends RuntimeException {

    public FormatoVotoStringaErrato() {
        super("non ghe sta mona");
    }

    public FormatoVotoStringaErrato(String message) {
        super(message);
    }
    
}
