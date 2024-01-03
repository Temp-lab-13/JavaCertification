package Models.LotteryToys.BuilderWinner;

import Models.Store.ShopItem;


public class BuilderWinner<P extends ShopItem<P>> {
    public String[] buiderWinner(P winner){
        String[] product = new String[2];
        StringBuilder nameProduct = new StringBuilder();
        nameProduct.append("Игрушка: ");
        nameProduct.append(winner.getTitle());
        nameProduct.append(", ");
        nameProduct.append("ID - ");
        //nameProduct.append(winner.getId());
        //nameProduct.append(";");
        //nameProduct.append("\n");
        product[1] = String.valueOf(winner.getId());
        product[0] = nameProduct.toString();

        return product;
    }
}
