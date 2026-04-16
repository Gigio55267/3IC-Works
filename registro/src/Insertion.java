public class Insertion {
    public void insertionSort(Studente[] arr) {
        for (int i = 0; i < arr.length; i++) {
           if (i==arr.length-1) break;
           else {
            ricorsivo(arr);
           }
           
            
        } 
        
        
    }

    private void ricorsivo(Studente[] arr) {
        for (int j = arr.length-1; j > 0; j--) {
            if (arr[j].voto>arr[j-1].voto) {
                Studente mid = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = mid;
            }
        }
    }
}
