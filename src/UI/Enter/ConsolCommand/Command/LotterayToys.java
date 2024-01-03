package UI.Enter.ConsolCommand.Command;

import UI.Enter.ConsolCommand.Commands;
import UI.View;

public class LotterayToys extends Commands {
    public LotterayToys(View view) {
        super("Разыгнать игрушку", view);
    }

    @Override
    public void execute() {
        getView().lotterayToys();
    }
}
