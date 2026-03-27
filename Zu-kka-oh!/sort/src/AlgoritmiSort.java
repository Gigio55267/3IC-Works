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
    public static int[] selectionSort(int n, int min , int max){
        int[]ar=creaarray(n, max, min);
        int minimo=10000000;
        int index=0;
        for (int i = 0; i < ar.length; i++) {
            System.out.println("aura");
            for (int j = i; j < ar.length; j++) {
                if (minimo>ar[j]) {
                    System.out.println(minimo);
                    minimo=ar[j];
                    index=j;
                    System.out.println(minimo);
                }
            }
            System.out.println(index);
            ar[index]=ar[i];
            ar[i]=minimo;
            minimo=1000000000;
            System.out.println(Arrays.toString(ar));
        }
        return ar;
    }
    public static void main(String[] args) {
        int[]arr=creaarray(5, 30, 0);
        insertionSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}