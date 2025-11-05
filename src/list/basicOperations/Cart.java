package list.basicOperations;

import java.util.ArrayList;
import java.util.List;

public class Cart {
  private List<Item> itemList;

  public Cart() {
    this.itemList = new ArrayList<>();
  }

  public void addItem(String name, int quantity, double price) {
    itemList.add(new Item(name, price, quantity));
  }

  public void remoItem(String name) {
    List<Item> itemsToRemove = new ArrayList<>();

    for (Item item : itemList) {
      if (item.getName().equalsIgnoreCase(name))
        itemsToRemove.add(item);
    }

    itemList.removeAll(itemsToRemove);
  }

  public double getTotalValue() {
    double totalValau = 0;

    for (Item item : itemList)
      totalValau += item.totalValue();

    return totalValau;
  }

  public void showItems() {
    System.out.println(itemList);
  }
}
