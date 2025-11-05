import list.assortment.PersonOrdination;
import list.basicOperations.Cart;
import list.search.list.search.BookCatalog;

public class Program {
  public static void main(String[] args) {
    PersonOrdination personOrdination = new PersonOrdination();

    personOrdination.addPeople("Pessoa 1", 36, 1.80);
    personOrdination.addPeople("Pessoas 2", 23, 1.40);
    personOrdination.addPeople("Pessoas 3", 19, 1.60);
    personOrdination.addPeople("Pessoas 3", 60, 1.30);

    System.out.println(personOrdination.sortByAge());

    System.out.println(personOrdination.sortByHeight());

  }
}
