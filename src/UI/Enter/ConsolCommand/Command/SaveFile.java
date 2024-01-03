package UI.Enter.ConsolCommand.Command;

import UI.Enter.ConsolCommand.Commands;
import UI.View;

public class SaveFile extends Commands {

    public SaveFile(View view) {
        super("Сохранить данные магазина", view);
    }

    @Override
    public void execute() {
        getView().saveFile();
    }
}
