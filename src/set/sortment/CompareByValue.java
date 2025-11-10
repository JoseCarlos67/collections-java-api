package set.sortment;

import java.util.Comparator;

public class CompareByValue implements Comparator<Product> {
  @Override
  public int compare(Product o1, Product o2) {
    return Double.compare(o1.getValue(), o2.getValue());
  }
}
