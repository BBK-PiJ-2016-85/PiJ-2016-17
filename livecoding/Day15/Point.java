public class Point {

   private int myPosition;

   public Point(int originalPosition) {
      if (originalPosition < 0) {
         throw new NegativePointException("Cannot accept negative position: " + originalPosition);
      }
      myPosition = originalPosition;
   }

   public int getPosition() {
      return myPosition;
   }

}
