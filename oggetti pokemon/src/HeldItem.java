public abstract class HeldItem {
    protected boolean equipaggiato; 
    protected Item item;
    public HeldItem() {
        this.equipaggiato = false;
    }

    public abstract  boolean equipped();

    public abstract void equipaggia(Item item);

    public abstract  void disequipaggia();
}
