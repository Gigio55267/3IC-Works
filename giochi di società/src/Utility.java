public class Utility {
    public static Giocatore[] insertionSortTotale(Giocatore[] array){
        for (int i = 1; i < array.length; i++) {
            if (array[i] != null) {
                Giocatore elemento = array[i];
                int j = i - 1;
                if (array[j] != null){
                    while (j >= 0 && elemento.partitevinte > array[j].partitevinte){
                        array[j + 1] = array[j];
                        j--;
                    }
                    array[j + 1] = elemento;
                }
            }
        }
        return array;
    }
}
