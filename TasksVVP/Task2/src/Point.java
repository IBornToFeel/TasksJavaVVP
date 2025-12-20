
import java.lang.Math;
public class Point {
    public double x;
    public double y;
    public Point(double x,double y) {
        this.y = y;
        this.x = x;
    }
    public double dlina(Point other) {
        return Math.pow((x-other.x),2) + Math.pow((y- other.y),2);
    }
    public static Point sdvig(Point p1,Point p2,Point p3){
        p1.x=p2.x+p3.x-p1.x;
        p1.y=p2.y+p3.y-p1.y;
        return p1;
    }
}