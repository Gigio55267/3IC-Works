public class Merge {
        public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            // Ricorsivamente ordina la prima metà
            mergeSort(array, left, middle);

            // Ricorsivamente ordina la seconda metà
            mergeSort(array, middle + 1, right);

            // Unisci le due metà ordinate
            merge(array, left, middle, right);
        }
    }

    // Metodo per unire due sotto-array ordinati in un unico array ordinato
private static void merge(int[] array, int left, int middle, int right) {
    // Calcola la lunghezza del primo sotto-array (da left a middle)
    int n1 = middle - left + 1;
    // Calcola la lunghezza del secondo sotto-array (da middle+1 a right)
    int n2 = right - middle;

    // Crea due array temporanei per contenere le due metà da unire
    int[] leftArray = new int[n1];
    int[] rightArray = new int[n2];

    // Copia gli elementi della prima metà nell'array temporaneo leftArray
    for (int i = 0; i < n1; i++) {
        leftArray[i] = array[left + i];
    }
    // Copia gli elementi della seconda metà nell'array temporaneo rightArray
    for (int j = 0; j < n2; j++) {
        rightArray[j] = array[middle + 1 + j];
    }

    // Indici per scorrere i due array temporanei e l'array originale
    int i = 0, j = 0, k = left;

    // Unisci gli elementi dei due array temporanei nell'array originale in ordine crescente
    while (i < n1 && j < n2) {
        if (leftArray[i] <= rightArray[j]) {
            array[k++] = leftArray[i++];  // Prendi elemento da leftArray se è minore o uguale
        } else {
            array[k++] = rightArray[j++]; // Altrimenti prendi elemento da rightArray
        }
    }

    // Se ci sono elementi rimanenti in leftArray, copiali nell'array originale
    while (i < n1) {
        array[k++] = leftArray[i++];
    }

    // Se ci sono elementi rimanenti in rightArray, copiali nell'array originale
    while (j < n2) {
        array[k++] = rightArray[j++];
    }
}

// Metodo principale per testare il merge sort
public static void main(String[] args) {
    // Definisce un array di interi non ordinato
    int[] array = {38, 27, 43, 3, 9, 82, 10};

    // Chiama il metodo ricorsivo mergeSort per ordinare l'intero array
    mergeSort(array, 0, array.length - 1);

    // Stampa l'array ordinato a video
    for (int num : array) {
        System.out.print(num + " ");
    }
}

}
