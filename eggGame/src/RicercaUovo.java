public class RicercaUovo {
    public static int[] creaarray(int n, int max, int min) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max - min) + min);
        }
        return arr;
    }

    public static int ricercaLineare(EggGame gioco, int numeroPiani) {
        
        for (int i = 0; i < numeroPiani; i++) {
            
            if (gioco.lanciaUovo(i).equals("SPLAT")) {
                return i;
            }
        }
        return 0;
        }
        public static int ricercaBinariauova(EggGame gioco, int numeroPiani){
            int min =0;
            int max=numeroPiani;
            int lancio=(numeroPiani+1)/2;
            while (min<max) {
                lancio=(min+max+1) /2;
                if (gioco.lanciaUovo(lancio).equals("SALVO")) {
                    min=lancio;
                }
                else {
                    max=lancio-1;
                    
                }
            }
            return min;
        }
        public static void confrontaRicerche(){
            int piani=10;
            int contli;
            int contbin;
            for (int i = 0; i < 8; i++) {
                EggGame kaka=new EggGame(piani);
                ricercaLineare(kaka, piani);
                contli=kaka.getContatoreNlanci();
                kaka.resetContatore();
                ricercaBinariauova(kaka, piani);
                contbin=kaka.getContatoreNlanci();
                System.out.println("piani:"+piani+"     lineare:"+contli+"      binaria:"+contbin);
                piani*=10;
            }
            
        }
    public static void main(String[] args) throws Exception {
        EggGame eggInc=new EggGame(30);
        confrontaRicerche();
    }
}
