package Models.Toys.Compair;

import java.util.Iterator;
import java.util.List;

public class IteratotToy <E> implements Iterator<E> {

    private int index;
    private List<E> productList;

    public IteratotToy(List<E> personaList) {
        this.productList = personaList;
    }

    @Override
    public boolean hasNext() {
        return index < productList.size();
    }

    @Override
    public E next() {
        return productList.get(index++);
    }
}