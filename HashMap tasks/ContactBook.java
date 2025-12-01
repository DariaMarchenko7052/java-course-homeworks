import java.util.HashMap;

public class ContactBook {

    private HashMap<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        contacts.put(contact.getPhoneNumber(), contact);
    }

    public void removeContact(String phoneNumber) {
        contacts.remove(phoneNumber);
    }

    public Contact findContact(String phoneNumber) {
        return contacts.get(phoneNumber);
    }

    public void printAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Контактів немає.");
            return;
        }

        System.out.println("Список контактів:");
        for (Contact c : contacts.values()) {
            System.out.println(c);
        }
    }
}
