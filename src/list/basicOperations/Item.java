package list.basicOperations;

public class Item {
  private String name;
  private Double price;
  private int quantity;

  public Item(String name, Double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public double totalValue() {
    return price * quantity;
  }

  public String getName() {
    return name;
  }

  public Double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  @Override
  public String toString() {
    return "Item: " + getName()
            + "\nValor unitário: R$" + String.format("%.2f", getPrice())
            + "\nQuantidade: " + getQuantity()
            + "\nValor total: R$" + String.format("%.2f", totalValue())
            + "\n\n";
  }
}
