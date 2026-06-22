package ex035;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Roberto", "roberto@email.com", 6.5));
        students.add(new Student("Larissa", "princess@gmail.com", 4.5));
        students.add(new Student("Juliana", "Jujuba123@gmail.com", 9.7));
        students.add(new Student("Carolina", "Carol.l@hotmail.com", 10));
        students.add(new Student("Renato", "renato1452@outlook.com", 7));
        // System.out.println(students);

        // serialização
        try{
            System.out.println(Desserializacao.desserializar("students.dat").toString());

        } catch(IOException e){
            System.err.println("IO Exception: " + e.getMessage());
        } catch(ClassNotFoundException e){
            System.out.println("Class not found: " + e.getMessage());
        }
       
        
    }
}
