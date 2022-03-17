import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String number) {
        this.myNumber = number;
        this.myContacts = new ArrayList<Contact>();
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (this.myContacts.get(i).getName().equals(contactName)) {
                return myContacts.indexOf(myContacts.get(i));
            }
        }
        return -1;
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position < 0) {
            System.out.println(oldContact.getName() + ", was not found");
            return false;
        } else if (findContact(newContact.getName()) >= 0) {
            System.out.println("Contact with name " + newContact.getName() + " already exist");
            return false;
        }

        myContacts.set(position, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);

        if (position >= 0) {
            myContacts.remove(contact);
            System.out.println(contact.getName() + ", was removed ");
            return true;
        }
        System.out.println(contact.getName() + ", was not found");
        return false;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            String name = myContacts.get(i).getName();
            String number = myContacts.get(i).getPhoneNumber();
            System.out.println((i + 1) + ". " + name + " -> " + number);
        }
    }
}
