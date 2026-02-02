
public class Regola {
    String[] rule={"111","110","101","100","011","010","001","000"};
    public static String[] calcolaREgola(int[]regola){
        String[] regolato =new String[8];
        int cont=0;
        for (int i = 0; i < regola.length; i+=3) {
            for (int j = 0; j < 3; j++) {
                regolato[cont]+=""+regola[j];
            }
            cont++;
        }
        return regolato;
    }
    
}
