package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringApples {

  public static void main(String[] args) {
    FilteringApples fa = new FilteringApples();
    fa.launch();
  }

  public List<Apple> filterGreenApples(List<Apple> inventory) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
      if ("green".equals(apple.getColour())) {
        result.add(apple);
      }
    }
    return result;
  }

  public List<Apple> filterApplesByColour(List<Apple> inventory, String colour) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
      if (colour.equals(apple.getColour())) {
        result.add(apple);
      }
    }
    return result;
  }

  public List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
      if (apple.getWeight() > weight) {
        result.add(apple);
      }
    }
    return result;
  }

  public List<Apple> filter(List<Apple> inventory, ApplePredicate p) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
      if (p.test(apple)) {
        result.add(apple);
      }
    }
    return result;
  }

  void launch() {

    List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));

    // [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
    List<Apple> greenApples = filterGreenApples(inventory);
    System.out.println(greenApples);

    // [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
    greenApples = filterApplesByColour(inventory, "green");
    System.out.println(greenApples);

    // [Apple{color='red', weight=120}]
    List<Apple> redApples = filterApplesByColour(inventory, "red");
    System.out.println(redApples);

    // [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
    List<Apple> greenApples2 = filter(inventory, new AppleColourPredicate());
    System.out.println(greenApples2);

    // [Apple{color='green', weight=155}]
    List<Apple> heavyApples = filterApplesByWeight(inventory, 150);
    System.out.println(heavyApples);

    // [Apple{color='green', weight=155}]
    heavyApples = filter(inventory, new AppleWeightPredicate());
    System.out.println(heavyApples);

    // []
    List<Apple> redAndHeavyApples = filter(inventory, new AppleRedAndHeavyPredicate());
    System.out.println(redAndHeavyApples);

    // [Apple{color='red', weight=120}]
    List<Apple> redApples2 = filter(inventory, new ApplePredicate() {
      public boolean test(Apple a) {
        return a.getColour().equals("red");
      }
    });
    System.out.println(redApples2);

    // [Apple{color='red', weight=120}]
    List<Apple> redApples3 = filter(inventory, a -> a.getColour().equals("red"));
    System.out.println(redApples3);

  }
}
