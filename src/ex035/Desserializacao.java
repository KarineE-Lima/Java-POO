package ex035;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Desserializacao {
    public static ArrayList<Object> desserializar(String fileName) throws IOException, ClassNotFoundException{
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
        ArrayList<Object> objeto = (ArrayList<Object>) objectInputStream.readObject();
        objectInputStream.close();
        return objeto;
    }
}
