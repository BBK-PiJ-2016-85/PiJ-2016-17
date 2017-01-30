import java.util.ArrayList;
import java.util.List;

public class Line {

   private int start;

   private int end;

   private List<Point> extraPoints = new ArrayList<>();

   public Line(int start, int end) {
       if (end < start) {
           throw new IllegalArgumentException("End cannot be lower than start (" + end + "<" + start + ")");
       }
       this.start = start;
       this.end   = end;
   }

   public void addPoint(Point point) throws PointNotInRangeException {
       int pos = point.getPosition();
       if ((pos < start) || (pos > end)) {
           throw new PointNotInRangeException("Pointer not in range");
       }
       extraPoints.add(point);
   }

}