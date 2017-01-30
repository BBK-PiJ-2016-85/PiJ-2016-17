public class Utilities {

   public int add(int number1, int number2) {
       return (number1 + number2);
   }

   // returns a hash between 0 and 1000
   public int shortHash(Object object) {
       int result = object.hashCode();
       result = Math.abs(result);
       result = result % 1000;
       return result;
   }

}