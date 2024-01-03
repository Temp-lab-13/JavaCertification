package UI.Enter;

import java.util.Scanner;

public class ConsolInput {
    public String in(Scanner scanner){
        try {
            return scanner.nextLine();
        } catch (RuntimeException ex){
            System.out.println("Ошибка ввода" + ex);
        }
        return null;
    }
    public long inID(Scanner scanner){
        try {
            System.out.println("Укажите ID: ");
            long ID = Long.parseLong(in(scanner));
            return ID;
        } catch (RuntimeException ex){
            System.out.println("Ошибка ввода ID, попробуйте снова" + ex);
            return inID(scanner);
        }
    }
    public Integer inNumber(Scanner scanner){
        try {
            System.out.println("Укажите число: ");
            int number = Integer.parseInt(in(scanner));
            return number;
        } catch (RuntimeException ex){
            System.out.println("Ошибка ввода числа, попробуйте снова" + ex);
            return inNumber(scanner);
        }
    }

}
