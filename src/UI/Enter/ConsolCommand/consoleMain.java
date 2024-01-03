package UI.Enter.ConsolCommand;

import UI.Enter.ConsolCommand.Command.*;
import UI.View;

import java.util.ArrayList;
import java.util.List;

public class consoleMain {
    private List<Commands> commandList;

    public consoleMain(View view){
        commandList = new ArrayList<>();
        commandList.add(new AddProduct(view));
        commandList.add(new ShowListProduct(view));
        commandList.add(new LotterayToys(view));
        commandList.add(new DeleteProductInShop(view));
        commandList.add(new ChangeQuantity(view));
        commandList.add(new ChangedDropChance(view));
        commandList.add(new PickToy(view));
        commandList.add(new SaveFile(view));
        commandList.add(new LoadFile(view));
        commandList.add(new Exit(view));
        commandList.add(new Test(view));

    }

    public  String print(){
        StringBuilder printCommand = new StringBuilder();
        printCommand.append("Command: ");
        printCommand.append("\n");
        for(int i = 0; i < commandList.size(); i++){
            printCommand.append(i+1);
            printCommand.append(". ");
            printCommand.append(commandList.get(i).getDescription());
            printCommand.append("\n");
        }
        return printCommand.toString();
    }
    public  void  execute(int commandNumber){
        Commands command = commandList.get(commandNumber - 1);
        command.execute();
    }

    public  int size(){
        return  commandList.size();
    }

}
