package Presentor;

import Models.Service.Service;
import UI.Enter.BuilderProduct.Buider;
import UI.View;

public class Presentor {
    private View view;
    private Service service;

    public Presentor(View view){
        this.view = view;
        service = new Service();
    }

    public void addProduct(Buider buider){
        if(service.addProduct(buider)){
            view.answer("Продукт добавлен.");
        } else {
            view.answer("Не удалось добавить продукт.");
        }
    }

    public void showListProduct(){
        view.answer("Список:");
        String listInfo = service.showListProduct();
        view.answer(listInfo.toString());
    }

    public void lotteryToys(){
        String winner = service.lotteryToys();
        view.answer(winner);
    }

    public void deleteProductInShop(Long id){
        if(service.deleteProductInShop(id)){
            view.answer("Удалено.");
        } else {
            view.answer("Не удалось Удалить");
        }
    }

    public void changeQuantity(Long id, int quantity){
        if(service.changeQuantity(id, quantity)){
            view.answer("Изменено.");
        } else {
            view.answer("Не удалось изменить");
        }
    }

    public void changedDropChance(Long id, int size){
        if(service.changedDropChance(id, size)){
            view.answer("Изменено.");
        } else {
            view.answer("Не удалось изменить");
        }
    }

    public void pickToy(String id){
        if(service.pickToy(id)){
            view.answer("Игрушка выдана.");
        } else {
            view.answer("Игрушка не найдена. Обратитесь к администратору.");
        }
    }

    public void showWinner(){
        String info = service.showWinner();
        view.answer(info);
    }

    public void saveFile(){
        view.answer("Сохраняем...");
        service.saveFile();

    }

    public void loadFile(){
        view.answer("Загружаем...");
        service.loadFile();

    }

    public boolean Exit(){
        view.answer("Завершение работы...");
        return service.Exit();
    }

    public void test(){
        service.test();
        view.answer("Стенд загружен");

    }



}
