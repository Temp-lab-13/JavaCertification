package UI.Enter.ConsolCommand.Command;

import UI.Enter.ConsolCommand.Commands;
import UI.View;

public class Exit extends Commands {

    public Exit(View view) {
        super("Выйти из магазина", view);
    }

    @Override
    public void execute() {
        getView().Exit();
    }
}
