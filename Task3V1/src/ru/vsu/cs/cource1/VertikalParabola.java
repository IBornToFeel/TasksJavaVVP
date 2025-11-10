package ru.vsu.cs.cource1;
public class VertikalParabola {
    public double x0;
    public double y0;
    public double a;

    public VertikalParabola(double x0, double y0, double a) {
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
    }


    public boolean isPointTopOfParabola(double x, double y) {
        return y > a * Math.pow(x - x0, 2) + y0;
    }
}
