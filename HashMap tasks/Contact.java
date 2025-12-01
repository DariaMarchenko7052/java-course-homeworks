public class Contact {
    private String phoneNumber;
    private String name;
    private String email;

    public Contact(String phoneNumber, String name, String email) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Телефон: " + phoneNumber +
                ", Ім'я: " + name +
                ", Email: " + email;
    }
}
