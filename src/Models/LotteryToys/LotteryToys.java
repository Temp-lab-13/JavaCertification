package Models.LotteryToys;


import Models.Toys.Toy;
import java.util.*;

public class LotteryToys {
    public Long lotteryRandom(ArrayList<Toy> productList){

        try {
            NavigableMap<Integer, Long> toys = new TreeMap<>();
            int chances = 0;

            for (Toy product : productList){
                Long id = product.getId();
                Integer chance = product.getDrop_chance();
                chances += chance;
                toys.put(chances, id);
            }

            Random randomNumber = new Random(System.currentTimeMillis());
            Long win = toys.ceilingEntry(randomNumber.nextInt(chances + 1)).getValue();
            return win;
        }catch (NullPointerException ex){
            System.out.println("Нет доступных товаров.");
        }
        return (long) -1;
    }
}
