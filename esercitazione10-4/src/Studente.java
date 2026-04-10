import java.util.ArrayList;
import java.util.Arrays;

public class Studente {
    private final String nome;
    private String classe;
    private ArrayList<Double> voti = new ArrayList<>();
    private final ArrayList<Double> accettabili = new ArrayList<>(Arrays.asList(0.00, 0.25, 0.50, 0.75, 0.90));

    public Studente(String classe, String nome) {
        this.classe = classe;
        this.nome = nome;
    }

    public void aggiungiVoto(double voto) {

        if (voto < 0)
            throw new VotoNonValido("voto massa basso coion");
        if (!accettabili.contains(voto - Math.floor(voto)))
            throw new VotoNonValido("voto non valido");
        if (voto > 10)
            throw new VotoNonValido("voto massa alto");
        voti.add(voto);
        System.out.println("hai aggiunto un voto :" + voto);
    }

    public void registraVotoString(String stringaVoto) {
        if (!Character.isDigit(stringaVoto.charAt(0)))
            throw new FormatoVotoStringaErrato("non puoi usare le lettere");
        if (stringaVoto.length() > 3)
            throw new FormatoVotoStringaErrato("massa alto");
        if (stringaVoto.charAt(0) == '1' && (stringaVoto.charAt(1) == '0')) {
            if (stringaVoto.length() == 2) {
                aggiungiVoto(10);
            } else if (stringaVoto.charAt(stringaVoto.length()) == '-') {
                aggiungiVoto(9.90);
            } else
                throw new FormatoVotoStringaErrato();
        }
        if (stringaVoto.charAt(stringaVoto.length())=='+') {
            Double.parseDouble(""+stringaVoto.charAt(0));
        }
        if (stringaVoto.charAt(stringaVoto.length())=='-') {
            Double.parseDouble(""+stringaVoto.charAt(0));
        }
        if (stringaVoto.charAt(stringaVoto.length())=='1⁄2') {
            Double.parseDouble(""+stringaVoto.charAt(0));
        }
        if (stringaVoto.charAt(stringaVoto.length())=='/') {
            Double.parseDouble(""+stringaVoto.charAt(0));
        }
    }
}
