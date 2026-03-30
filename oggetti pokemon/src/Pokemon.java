//Un Pokemon con HP, attacco, difesa, status (avvelenato, KO, paralizzato, addormentato)
public class Pokemon extends HeldItem {
    private int hp;
    private int atk;
    private int difesa;
    private String status;

    public Pokemon(int hp, int atk, int difesa, String status) {
        this.hp = hp;
        this.atk = atk;
        this.difesa = difesa;
        this.status = status;
    }

    @Override
    public boolean equipped() {
        if (this.equipaggiato) {
            System.out.println("c'è gia qualcosa equipaggiato");
            return true;
        } else {
            System.out.println("libero");
            return false;
        }
    }

    @Override
    public void equipaggia(Item equipaggia) {
            this.item = equipaggia;
            this.equipaggiato=true;
    }

    @Override
    public void disequipaggia() {
        this.item=null;
        this.equipaggiato=false;
    }
}
