
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        scanner.close();
        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        Point p3 = new Point(x3,y3);
        Point p4 = null;
        p4=versh(p1,p2,p3);
        System.out.print(p4.x+" "+p4.y);
    }


    public static Point versh(Point p1, Point p2, Point p3) {
        double a = p1.dlina(p2);
        double b = p2.dlina(p3);
        double c = p3.dlina(p1);
        if (a + b == c) {
            return Point.sdvig(p2,p1,p3);
        }
        if (a + c == b) {
            return Point.sdvig(p1,p2,p3);
        }
        if (b+c == a) {
            return Point.sdvig(p3,p2,p1);
        }
        return new Point(0,0);
    }
}