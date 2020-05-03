import java.util.ArrayList;
import java.util.List;

public class Contacts {
    private List<Contact> contacts = new ArrayList<>();

    public void gatherContact() {
        Contact contact = new Contact();
        this.gatherContact(contact);
        this.contacts.add(contact);
    }

    public void gatherContact(Contact contact) {
        contact.name = GatherInput.gatherStringInput("Enter name " + contact.name, true);
        contact.address = GatherInput.gatherStringInput("Enter address " + contact.address, false);
        contact.phoneNumber = GatherInput.gatherStringInput("Enter phone " + contact.phoneNumber, false);
        contact.email = GatherInput.gatherStringInput("Enter email " + contact.email, false);
    }

    public Contact find(int id) {
        return this.contacts.get(id - 1);
    }

    public void remove(int id) {
        this.contacts.remove(id - 1);
    }

    public boolean hasContacts() {
        return this.numberOfContacts() > 0;
    }

    public int numberOfContacts() {
        return this.contacts.size();
    }

    public void printContacts() {
        System.out.println("--------Contact Book---------");
        System.out.println();
        if (this.hasContacts()) {
            for (int i = 0; i < this.numberOfContacts(); i++) {
                this.contacts.get(i).printLine(i + 1);
            }
        } else {
            System.out.println("You have no contacts");
            System.out.println();
            System.out.println("------------------------");
        }
    }
}
