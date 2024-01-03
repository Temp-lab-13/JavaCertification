package UI.Enter.ConsolCommand.Command;

import UI.Enter.ConsolCommand.Commands;
import UI.View;

public class LoadFile extends Commands {

    public LoadFile(View view) {
        super("Зугрузить данные магазина", view);
    }

    @Override
    public void execute() {
        getView().loadFile();
    }
}
