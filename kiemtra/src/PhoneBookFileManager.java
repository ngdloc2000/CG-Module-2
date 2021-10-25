import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PhoneBookFileManager {
    public static List<PhoneBook> readFile() throws IOException, ClassNotFoundException {
        File file = new File("phonebook.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        if (file.length() >0){
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = objectInputStream.readObject();
            List<PhoneBook> list = (List<PhoneBook>) object;
            objectInputStream.close();
            fileInputStream.close();
            return list;
        }
        else return new ArrayList<>();
    }
    public static void writeFile(List<PhoneBook> students) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream("phonebook.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(students);
        objectOutputStream.close();
        fileOutputStream.close();
    }
}
