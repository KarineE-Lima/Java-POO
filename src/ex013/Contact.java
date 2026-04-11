package ex013;

public class Contact{
    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
    public Contact(String name, String phone, String email){
        this(name, phone);
        this.email = email;
    }
    public String getName(){
        return this.name;
    }
    public String getPhone(){
        return this.phone;
    }
    public String getEmail(){
        return this.email;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String displayInfo(){
        return "Name: " +  this.name + "\nPhone: " + this.phone + "\nEmail: " + this.email + "\n";
    }
    public void updateContact(String phone, String email){
        this.setPhone(phone);
        this.setEmail(email);
    }


}