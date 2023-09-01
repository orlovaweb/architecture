package ModelElements;

import java.awt.*;

public class Camera {
    Point3D location;
    Angle3D angle;


    public void rotate(Angle3D angle){
        this.angle=angle;
    }
    public void move(Point3D point){
        this.location=point;
    }
}
