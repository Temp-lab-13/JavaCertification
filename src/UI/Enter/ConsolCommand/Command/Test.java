package UI.Enter.ConsolCommand.Command;

import UI.Enter.ConsolCommand.Commands;
import UI.View;

public class Test extends Commands {

    public Test(View view) {
        super("Тестовый стэнд", view);
    }

    @Override
    public void execute() {
        getView().test();
    }
}
