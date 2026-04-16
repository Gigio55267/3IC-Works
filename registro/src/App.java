public class App {
    public static void main(String[] args) throws Exception {
        Studente[] studenti = new Studente[5];
        studenti[0] = new Studente("Mario", "Rossi", 7.5);
        studenti[1] = new Studente("Luca", "Bianchi", 8.0);
        studenti[2] = new Studente("Giulia", "Verdi", 6.0);
        studenti[3] = new Studente("Sara", "Neri", 9.0);
        studenti[4] = new Studente("Paolo", "Gialli", 5.5);
        Insertion insertion = new Insertion();
        insertion.insertionSort(studenti);
        System.out.println("Studenti ordinati per voto:");
        for (Studente studente : studenti) {
            System.out.println(studente.nome + " " + studente.cognome + ": " + studente.voto);
        }
        selection.selectionSort(studenti);
        System.out.println("Studenti ordinati per cognome:");
        for (Studente studente : studenti) {
            System.out.println(studente.cognome + " " + studente.nome + ": " + studente.voto);
        }
    }
}
