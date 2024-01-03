package Models.Toys.Compair;
import java.util.Comparator;

import Models.Store.Shop;
import Models.Store.ShopItem;
import Models.Toys.Toy;

public class ComparatorDrop<T extends ShopItem<T>> implements Comparator<T>{
    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o2.getDrop_chance() , o1.getDrop_chance());
    }
}
