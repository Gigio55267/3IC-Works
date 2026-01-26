public class Utility {
    public static  boolean trovaSpazioVuoto(Carta[]arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==null)  return true ; }
        return false;
    }
}
