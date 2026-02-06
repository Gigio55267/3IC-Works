


public class Regola {
    public static char[] calcolaREgola(int regola){
        char[] regolato =new char[8];
        String binari =Integer.toBinaryString(regola);
        if (binari.length()<8) {
            regolato[0]='0';
            for (int i = 0; i < binari.length(); i++) {
                System.out.println(binari);
                regolato[i+1]= binari.charAt(i);
                System.out.println(i);
            } 
        }
        else{
            for (int i = 0; i < 7; i++) {
                System.out.println(binari);
                regolato[i]= binari.charAt(i);
                System.out.println(i);
            }
        }

          
        return regolato;
    }
    
}
