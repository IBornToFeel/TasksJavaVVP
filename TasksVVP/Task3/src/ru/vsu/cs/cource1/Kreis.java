package ru.vsu.cs.cource1;

public class Kreis {
    public double x0;
    public double y0;
    public double R;

    public Kreis(double x0, double y0, double R) {
        this.x0 = x0;
        this.y0 = y0;
        this.R = R;
    }
    public boolean isPointTopOfKreis(double x, double y) {
        return (x-x0)*(x-x0)+(y-y0)*(y-y0)<=R*R;
    }
}
