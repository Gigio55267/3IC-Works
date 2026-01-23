public enum  Elemento {
    ACQUA,FUOCO,ERBA,ELETRO,NORMALE;
    public double calcolaEfficacia(Elemento difensore){
        if (this == FUOCO && difensore==ERBA) {
            System.out.println("è superefficace");
            return 2;
        }
        else if (this == ACQUA && difensore == FUOCO) {
            System.out.println("è superefficace");
            return 2;
        }
        else if (this == ERBA && difensore==ACQUA) {
            System.out.println("è superefficace");
            return 2;
        }
        else if (this == ELETRO && difensore == ACQUA) {
            System.out.println("è superefficace");
            return 2;
        }
        else if (this == FUOCO && difensore==ACQUA) {
            System.out.println("non efficace");
            return 0.5;
        }
        else if (this == FUOCO && difensore==FUOCO) {
            System.out.println("non efficace");
            return 0.5;
        }
        else if (this == ACQUA && difensore==ACQUA) {
            System.out.println("non efficace");
            return 0.5;
        }
        else if (this == ACQUA && difensore == ERBA) {
            System.out.println("non efficace");
            return 0.5;
        }
        else if (this == ELETRO && difensore==ELETRO) {
            System.out.println("non efficace");
            return 0.5;
        }
        else if (this == ELETRO && difensore == ERBA) {
            System.out.println("non efficace");
            return 0.5;
        }
        else if (this == ERBA && difensore==ERBA) {
            System.out.println("non efficace");
            return 0.5;
        }
        else if (this == ERBA && difensore == FUOCO) {
            System.out.println("non efficace");
            return 0.5;
        }
        return 1;
        
    }
}
