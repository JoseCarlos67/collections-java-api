import list.basicOperations.Cart;
import list.search.list.search.BookCatalog;

public class Program {
  public static void main(String[] args) {
    BookCatalog bookCatalog = new BookCatalog();

    bookCatalog.addBook("Livro 1", "Autor 1", 2000);
    bookCatalog.addBook("Livro 1", "Autor 4", 2000);
    bookCatalog.addBook("Livro 2", "Autor 1", 2001);
    bookCatalog.addBook("Livro 3", "Autor 2", 2005);
    bookCatalog.addBook("Livro 4", "Autor 3", 2015);

    System.out.printf(bookCatalog.searchByAuthor("autor 1").toString());

    System.out.println("\nPesquisa por ano:");
    System.out.printf(bookCatalog.searchByYearRange(2000, 2005).toString());

    System.out.println("\nPesquisa por título:");
    System.out.printf(bookCatalog.searchByTitle("livro 1").toString());

  }
}
