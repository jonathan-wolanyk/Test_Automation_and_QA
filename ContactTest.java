// Jonathan Wolanyk
// Software Test automation & QA
// 7/15/2022

package module_3_QAclass_Wolanyk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	// Test to ensure names outside of acceptable bounds are rejected
	@Test
	void testFirstNameLength() {
		// Reference contactService object, clear arrayList for test
		ContactService contactService = ContactService.getInstance();
		contactService.contacts.clear();
		
		// Too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.addContact("testID", "012345678910", "Wolanyk", "0123456789", "253 Albany Street");
		});
		
		// Null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.addContact("testID", "", "012345678910", "0123456789", "253 Albany Street");
		});
	}
	
	// Test to ensure names outside of acceptable bounds are rejected
	@Test
	void testLastNameLength() {
		// Reference contactService object, clear arrayList for test
		ContactService contactService = ContactService.getInstance();
		contactService.contacts.clear();
		
		// Too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.addContact("testID", "Jonathan", "012345678910", "0123456789", "253 Albany Street");
		});
		
		// Null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.addContact("testID", "Jonathan", "", "0123456789", "253 Albany Street");
		});
	}
	
	// Test to ensure numbers outside of acceptable bounds are rejected
	@Test
	void testNumberLength() {
		// Reference contactService object, clear arrayList for test
		ContactService contactService = ContactService.getInstance();
		contactService.contacts.clear();
		
		// Too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.addContact("testID", "Jonathan", "Wolanyk", "012345678910", "253 Albany Street");
		});
		
		// Null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.addContact("testID", "Jonathan", "012345678910", "", "253 Albany Street");
		});
	}
	
	// Test to ensure addresses outside of acceptable bounds are rejected
	@Test
	void testAddressLength() {
		// Reference contactService object, clear arrayList for test
		ContactService contactService = ContactService.getInstance();
		contactService.contacts.clear();
		
		// Too long
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.addContact("testID", "Jonathan", "Wolanyk", "0123456789", "This sequence of characters is 49 characters long");
		});
		
		// Null
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.addContact("testID", "Jonathan", "012345678910", "0123456789", "");
		});
	}

}
