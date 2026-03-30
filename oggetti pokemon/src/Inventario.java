
import java.util.ArrayList;

public class Inventario {
    protected ArrayList<Item> beg = new ArrayList<>();

    public void addItem(Item item) {
        beg.add(0, item);
    }

    public void removeItem(Item item) {
        beg.remove(item);
    }

    public void chekItem(Item item) {
        for (int i = 0; i < beg.size(); i++) {
            if (beg.get(i) == item) {
                System.out.println(beg.get(0).toString());
            }
        }
        System.out.println("non presente");
    }
}
