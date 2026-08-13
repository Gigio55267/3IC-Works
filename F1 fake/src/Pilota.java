public class Pilota {
    private final String NOME ;
    private final String COGNOME;
    private int numero ;
    private int eta ;
    private String scuderia;
    public Pilota(String nome, String cognome, int numero, int eta, String scuderia) {
        this.NOME = nome;
        this.COGNOME = cognome;
        this.numero = numero;
        this.eta = eta;
        this.scuderia = scuderia;
    }
    public void infopilota(){
        System.out.println("nome: "+NOME+" cognome: "+COGNOME+" numeropilota: "+numero+" età: "+eta+" scuderia: "+scuderia);
    }
    //permette il traferimento di un pilota 
    public void trasferimento(String scuderianuova){
        this.setScuderia(scuderianuova);
    }

    public void setScuderia(String scuderia) {
        this.scuderia = scuderia;
    }
}
