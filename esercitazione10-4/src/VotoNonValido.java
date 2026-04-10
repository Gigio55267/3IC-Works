public class VotoNonValido extends RuntimeException {
    public VotoNonValido(String message) {
        super(message);
    }

    public VotoNonValido(){
        super("non se può");
    }
}
