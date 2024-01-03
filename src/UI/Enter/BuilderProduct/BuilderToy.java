package UI.Enter.BuilderProduct;

import UI.Enter.ConsolInput;

import java.util.ArrayList;
import java.util.Scanner;

public class BuilderToy implements Buider {
    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    public Integer getDrop_chance() {
        return drop_chance;
    }

    private String title;
    private int quantity;
    private Integer drop_chance;
    private ConsolInput CI;
    private boolean cicle;


    @Override
    public void builder(Scanner scanner) {
        CI = new ConsolInput();

        try {
            do {
                System.out.println("Введите название игрушки: ");
                this.title = CI.in(scanner);
                if (title != " " && title != null){
                    cicle = false;
                } else {
                    cicle = true;
                    System.out.println("Наименование не введено. Попробуйте снова.");
                }
            } while (cicle);


            do {
                System.out.println("Введите колличество новых игрушек: ");
                quantity = CI.inNumber(scanner);
                if (quantity > 0){
                    cicle = false;
                } else {
                    cicle = true;
                    System.out.println("Не корректный ввод колличесва игрушек. Попробуйте снова.");
                }
            } while (cicle);


            do {
                System.out.println("Введите шанс выиграша(0-80): ");
                drop_chance = CI.inNumber(scanner);
                if(drop_chance > 0 && drop_chance <= 80){
                    cicle = false;
                } else {
                    cicle = true;
                    System.out.println("Не корректный ввод шанса выиграша. Попробуйте снова.");
                }
            } while (cicle);

        } catch (Exception ex){
            System.out.println("Критическая ошибка ввода!" + ex);
        }
    }
}
