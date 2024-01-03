package Models.Service;

import Models.LotteryToys.BuilderWinner.BuilderWinner;
import Models.LotteryToys.LotteryToys;
import Models.SaveLoder.RecordFile;
import Models.SaveLoder.Recordable;
import Models.Store.Shop;
import Models.Toys.Toy;
import UI.Enter.BuilderProduct.Buider;

import java.util.Arrays;


public class Service {
    private Shop<Toy> shop;
    private Recordable record;
    private String adress;
    private String adressDataBase;
    private LotteryToys lotteryToys;




    public Service(){
        shop = new Shop<>();
        adress = "src/Models/SaveLoder/save/save.txt";
        adressDataBase = "src/Models/SaveLoder/save/DataBase.out";
        record = new RecordFile();
        lotteryToys = new LotteryToys();
    }

    public boolean addProduct(Buider product){
        Toy toy = new Toy(product.getTitle(), product.getQuantity(), product.getDrop_chance());
        return shop.addProduct(toy);
    }

    public String showListProduct(){

        return shop.getInfo();
    }

    public boolean deleteProductInShop(Long id){
        return shop.deleteProductInShop(id);
    }

    public boolean changeQuantity(Long id, int quantity){
        return shop.changeQuantity(id, quantity);
    }

    public boolean changedDropChance(Long id, int size){
        return shop.changedDropChance(id, size);
    }

    public void saveFile(){
        record.saveFile(adressDataBase, shop);
    }
    public void loadFile(){
       shop = (Shop<Toy>) record.loadFile(adressDataBase);
    }

    public String lotteryToys(){
        Long idWinner = lotteryToys.lotteryRandom(shop.getProductList());

        if(idWinner != -1 && shop.getProduct(idWinner).getQuantity() > 0){

            BuilderWinner<Toy> winner = new BuilderWinner<>();
            String[] temp = winner.buiderWinner(shop.getProduct(idWinner));
            shop.setAddListWinner(temp);
            record.printFile(adress, shop.getListWinner());
            shop.changeQuantity(idWinner, -1);
            if(shop.getProduct(idWinner).getQuantity() <= 0){
                deleteProductInShop(idWinner);
            }
            return Arrays.toString(temp);
        }
        return "Ничего не выиграло.";
    }

    public boolean pickToy(String id){
        if (shop.setDeleteListWinner(id)){
            record.printFile(adress, shop.getListWinner());
            return true;
        }
        return false;
    }

    public String showWinner(){
        return shop.showWinner();
    }

    public boolean Exit(){
        return false;
    }

    public void test(){
        Toy toy1 = new Toy("Кула", 5, 20);
        Toy toy2 = new Toy("Пазлы", 14, 40);
        Toy toy3 = new Toy("Машинка", 10, 30);
        shop.addProduct(toy1);
        shop.addProduct(toy2);
        shop.addProduct(toy3);
    }





}
