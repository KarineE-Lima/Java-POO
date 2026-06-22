package ex035;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serializacao {
    public static void serializar(ArrayList<Object> object, String name) throws IOException{
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(name));
        objectOutputStream.writeObject(object);
        objectOutputStream.close();
    }
}
