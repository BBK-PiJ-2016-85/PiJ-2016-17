public class Ex01b {

  public static void main(String[] args) {
    Ex01b ex = new Ex01b();
    ex.buggyMethod(21);
  }

  String buggyMethod(int n) {
    if (n <= 0) {
      return "";
    }
    return "" + n + " " + buggyMethod(n - 2);
  }
}
