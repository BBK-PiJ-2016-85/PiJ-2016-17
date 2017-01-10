public class Comparator {
    public static void main(String[] args) {
        Comparator c = new Comparator();
        System.out.println(c.getMax(3, 4));
        System.out.println(c.getMax(3.1, 4.1));
        System.out.println(c.getMax("10", "20"));
    }

    public <T extends Comparable<T>> T getMax(T n, T m) {
        return (n.compareTo(m) > 0 ? n : m);
    }
}
