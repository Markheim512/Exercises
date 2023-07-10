import java.util.ArrayList;
import java.util.Objects;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) != -1) return false;
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        //if (!myContacts.contains(oldContact)) return false;
        int index = findContact(oldContact);
        if (index == -1) return false;
        myContacts.set(index, newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) == -1) return false;
        myContacts.remove(contact);
        return true;
    }

    private int findContact(Contact contact) {
        System.out.println("findContact(contact returns " + myContacts.indexOf(contact));
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (Objects.equals(myContacts.get(i).getName(), name)) return i;
        }
        return -1;
    }

    public Contact queryContact(String name) {
//        for(int i=0; i<myContacts.size(); i++) {
//            if (Objects.equals(myContacts.get(i).getName(), name)) return myContacts.get(i);
//        }
//        return null;
        int index = findContact(name);
        if (index == -1) return null;
        return myContacts.get(index);
    }

    public void printContacts() {
        System.out.println("Contact list:");
        for(int i=0; i<myContacts.size(); i++) {
            System.out.println((i+1) + ". " + myContacts.get(i).getName() + " -> " +myContacts.get(i).getPhoneNumber());
        }
    }
}
