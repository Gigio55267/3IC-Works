public class ZuccamoneEvolvibile extends Zuccamon{
    private String formaevoluta;
    private  int esp;
    private boolean evoluto;
    public ZuccamoneEvolvibile(String nome, Elemento tipo, int puntiVita, int attacco, String nome2) {
        super(nome, tipo, puntiVita, attacco);
        this.formaevoluta = nome2;
        this.esp = 0;
        this.evoluto = false;
    }
    public String getFormaevoluta() {
        return formaevoluta;
    }
    public int getEsp() {
        return esp;
    }
    public boolean isEvoluto() {
        return evoluto;
    }
    public void setFormaevoluta(String formaevoluta) {
        this.formaevoluta = formaevoluta;
    }
    public void setEsp(int esp) {
        this.esp = esp;
    }
    public void setEvoluto(boolean evoluto) {
        this.evoluto = evoluto;
    }
    public void guadagnaEsperienza(int exp){
        this.setEsp(this.getEsp()+exp);
        if (this.getEsp()>=50 && this.isEvoluto()!=true) {
            this.evolvi();
        }
    }
    private void evolvi(){
        this.setNome(this.getFormaevoluta());
        this.setEvoluto(true);
        this.setPuntiVita(this.getPuntiVita()+20);
        this.setAttacco(this.getAttacco()+10);
    }
}
