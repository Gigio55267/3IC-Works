import java.util.Arrays;

public class AlgoritmiSort {
    public static int[] creaarray(int n, int max, int min) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max - min) + min);
        }
        return arr;
    }

    public static void insertionSort(int[] arr, int n) {
        int j = 0;
        int elemento;
        for (int i = 1; i < n; i++) {
            elemento = arr[i];
            j = i - 1;
            while (j >= 0 && elemento < arr[j]) {
                arr[j + 1] = arr[i];
                j--;
            }
            arr[j + 1] = elemento;
        }
    }
    public static int[] selectionSort(int[] arr, int n){
        int[]ar=arr;
        int min=10000000;
        int index=0;
        for (int i = 0; i < ar.length-1; i++) {
            System.out.println("aura");
            for (int j = i; j < ar.length-1; j++) {
                if (min>ar[j]) {
                    System.out.println(min);
                    min=ar[j];
                    index=j;
                    System.out.println(min);
                }
            }
            ar[index]=ar[i];
            ar[i]=min;
        }
        return ar;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(creaarray(5, 50, 1), 5)));
    }
}