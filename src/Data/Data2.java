package Data;

import java.awt.*;
import java.awt.geom.Point2D;


public class Data2 {
    public static class Rectangle
    {
        public double x1;
        public double y1;
        public double x2;
        public double y2;

        public Rectangle(double x1, double y1, double x2, double y2)
        {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }
    }
    public static Rectangle rect1 = new Rectangle(-4, 5, 4,0);
    public static Rectangle rect2 = new Rectangle(-6, 0, 6,-3);
}
