public class ManageContact {
    Contacts contacts = new Contacts();

    public void initialize() {
        contacts.printContacts();
        ManageOptions.printOptions(contacts.hasContacts());
        int option = ManageOptions.gatherOption(contacts.hasContacts());
        this.executeOption(option);
    }

    private void executeOption(int option) {
        if (ManageOptions.ADD.equals(option)) {
            contacts.gatherContact();
        } else if (ManageOptions.EDIT.equals(option)) {
            contacts.printContacts();
            int contactNumber = GatherInput.gatherIntInput("Which contact would you like to edit?: ", contacts.numberOfContacts(), 1);
            Contact contact = this.contacts.find(contactNumber);
            contacts.gatherContact(contact);
        } else if (ManageOptions.REMOVE.equals(option)) {
            int removeContactNumber = GatherInput.gatherIntInput("Which contact would you like to remove?: ", contacts.numberOfContacts(), 1);
            contacts.remove(removeContactNumber);
        }

        if (!ManageOptions.shouldExit(option)) {
            initialize();
        }
    }
}
