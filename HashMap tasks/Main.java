public class Main {
    public static void main(String[] args) {

        ContactBook book = new ContactBook();

        book.addContact(new Contact("12345", "Іван", "ivan@gmail.com"));
        book.addContact(new Contact("98765", "Марія", "maria@yahoo.com"));

        System.out.println("Пошук: " + book.findContact("12345"));

        System.out.println("\nВсі контакти:");
        book.printAllContacts();

        book.removeContact("98765");

        System.out.println("\nПісля видалення:");
        book.printAllContacts();
    }
}
