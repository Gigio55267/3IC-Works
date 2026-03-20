import java.util.Random;
public class Giocodel15 {
    static Random random=new Random();
    public static void generaMatricePerIlGioco(int[]numeri, int[][]matrice){
        int numEstratto;

    for (int i = 0; i<matrice.length; i++){
        //ciclo delle righe

        for(int j = 0; j < matrice.length; j++) {
            //ciclo delle colonne

            do{
                numEstratto = numeri[random.nextInt(numeri.length)];

                //togliamo il numero generato Random dall'array
                if(numEstratto != 100){
                    matrice[i][j] = numEstratto;
                    for (int c = 0; c < numeri.length; c++) {
                       if(numEstratto == numeri[c])
                           numeri[c] = 100;
                    }
                }
            }while(numEstratto == 100);
        }
    }
 //return matrice;
    }
    private int[] cordinate(int[][]matr){
        int[]cordinate=new int[2];
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (matr[i][j]==0) {
                    cordinate[0]=i;
                    cordinate[1]=j;
            }
        }
        }
        return cordinate;
    }
    public void move(char car, int[][]matrice){
        int swap=0;
        int[]cordinate=cordinate(matrice);
        int x=cordinate[1];
        int y=cordinate[0];
        switch (car) {
            case 'w':
                if (verificamovimento(y++, x)) {
                    swap=matrice[y++][x];
                    matrice[y++][x]=0;
                    matrice[y][x]=swap;

                }
                break;
            case 's':
                
                break;
            case 'a':
                
                break;
            case 'd':
                
                break;
            default:
                throw new AssertionError();
        }
    }
    private boolean verificamovimento(int riga,int col){
        if(0<=riga&&riga<4 && 0<=col&&col<4) return true;
        else return false;
    }
    public static void main(String[] args) {
        int [] numeri= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int [][] tabbelone=new int[4][4];
        int [][] tab=new int[4][4];   
        generaMatricePerIlGioco(numeri,tab);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(j==3)System.out.println(" "+tab[i][j]);   
                    else System.out.print(" "+tab[i][j]);
            }
            
        }
    }
}