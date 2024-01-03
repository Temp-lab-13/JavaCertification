package Models.SaveLoder;

import java.io.Serializable;
import java.util.ArrayList;

public interface Recordable {
    void saveFile(String path, Serializable serializable);
    Object loadFile(String path);
    void printFile(String path, ArrayList<String[]> info);

}
