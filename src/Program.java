import set.sortment.ProductRegistration;

public class Program {
  public static void main(String[] args) {
    ProductRegistration productRegistration = new ProductRegistration();

    productRegistration.addProduct(1L, "Produto 5", 15d, 5);
    productRegistration.addProduct(2L, "Produto 0", 20d, 10);
    productRegistration.addProduct(1L, "Produto 3", 10d, 2);
    productRegistration.addProduct(9L, "Produto 9", 2d, 2);

    System.out.println(productRegistration.showProductByValue());

  }
}
