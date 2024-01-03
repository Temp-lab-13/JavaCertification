package Models.SaveLoder;

import java.io.*;
import java.io.Serializable;
import java.util.ArrayList;

public class RecordFile implements Recordable {
    @Override
    public void saveFile(String path, Serializable serializable) {
        try(ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream(path))) {
            outputStream.writeObject(serializable);
        } catch (IOException ex) {
            System.out.println("Не удалась запись файла" + ex);
        }
    }

    @Override
    public Object loadFile(String path) {
        try(ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream(path))) {
            return inputStream.readObject();

        } catch (ClassNotFoundException | IOException ex) {
            System.out.println("Не удалась запись файла" + ex);
        }
        return null;
    }

    @Override
    public void printFile(String path, ArrayList<String[]> info) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, false))) {
            for (String[]element: info){
                writer.write(element[0]);
                writer.write(element[1]);
                writer.append('\n');
            }
            System.out.println("Запись сделана.");
        } catch (RuntimeException | IOException ex) {
            System.out.println("Ошибка записи: " + ex.getMessage());
        }

    }











}
