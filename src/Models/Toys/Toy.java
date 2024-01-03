package Models.Toys;

import Models.Store.ShopItem;

import java.io.Serializable;

public class Toy implements ShopItem<Toy>, Serializable {
    private Long id;
    private String title;
    private int quantity;
    private Integer drop_chance;

    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public int getQuantity() {
        return quantity;
    }
    public Integer getDrop_chance() {
        return drop_chance;
    }

    public Toy(String title, Integer quantity, int drop_chance) {
        this.id = id;
        this.title = title;
        this.quantity = quantity;
        this.drop_chance = drop_chance;
    }

    public Toy(int drop_chance) {
        this(null, null, drop_chance);
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setDrop_chance(int drop_chance) {
        this.drop_chance = drop_chance;
    }



    public String getInfo(){
        StringBuilder infoDate = new StringBuilder();
        infoDate.append("ID: ");
        infoDate.append(id);
        infoDate.append(", Название: ");
        infoDate.append(title);
        infoDate.append(", Колличество: ");
        infoDate.append(quantity);
        infoDate.append(", Шанс: ");
        infoDate.append(drop_chance);
        return infoDate.toString();
    }

    public String toString(){
        return  getInfo();
    }
}


