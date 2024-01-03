package UI;

import Models.Toys.Toy;
import Presentor.Presentor;
import UI.Enter.BuilderProduct.Buider;
import UI.Enter.BuilderProduct.BuilderToy;
import UI.Enter.ConsolCommand.consoleMain;
import UI.Enter.ConsolInput;
import UI.Enter.InputCommandCheck.ConvertInput;

import java.util.Scanner;

public class ConsolUI implements View {
    private Scanner scanner;
    private ConsolInput scan;
    private Presentor presentor;
    private consoleMain menu;
    private boolean cycle;

    public ConsolUI(){
        presentor = new Presentor(this);
        menu = new consoleMain(this);
        scan = new ConsolInput();
        scanner = new Scanner(System.in);
        cycle = true;
    }

    @Override
    public void start() {
        while (cycle){
            catalogCommand();
            consoleWork();
        }
        scanner.close();
    }

    @Override
    public void answer(String answer) {
        System.out.println(answer);
    }

    private  void catalogCommand(){
        System.out.println(menu.print());
    }

    private void consoleWork(){
        System.out.println("Ввод команды: ");
        String enterConsol = scanner.nextLine();
        ConvertInput converEnter = new ConvertInput(enterConsol, menu.size());
        Integer enterTrue = converEnter.convertEnter();
        if(enterTrue != null){
            menu.execute(enterTrue);
        }
    }

    public void test(){
        presentor.test();
    }

    public void addProduct(){
        Buider product = new BuilderToy();
        product.builder(scanner);
        presentor.addProduct(product);
    }




    public void showListProduct(){
        presentor.showListProduct();
    }

    public void lotterayToys() {
        presentor.lotteryToys();
    }

    public void deleteProductInShop(){
        presentor.deleteProductInShop(scan.inID(scanner));
    }

    public void changeQuantity(){
        presentor.changeQuantity(scan.inID(scanner), scan.inNumber(scanner));
    }
    public void changedDropChance(){
        presentor.changedDropChance(scan.inID(scanner), scan.inNumber(scanner));
    }
    public void pickToy(){
        presentor.showWinner();
        presentor.pickToy(scan.in(scanner));
    }

    public void saveFile(){
        presentor.saveFile();
    }

    public void loadFile(){
        presentor.loadFile();
    }

    public void Exit(){
        this.cycle = presentor.Exit();
    }
}
