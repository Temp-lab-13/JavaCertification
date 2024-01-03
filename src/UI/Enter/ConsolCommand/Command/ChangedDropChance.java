package UI.Enter.ConsolCommand.Command;

import UI.Enter.ConsolCommand.Commands;
import UI.View;

public class ChangedDropChance extends Commands {

    public ChangedDropChance(View view) {
        super("Изменить шанс выиграша продукта", view);
    }

    @Override
    public void execute() {
        getView().changedDropChance();
    }
}