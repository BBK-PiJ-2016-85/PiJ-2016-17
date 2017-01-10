import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * You can solve this problem by composing the methods filter and limit together
 * and using collect(toList()) to convert the stream into a list as follows:
 */
public class Ex01 {
  public static void main(String[] args) {
    final List<Dish> menu =
      Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
        new Dish("beef", false, 700, Dish.Type.MEAT),
        new Dish("chicken", false, 400, Dish.Type.MEAT),
        new Dish("french fries", true, 530, Dish.Type.OTHER),
        new Dish("rice", true, 350, Dish.Type.OTHER),
        new Dish("season fruit", true, 120, Dish.Type.OTHER),
        new Dish("pizza", true, 550, Dish.Type.OTHER),
        new Dish("prawns", false, 400, Dish.Type.FISH),
        new Dish("salmon", false, 450, Dish.Type.FISH));

    //menu.stream().parallel().forEach(System.out::println);
    //menu.stream().forEach(x -> System.out.println(x));

//    for (Dish d : menu){
//      System.out.println(d);
//    }

//    Iterator<Dish> it = menu.iterator();
//    while (it.hasNext()){
//      System.out.println(it.next());
//    }

    List<Dish> dishes =
        menu.stream()
        .filter((Dish d) -> d.getType() == Dish.Type.MEAT)
        .limit(2)
        .collect(toList());
    System.out.println(dishes);
  }
}
