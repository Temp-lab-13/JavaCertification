package UI.Enter.ConsolCommand.Command;

import UI.Enter.ConsolCommand.Commands;
import UI.View;

public class ChangeQuantity extends Commands {

    public ChangeQuantity(View view) {
        super("Изменить колличесво продукта", view);
    }

    @Override
    public void execute() {
        getView().changeQuantity();
    }
}