package list.search.list.search;

import list.search.Book;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
  private List<Book> bookList;

  public BookCatalog() {
    this.bookList = new ArrayList<>();
  }

  public void addBook(String title, String author, int yearOfPubliation) {
    bookList.add(new Book(title, author, yearOfPubliation));
  }

  public List<Book> searchByAuthor(String author) {
    List<Book> booksByAuthor = new ArrayList<>();

    if (!bookList.isEmpty()) {
      for (Book book : bookList) {
        if (book.getAuthor().equalsIgnoreCase(author)) {
          booksByAuthor.add(book);
        }
      }
    }

    return booksByAuthor;
  }

  public List<Book> searchByYearRange(int initialYear, int finalYear) {
    List<Book> booksByYearRange = new ArrayList<>();

    if (!bookList.isEmpty()) {
      for (Book book : bookList) {
        if (book.getYearOfPublication() >= initialYear && book.getYearOfPublication() <= finalYear) {
          booksByYearRange.add(book);
        }
      }
    } else
      System.out.printf("Lista vazia!");

    return booksByYearRange;
  }

  public Book searchByTitle(String title) {
    if(!bookList.isEmpty()) {
      for (Book book : bookList) {
        if (book.getTitle().equalsIgnoreCase(title))
          return book;
        else
          System.out.printf("Livro não encontrado!");
      }
    } else
      System.out.printf("Lista vazia!");

    return null;
  }
}
