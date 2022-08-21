// Jonathan Wolanyk
// Software Test automation & QA
// 7/15/2022

package module_3_QAclass_Wolanyk;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	// Test to add valid contact
	@Test
	void testAddContact() {
		// Grab reference to contactService, clear ArrayList for test
		ContactService contactService = ContactService.getInstance();
		contactService.contacts.clear();
		
		// Create contact
		contactService.addContact("testID", "Jonathan", "Wolanyk", "0123456789", "253 Albany Street");
		
		assertTrue(contactService.contacts.get(0).getFirstName("testID").equals("Jonathan"));
		assertTrue(contactService.contacts.get(0).getLastName("testID").equals("Wolanyk"));
		assertTrue(contactService.contacts.get(0).getNumber("testID").equals("0123456789"));
		assertTrue(contactService.contacts.get(0).getAddress("testID").equals("253 Albany Street"));
	}
	
	
	// Test to update contact information (all but contact ID)
	@Test
	void testUpdateContact() {
		// Grab reference to contactService, clear ArrayList for test
		ContactService contactService = ContactService.getInstance();
		contactService.contacts.clear();
		// Create contact
		contactService.addContact("testID", "Jonathan", "Wolanyk", "0123456789", "253 Albany Street");
		
		// Ensure contact is established
		assertTrue(contactService.contacts.get(0).getFirstName("testID").equals("Jonathan"));
		assertTrue(contactService.contacts.get(0).getLastName("testID").equals("Wolanyk"));
		assertTrue(contactService.contacts.get(0).getNumber("testID").equals("0123456789"));
		assertTrue(contactService.contacts.get(0).getAddress("testID").equals("253 Albany Street"));
		
		// Update all values
		contactService.UpdateFirstName("testID", "testName");
		contactService.UpdateLastName("testID", "testName");
		contactService.UpdateNumber("testID", "testNumber");
		contactService.UpdateAddress("testID", "testAddress");
		
		// Verify all values have been updated
		assertTrue(contactService.contacts.get(0).getFirstName("testID").equals("testName"));
		assertTrue(contactService.contacts.get(0).getLastName("testID").equals("testName"));
		assertTrue(contactService.contacts.get(0).getNumber("testID").equals("testNumber"));
		assertTrue(contactService.contacts.get(0).getAddress("testID").equals("testAddress"));
	}
	
	// Test to delete a contact from the ArrayList
	@Test
	void testDeleteContact() {
		// Grab reference to contactService, clear ArrayList for test
		ContactService contactService = ContactService.getInstance();
		contactService.contacts.clear();
		// Create contact
		contactService.addContact("testID", "Jonathan", "Wolanyk", "0123456789", "253 Albany Street");
		
		// Remove contact from ArrayList
		contactService.DeleteID("testID");
		
		// Check for empty list
		assertTrue(contactService.contacts.isEmpty());
	}

}
