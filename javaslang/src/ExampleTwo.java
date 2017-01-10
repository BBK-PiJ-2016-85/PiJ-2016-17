import javaslang.Tuple2;
import javaslang.collection.List;
import javaslang.collection.Queue;
import javaslang.collection.SortedSet;
import javaslang.collection.TreeSet;
import javaslang.control.Option;
import javaslang.control.Try;

import java.util.Comparator;

public class ExampleTwo {
  public static void main(String[] args) {
    List<Integer> list1 = List.of(1, 2, 3);
    List<Integer> list2 = list1.tail().prepend(0);

    Queue<Integer> queue = Queue.of(1, 2, 3)
                             .enqueue(4)
                             .enqueue(5);

    queue = Queue.of(1, 2, 3);

    // = (1, Queue(2, 3))
    Tuple2<Integer, Queue<Integer>> dequeued = queue.dequeue();

    // = Some((1, Queue()))
    Queue.of(1).dequeueOption();

    // = None
    Queue.empty().dequeueOption();

    // = Queue(1)
    queue = Queue.of(1);

    // = Some((1, Queue()))
    Option<Tuple2<Integer, Queue<Integer>>> dequeuedAgain = queue.dequeueOption();

    // = Some(1)
    Option<Integer> element = dequeuedAgain.map(Tuple2::_1);

    // = Some(Queue())
    Option<Queue<Integer>> remaining =
      dequeuedAgain.map(Tuple2::_2);

    // = TreeSet(1, 2, 3, 4, 6, 7, 8)
    SortedSet<Integer> xs = TreeSet.of(6, 1, 3, 2, 4, 7, 8);

    // = TreeSet(1, 2, 3);
    SortedSet<Integer> set = TreeSet.of(2, 3, 1, 2);

    // = TreeSet(3, 2, 1);
    Comparator<Integer> c = (a, b) -> b - a;
    SortedSet<Integer> reversed = TreeSet.of(c, 2, 3, 1, 2);

    // = TreeSet(1, 2, 3, 4, 5, 6, 7, 8)
    SortedSet<Integer> ys = xs.add(5);
  }

  // = Success(result) or Failure(exception)
  Try<Integer> divide(Integer dividend, Integer divisor) {
    return Try.of(() -> dividend / divisor);
  }
}
