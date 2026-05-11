public abstract class Bauleastratto {
    protected String name ;
    protected int mincart;
    protected int maxcart;
    protected String raritagarantita;

    public Bauleastratto(int maxcart, int mincart, String name) {
        this.maxcart = maxcart;
        this.mincart = mincart;
        this.name = name;
    }
}
