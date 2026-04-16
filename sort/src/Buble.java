public class Buble {
    private static void bublesort(int[] arr){
        for (int j = 0; j < arr.length; j++) { 
            for (int i = 0; i < arr.length-j-1; i++) {
                //verifichiamo se  il numero in i è maggiore del numero in i+1
                if (arr[i] > arr[i+1]){
                    //se è vero allora scambiamo i due numeri
                    int mid =arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = mid;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println("Array prima dell'ordinamento:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        bublesort(arr);

        System.out.println("Array dopo l'ordinamento:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
