// Jonathan Wolanyk
// Software Test automation & QA
// 7/15/2022

package module_3_QAclass_Wolanyk;

import java.util.ArrayList;

public class ContactService {
	
	// Singleton pattern - grab reference to only instance of ContactService
	// Necessary to maintain consistent ArrayList
	private static ContactService instance = new ContactService();
	private ContactService(){}
	public static ContactService getInstance(){
		return instance;
	}
	
	
	// ArrayList to store contacts
	ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	// Adds contacts to ArrayList
	void addContact(String contactID, String contactFirstName, String  contactLastName, String  contactNumber, String  contactAddress) {
		Contact contact = new Contact();
		
		// Sets the contact object's values by calling methods from Contact class, which verifies the values
		contact.setContactID(contactID);
		contact.setFirstName(contactFirstName);
		contact.setLastName(contactLastName);
		contact.setNumber(contactNumber);
		contact.setAddress(contactAddress);
		
		// Adds the contact once all values are established
		contacts.add(contact);
	}
	
	// Updates first name, with contactID and the new first name values passed in
	void UpdateFirstName(String contactID, String firstName) {
		// For loop to find contact in ArrayList based on contact ID
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).contactID.equals(contactID)) {
				contacts.get(i).setFirstName(firstName);;
			}
		}
	}
	
	// Updates last name, with contactID and the new last  name values passed in
	void UpdateLastName(String contactID, String lastName) {
		// For loop to find contact in ArrayList based on contact ID
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).contactID.equals(contactID)) {
				contacts.get(i).setLastName(lastName);;
			}
		}
	}
	
	// Updates first name, with contactID and the new first name values passed in
	void UpdateNumber(String contactID, String number) {
		// For loop to find contact in ArrayList based on contact ID
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).contactID.equals(contactID)) {
				contacts.get(i).setNumber(number);;
			}
		}
	}
	
	// Updates address, with contactID and the new address values passed in
	void UpdateAddress(String contactID, String address) {
		// For loop to find contact in ArrayList based on contact ID
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).contactID.equals(contactID)) {
				contacts.get(i).setAddress(address);;
			}
		}
	}
	
	// Deletes a contact, with contactID being passed in
	void DeleteID(String contactID) {
		// For loop to find contact in ArrayList based on contact ID
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).contactID.equals(contactID)) {
				contacts.remove(i);
			}
		}
	}
}