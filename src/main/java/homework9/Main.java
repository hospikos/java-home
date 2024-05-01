package homework9;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("1234567890");

        Contact contact1 = new Contact("John Doe", "123456789");
        Contact contact2 = new Contact("Jane Doe", "987654321");

        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);


        mobilePhone.printContacts();

        Contact contactToUpdate = new Contact("John Doe", "111111111");
        mobilePhone.updateContact(contact1, contactToUpdate);


        mobilePhone.printContacts();

        Contact contactToRemove = new Contact("Jane Doe", "987654321");
        mobilePhone.updateContact(contact2, contactToRemove);

        mobilePhone.printContacts();

        Contact foundContact = mobilePhone.queryContact("John Doe");
        if (foundContact != null) {
            System.out.println("Found contact: " + foundContact.getName() + " -> " + foundContact.getPhoneNumber());
        } else {
            System.out.println("Contact not found.");
        }
    }
}

