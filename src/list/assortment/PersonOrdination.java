package list.assortment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PersonOrdination {
  private List<People> peopleList;

  public PersonOrdination() {
    peopleList = new ArrayList<>();
  }

  public void addPeople(String name, int age, double height) {
    peopleList.add(new People(name, age, height));
  }

  public List<People> sortByAge() {
    List<People> peopleByAge = new ArrayList<>(peopleList);
    Collections.sort(peopleByAge);
    return peopleByAge;
  }

  public List<People> sortByHeight() {
    List<People> peopleByHeight = new ArrayList<>(peopleList);
    Collections.sort(peopleByHeight, new ComparatorByHeight());
    return peopleByHeight;
  }
}
