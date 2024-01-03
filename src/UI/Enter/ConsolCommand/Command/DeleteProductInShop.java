package UI.Enter.ConsolCommand.Command;

import UI.Enter.ConsolCommand.Commands;
import UI.View;

public class DeleteProductInShop extends Commands {

    public DeleteProductInShop(View view) {
        super("Удалить продукт из магазина", view);
    }

    @Override
    public void execute() {
        getView().deleteProductInShop();
    }
}