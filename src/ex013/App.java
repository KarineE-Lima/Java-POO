package ex013;

public class App {
    public static void main(String[] args) {

        Contact c1 = new Contact("Karine", "99999-9999", "karine@email.com");
        AddressBook addressBook = new AddressBook();
        addressBook.addContact(c1);
        addressBook.addContact(new Contact("Maria", "988888-7777", "mariazinha@email.com"));
        addressBook.ListAllContacts();

    }
}
