package UI.Enter.ConsolCommand.Command;

import UI.Enter.ConsolCommand.Commands;
import UI.View;

public class AddProduct extends Commands {

    public AddProduct(View view) {
        super("Добавить новый продукт", view);
    }

    @Override
    public void execute() {
        getView().addProduct();
    }
}
