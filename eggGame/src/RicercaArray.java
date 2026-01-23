public class RicercaArray {
    public static int ricercaBinariauova(int[] arr, int target) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int lancio = (min + max + 1) / 2;
            if (arr[lancio] == target) {
                return lancio;
            } else if (arr[lancio] < target) {
                min = lancio + 1;
            } else {
                max = lancio - 1;
            }
        }
        return -1;
    }

    public static int ricercaLineare(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int[] creaarray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }
    public static void provaTempoEsecuzione() {
        int[] dimensioni = {10, 100, 1000, 10000, 100000, 1000000};
        for (int n : dimensioni) {
        int[]arr=creaarray(n);
        int target=(int)Math.random()*(n-0);
        provaTempolineare(arr, n);
        provaTempobin(arr, n);
        }
        }
        public static void provaTempolineare(int[]arr,int aura) {
            long startTime = System.nanoTime();
            ricercaLineare(arr, aura);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            int elementi=aura;
            System.out.println("elementi"+elementi+"           "+"Tempo: " + duration + " ns");
        }
        public static void provaTempobin(int[]arr,int aura) {
            long startTime = System.nanoTime();
            ricercaBinariauova(arr, aura);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            int elementi=aura;
            System.out.println("elementi"+elementi+"           "+"Tempo: " + duration + " ns");
        }

    public static void main(String[] args) {
        int n=0;
            int lin=ricercaLineare(creaarray(n), 0);
            System.out.println("il risultato è:"+lin);
            int bin=ricercaBinariauova(creaarray(n),0);
            System.out.println("il risultato è:"+bin);
        }
}
