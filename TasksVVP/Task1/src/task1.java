import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double v1, v2, a1, a2, s, t;

        System.out.println("введите значения a1 и a2");
        a1 = scanner.nextDouble();
        a2 = scanner.nextDouble();

        System.out.println("введите значения v1 и v2");
        v1 = scanner.nextDouble();
        v2 = scanner.nextDouble();

        System.out.println("введите значение s");
        s = scanner.nextDouble();

        t = (-(v1 + v2) + Math.sqrt(Math.pow(v1 + v2, 2) + (a1 + a2) * 2 * s)) / (a1 + a2);

        System.out.printf("время t= %.3f%n", t);
        scanner.close();
    }
}