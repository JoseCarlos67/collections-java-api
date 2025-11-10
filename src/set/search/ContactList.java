package set.search;

import java.util.HashSet;
import java.util.Set;

public class ContactList {
  private Set<Contact> contactSet;

  public ContactList() {
    this.contactSet = new HashSet<>();
  }

  public void addContact(String name, int number) {
    contactSet.add(new Contact(name, number));
  }

  public void showContacts() {
    System.out.println(contactSet);
  }

  public Set<Contact> searchByName(String name) {
    Set<Contact> contactsByName = new HashSet<>();
    for (Contact contact : contactSet) {
      if (contact.getName().startsWith(name))
        contactsByName.add(contact);
    }
    return contactsByName;
  }

  public Contact updateNumberContact(String name, int newNumber) {
    for (Contact contact : contactSet) {
      if (contact.getName().equalsIgnoreCase(name)){
        contact.setNumber(newNumber);
        return contact;
      }
    }
    return null;
  }
}
