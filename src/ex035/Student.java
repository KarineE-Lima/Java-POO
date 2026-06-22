package ex035;

import java.io.Serializable;

public class Student implements Serializable{
    private static final long serialVersionUID = 1L;
    private static int contador = 0;
    private int id;
    private String name;
    private String email;
    private double grade;

    public Student(String name, String email, double grade){
        this.id = ++contador;
        this.name = name;
        this.email = email;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public double getGrade() {
        return grade;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "[id: " + id + ", name: " + name + ", email: " + email + ", grade: " + grade + "]\n";
    }
    
}