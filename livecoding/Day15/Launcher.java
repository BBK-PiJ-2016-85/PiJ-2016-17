public class Launcher {

  public static void main(String[] args) throws PointNotInRangeException {
     try {
       Launcher launcher = new Launcher();
       launcher.launch();
       System.out.println("End of the try");
     } catch (NullPointerException ex) {
       System.out.println("Unexpected error: 0x5hCF.");
     }
     System.out.println("End of the main");
  }

  private void launch() throws PointNotInRangeException {
      try {
         // Line wrongLine = new Line(4, 3); 
         // Point wrongPoint = new Point(-5);
         Line line = new Line(3, 7); 
         Point point = new Point(4);
         Point farPoint = new Point(400);
         line.addPoint(point);
         line.addPoint(farPoint);
      } catch (IllegalArgumentException ex) {
         System.out.println("There was an illegal argument! Build a wall!");
      } catch (NullPointerException ex) {
         ex.printStackTrace();
      }
      System.out.println("End of execution!");
  }

}