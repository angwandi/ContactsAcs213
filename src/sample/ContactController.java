package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import sample.datamodel.Contact;

public class ContactController {

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField phoneNumberField;

    @FXML
    private TextField notesField;

    public Contact getNewContact() {
        String firstName = firstNameField.getText().trim();
        String lastName = lastNameField.getText().trim();
        String phoneNumber = phoneNumberField.getText().trim();
        String notes = notesField.getText().trim();

        return new Contact(firstName, lastName, phoneNumber, notes);
    }

    public void editContact(Contact contact) {
        firstNameField.setText(contact.getFirstName().trim());
        lastNameField.setText(contact.getLastName().trim());
        phoneNumberField.setText(contact.getPhoneNumber().trim());
        notesField.setText(contact.getNotes().trim());
    }

    public void updateContact(Contact contact) {
        contact.setFirstName(firstNameField.getText().trim());
        contact.setLastName(lastNameField.getText().trim());
        contact.setPhoneNumber(phoneNumberField.getText().trim());
        contact.setNotes(notesField.getText().trim());
    }

}















