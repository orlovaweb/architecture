package ModelElements;

import java.awt.*;

public class Flash {
    Point3D location;
    Angle3D angle;
    Color color;
    Float power;

   public void rotate(Angle3D angle){
       this.angle=angle;
   }
    public void move(Point3D point){
        this.location=point;
    }
}
