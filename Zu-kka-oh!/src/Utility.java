public class Utility {
    public int trovaSpazioVuoto(Carta[]arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==null)  return i; }
        return 0;
    }
}
