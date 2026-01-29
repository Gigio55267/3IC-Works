

public class Utility {
    public static  boolean trovaSpazioVuoto(Carta[]arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==null)  return true ; }
        return false;
    }
    public static int dannominimo(){
        return 1;
    }
    public static Carta[] insertionSortTotale(Carta[] array){
        for (int i = 1; i < array.length; i++) {
            if (array[i] != null) {
                Carta elemento = array[i];
                int j = i - 1;
                if (array[j] != null){
                    while (j >= 0 && elemento.getPuntiTotali() < array[j].getPuntiTotali()){
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
