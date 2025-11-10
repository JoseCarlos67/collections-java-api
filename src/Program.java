import list.assortment.PersonOrdination;
import list.basicOperations.Cart;
import list.search.list.search.BookCatalog;
import set.basicOperations.GuestSet;
import set.search.ContactList;

public class Program {
  public static void main(String[] args) {
    ContactList contactList = new ContactList();

    contactList.showContacts();

    contactList.addContact("Camila", 123456);
    contactList.addContact("Camila", 0);
    contactList.addContact("Camila Cavalcante", 11111111);
    contactList.addContact("Camila DIO", 7543554);
    contactList.addContact("Maria Silva", 11111111);

    contactList.showContacts();

    System.out.println();
    System.out.println(contactList.searchByName("Camila"));

    System.out.println("Contato atualizado: " + contactList.updateNumberContact("Maria Silva", 454545));

    System.out.println(contactList.searchByName("Maria"));

  }
}
