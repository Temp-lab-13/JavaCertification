package UI.Enter.ConsolCommand;


import UI.View;

public abstract class Commands {
    private String description;

    private View view;

    public Commands(String description, View view){
        this.description = description;
        this.view = view;
    }

    public String getDescription(){
        return  description;
    }

    public View getView() {
        return view;
    }

    public abstract void execute();
}
