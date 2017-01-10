package examples;

public class AppleColourPredicate implements ApplePredicate {
  public boolean test(Apple apple) {
    return "green".equals(apple.getColour());
  }
}
