package UI.Enter.ConsolCommand.Command;

import UI.Enter.ConsolCommand.Commands;
import UI.View;

public class PickToy extends Commands {

    public PickToy(View view) {
        super("Забрать разыгранную игрушку", view);
    }

    @Override
    public void execute() {
        getView().pickToy();
    }
}
