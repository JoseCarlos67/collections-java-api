package set.sortment;

import java.util.Objects;

public class Product implements Comparable<Product>{
  private long code;
  private String name;
  private double value;
  private int quatity;

  public Product(long code, String name, double value, int quatity) {
    this.code = code;
    this.name = name;
    this.value = value;
    this.quatity = quatity;
  }

  @Override
  public String toString() {
    return "Product{" +
            "code=" + code +
            ", name='" + name + '\'' +
            ", value=" + value +
            ", quatity=" + quatity +
            "}\n";
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Product product = (Product) o;
    return getCode() == product.getCode();
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(getCode());
  }

  @Override
  public int compareTo(Product o) {
    return name.compareToIgnoreCase(o.getName());
  }

  public long getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  public double getValue() {
    return value;
  }

  public int getQuatity() {
    return quatity;
  }
}
