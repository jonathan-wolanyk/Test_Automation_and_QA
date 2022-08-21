package module_3_QAclass_Wolanyk;

public class Contact {

	  	//The contact object shall have a required unique contact ID string that cannot be longer than 10 characters. The contact ID shall not be null and shall not be updatable.
		//The contact object shall have a required firstName String field that cannot be longer than 10 characters. The firstName field shall not be null.
		//The contact object shall have a required lastName String field that cannot be longer than 10 characters. The lastName field shall not be null.
		//The contact object shall have a required phone String field that must be exactly 10 digits. The phone field shall not be null.
		//The contact object shall have a required address field that must be no longer than 30 characters. The address field shall not be null.
	
	// Singleton pattern - grab reference to only instance of ContactService
	// Necessary to maintain consistent ArrayList
	ContactService contactService = ContactService.getInstance();
	
	// Initiate variables
	String contactID = "-1";
	String firstName = "-1";
	String lastName = "-1";
	String number = "-1";
	String address = "-1";
	
	// Set contact ID
	public void setContactID(String contactID) {
		// For loop to check for duplicates
		for (int i = 0; i < contactService.contacts.size(); i++) {
			// Throw exception if ID already exists
			if (contactService.contacts.get(i).contactID.equals(contactID)) {
				throw new IllegalArgumentException("Contact ID already exists");
			}
		}
		
		// Ensure ID will be within 1 to 10 character range
		if ((contactID.length() > 10) || (contactID.length() < 1)) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
		
		// Set ID if it makes it through checks
		this.contactID = contactID;
	}
	
	// Set First Name
	public void setFirstName(String firstName) {
		// Ensure name length falls within 1-10 range
		if ((firstName.length() > 10) || (firstName.length() < 1)) {
			throw new IllegalArgumentException("Invalid first name");
		}
		
		// Set first name if it makes it through checks
		this.firstName = firstName;
	}
	
	// Set last name
	public void setLastName(String lastName) {
		// Ensure name length falls within 1-10 range
		if ((lastName.length() > 10) || (lastName.length() < 1)) {
			throw new IllegalArgumentException("Invalid last name");
		}
		
		// Set last name if it makes it through checks
		this.lastName = lastName;
	}
	
	// Set number
	public void setNumber(String number) {
		// Ensure number is 10 digits
		if (number.length() != 10) {
			throw new IllegalArgumentException("Invalid number");
		}
		
		// Set number if it makes it through checks
		this.number = number;
	}
	
	// Set Address
	public void setAddress(String address) {
		// Ensure address is between 1-30 characters
		if ((address.length() > 30) || (address.length() < 1)) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		// Set address if it makes it through checks
		this.address = address;
	}
	
	// Return first name
	public String getFirstName(String contactID) {
		// For loop to find the contact by ID
		for (int i = 0; i < contactService.contacts.size(); i++) {
			if (contactService.contacts.get(i).contactID.equals(contactID)) {
				return contactService.contacts.get(i).firstName;
			}
		}
		return("This contact does not exist");
	}
	
	// Return first name
	public String getLastName(String contactID) {
		// For loop to find the contact by ID
		for (int i = 0; i < contactService.contacts.size(); i++) {
			if (contactService.contacts.get(i).contactID.equals(contactID)) {
				return contactService.contacts.get(i).lastName;
			}
		}
		return("This contact does not exist");
	}
	
	// Return number
	public String getNumber(String contactID) {
		// For loop to find the contact by ID
		for (int i = 0; i < contactService.contacts.size(); i++) {
			if (contactService.contacts.get(i).contactID.equals(contactID)) {
				return contactService.contacts.get(i).number;
			}
		}
		return("This contact does not exist");
	}
	
	// Return address
	public String getAddress(String contactID) {
		// For loop to find the contact by ID
		for (int i = 0; i < contactService.contacts.size(); i++) {
			if (contactService.contacts.get(i).contactID.equals(contactID)) {
				return contactService.contacts.get(i).address;
			}
		}
		return("This contact does not exist");
	}
}
