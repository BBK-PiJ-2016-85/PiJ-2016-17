public class Comparator {

  public int getMax(int n, int m) {
    double d1 = (double) n;
    double d2 = (double) m;
    return (int) getMax(d1, d2);
  }

  public double getMax(double d1, double d2) {
    if (d1 > d2) {
      return d1;
    } else {
      return d2;
    }
  }

  public String getMax(String number1, String number2) {
    int n1 = Integer.parseInt(number1);
    int n2 = Integer.parseInt(number2);
    return ("" + getMax(n1, n2));
  }

  public static void main(String[] args) {
      Comparator c = new Comparator();
      System.out.println(c.getMax(10,5));
      System.out.println(c.getMax(10.5,5.5));
      System.out.println(c.getMax(10.5,10.55));
      System.out.println(c.getMax("5","10"));
  }
}