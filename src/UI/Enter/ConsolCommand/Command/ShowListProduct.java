package UI.Enter.ConsolCommand.Command;

import UI.Enter.ConsolCommand.Commands;
import UI.View;

public class ShowListProduct extends Commands {

    public ShowListProduct(View view) {
        super("Показать товары магазина", view);
    }

    @Override
    public void execute() {
        getView().showListProduct();
    }
}
