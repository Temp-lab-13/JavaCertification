package Models.Store;

import Models.Toys.Compair.ComparatorDrop;
import Models.Toys.Compair.IteratotToy;
import Models.Toys.Toy;
import UI.Enter.BuilderProduct.Buider;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Shop<P extends ShopItem<P>> implements Serializable, Iterable<P> {
    private long productID;
    //private PriorityQueue<P> productList;
    private ArrayList<P> productList;
    private ArrayList<String[]> listWinner;

    public ArrayList<P> getProductList() {
        return productList;
    }


    public Shop(){
        //productList = new PriorityQueue<>(new ComparatorDrop<P>());
        productList = new ArrayList<>();
        listWinner = new ArrayList<>();

    }

    public P getProduct(Long id){
        if (checkID(id)){
            for (P product : productList){
                if (product.getId().equals(id)){
                    return product;
                }
            }
        }
        return null;
    }

    public String getInfo(){
        StringBuilder info = new StringBuilder();
        for (P element : productList) {
            info.append(element);
            info.append("\n");
        }
        return info.toString();
    }
    @Override
    public String toString() {return  getInfo();}


    public boolean addProduct(P product){
        if (product == null){
            return false;
        }
        if (!productList.contains(product)){
            productList.add(product);
            product.setId(productID++);
            return true;
        }
        return false;
    }

    public boolean deleteProductInShop(Long id){
        if (checkID(id)){
            return productList.removeIf(n -> (n.getId() == id));
        }
        return false;
    }

    public boolean changedDropChance(Long id, int size){
        if (checkID(id)){
            for (P product : productList){
                if (product.getId().equals(id)){
                    product.setDrop_chance(size);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean changeQuantity(Long id, int quantity){
        if (checkID(id)){
            for (P product : productList){
                if (product.getId().equals(id)){
                    product.setQuantity(product.getQuantity() + quantity);
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkID(Long id){
        if(id != null & id >= 0){
            for (P product : productList){
                if (product.getId().equals(id)){
                    return true;
                }
            }
        }
        return false;
    }
    public ArrayList<String[]> getListWinner() {
        return listWinner;
    }

    public void setAddListWinner(String[] winner) {
        this.listWinner.add(winner);
    }

    public boolean setDeleteListWinner(String id){
        for (String[] element: listWinner){
            if (element[1].equals(id)){
               return listWinner.remove(element);
            }
        }
        return false;
    }

    public String showWinner(){
        StringBuilder info = new StringBuilder();
        for (String[] element : listWinner) {
            info.append(element[0]);
            info.append(element[1]);
            info.append("\n");
        }
        return info.toString();
    }


    @Override
    public Iterator<P> iterator() {
        return new IteratotToy<>(productList);
    }
}
