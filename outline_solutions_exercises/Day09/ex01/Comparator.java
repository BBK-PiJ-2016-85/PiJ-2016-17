public class Comparator {
    public static void main(String[] args){
        Comparator c = new Comparator();
        System.out.println(c.getMax(12,10));
        System.out.println(c.getMax(2.3,4.5));
        System.out.println(c.getMax("10","20"));
    }

    public int getMax(int n, int m){
        return (int) getMax((double) n, (double) m);
    }

    public String getMax(String number1, String number2){
        int n1 = Integer.parseInt(number1);
        int n2 = Integer.parseInt(number2);
        return String.valueOf(getMax(n1,n2));
    }

    public double getMax(double d1, double d2){
        return (d1 > d2 ? d1 : d2);
    }
}