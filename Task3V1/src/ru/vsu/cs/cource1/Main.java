package ru.vsu.cs.cource1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static final VertikalParabola P1 = new VertikalParabola(-3,-3,0.5);
    public static final VertikalParabola P2 = new VertikalParabola(-6,4,-0.25);
    public static final Kreis K1 = new Kreis(0, -3, 5);
    public static final Kreis K2 = new Kreis(1, -3, 3);

    public static SimpleColor getColor(double x, double y) {
        if ((K2.isPointTopOfKreis(x,y) && P2.isPointTopOfParabola(x,y) && !P1.isPointTopOfParabola(x,y)) || (K1.isPointTopOfKreis(x,y) && !K2.isPointTopOfKreis(x,y) && !P2.isPointTopOfParabola(x,y) && !P1.isPointTopOfParabola(x,y))){
            return SimpleColor.GREEN;
        }
        if (K1.isPointTopOfKreis(x,y) && !K2.isPointTopOfKreis(x,y) && !P2.isPointTopOfParabola(x,y) && P1.isPointTopOfParabola(x,y)){
            return SimpleColor.GRAY;
        }
        if ((!P2.isPointTopOfParabola(x,y) || P1.isPointTopOfParabola(x,y)) && !(!P2.isPointTopOfParabola(x,y) && P1.isPointTopOfParabola(x,y)) && !(K2.isPointTopOfKreis(x,y) && P1.isPointTopOfParabola(x,y))){
            return SimpleColor.ORANGE;
        }if ((K2.isPointTopOfKreis(x,y) && P1.isPointTopOfParabola(x,y) && !P2.isPointTopOfParabola(x,y)) || x>=-0.8139) {
            return SimpleColor.BLUE;
        }
        return SimpleColor.WHITE;
    }

    public static void printColorForPoint(double x, double y) {
        System.out.printf("(%.3f, %.3f) -> %s%n", x, y, getColor(x, y));
    }

    public static void tests() {
        printColorForPoint(3, 2);
        printColorForPoint(0, 5);
        printColorForPoint(-8, -3);
        printColorForPoint(3, -3);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        tests();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input x, y: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        printColorForPoint(x, y);
    }
}
