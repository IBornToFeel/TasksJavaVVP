

import java.util.Locale;
import java.util.Scanner;
import java.io.PrintStream;

public class Main{
    final static PrintStream out = System.out;

    public static class Task6Result {
        public double sum_n, sum_e, sum_e10;
        public int n, e, e10;
        public double f;
    }

    private static double getCurr(double a, double x, int i) {
        return a * (2 * i - 3) / (2.0 * i) * (-x);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        out.print("Введите x (-1 < x < 1): ");
        double x = scanner.nextDouble();
        out.print("Введите n (целое число): ");
        int n = scanner.nextInt();
        out.print("Введите e: ");
        double e = scanner.nextDouble();

        Task6Result r = task6(x, n, e);

        out.printf("Сумма %d слагаемых: %.12f%n", r.n, r.sum_n);
        out.printf("Сумма слагаемых > e: %.12f, количество слагаемых в сумме: %d%n", r.sum_e, r.e);
        out.printf("Сумма слагаемых > e/10: %.12f, количество слагаемых в сумме: %d%n", r.sum_e10, r.e10);
        out.printf("Значение функции: %.12f%n", r.f);
    }

    public static Task6Result task6(double x, int n, double e) {
        Task6Result r = new Task6Result();
        r.f = Math.sqrt(1 + x);
        double a = 1.0;

        for (int i = 0; i < n || Math.abs(a) > e / 10; i++) {
            if (i < n) {
                r.sum_n += a;
                r.n++;
            }
            if (Math.abs(a) > e) {
                r.sum_e += a;
                r.e++;
            }
            if (Math.abs(a) > e / 10) {
                r.sum_e10 += a;
                r.e10++;
            }
            a = getCurr(a, x, i + 1);
        }
        return r;
    }
}
