package ex013;

public class AddressBook {
    private Contact contacts[] = new Contact[10];
    private int ocupadas = 0;

    public void addContact(Contact newContact){
        if(addressBookIsFull())
            System.out.println("Lista de contatos cheia");
        else{
            this.contacts[ocupadas] = newContact;
            ocupadas++;
        }
            
    }

    public Contact findContactByName(String name){
        for(int i = 0; i < ocupadas; i++){
            if(contacts[i].getName().equals(name)){
                return contacts[i];
            }
        }
        return null;
    }

    public void ListAllContacts(){
        for (int i = 0; i < ocupadas; i++) {
            System.out.println(contacts[i].displayInfo());
        }
    }

    private boolean addressBookIsFull(){
        return this.ocupadas == 10;
    }

}
