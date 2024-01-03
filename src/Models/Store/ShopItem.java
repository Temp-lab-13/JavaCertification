package Models.Store;

public interface ShopItem <P>{
    Integer getDrop_chance();
    String getTitle();
    Long getId();
    void setId(Long id);
    void setDrop_chance(int drop_chance);
    void setQuantity(int quantity);
    int getQuantity();



}
