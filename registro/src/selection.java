public class selection {
    public static void selectionSort(Studente[] arr) {
        // Scorriamo tutto l'array
        for (int i = 0; i < arr.length - 1; i++) {
            // Trova l'indice del minimo elemento nella parte non ordinata
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].cognome.compareTo(arr[minIndex].cognome) < 0) {
                    minIndex = j;
                }
            }

            // Scambia il minimo elemento trovato con il primo elemento non ordinato
            Studente temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
