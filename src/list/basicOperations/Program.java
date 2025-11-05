package list.basicOperations;

public class Program {
  public static void main(String[] args) {
    Cart cart = new Cart();

    cart.addItem("Mouse", 3, 40.00);
    cart.addItem("Teclado", 5, 20.00);
    cart.addItem("Monitor", 2, 200.00);

    cart.showItems();

    System.out.println("Valor total do carrinho: R$ " + cart.getTotalValue() + "\n");

    cart.remoItem("teclado");

    cart.showItems();

    System.out.println("Valor total do carrinho: R$ " + cart.getTotalValue());

  }
}
