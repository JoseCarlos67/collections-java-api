package set.sortment;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegistration {
  public Set<Product> productSet;

  public ProductRegistration() {
    this.productSet = new HashSet<>();
  }

  public void addProduct(long code, String name, double value, int quantity) {
    productSet.add(new Product(code, name, value, quantity));
  }

  public Set<Product> showProductsByName() {
    Set<Product> productsByName = new TreeSet<>(productSet);
    return productsByName;
  }

  public Set<Product> showProductByValue() {
    Set<Product> productsByValue = new TreeSet<>(new CompareByValue());
    productsByValue.addAll(productSet);
    return productsByValue;
  }
}
