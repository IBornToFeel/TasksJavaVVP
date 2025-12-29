import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] solution(int[] arr) {
        int[] result = new int[2];
        int maxCount = 0;
        int minCount = 0;

        if (arr.length == 0) {
            return result;
        }
        if (arr.length == 1) {
            maxCount = 1;
            minCount = 1;
        } else {
            if (arr[0] > arr[1]) {
                maxCount++;
            } else if (arr[0] < arr[1]) {
                minCount++;
            }
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                    maxCount++;
                } else if (arr[i] < arr[i-1] && arr[i] < arr[i+1]) {
                    minCount++;
                }
            }
            if (arr[arr.length - 1] > arr[arr.length - 2]) {
                maxCount++;
            } else if (arr[arr.length - 1] < arr[arr.length - 2]) {
                minCount++;
            }
        }

        result[0] = maxCount;
        result[1] = minCount;
        return result;
    }
    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ведите количество элементов массива:");
        int n = scanner.nextInt();

        while (n < 0) {
            System.out.print("Ошибка. Введите снова: ");
            n = scanner.nextInt();
        }

        int[] arr = new int[n];

        if (n > 0) {
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < n; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }
        }

        return arr;
    }
    public static void printArray(int[] arr) {
        if (arr.length == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
    public static void printResult(int[] arr, int[] result) {
        System.out.print("Массив: ");
        printArray(arr);
        System.out.println("Количество локальных максимумов: " + result[0]);
        System.out.println("Количество локальных минимумов: " + result[1]);
        System.out.println("Общее количество экстремумов: " + (result[0] + result[1]));
        System.out.println();
    }

    public static void runTests() {
        System.out.println("ТЕСТЫ");
        System.out.println();

        int[] test1 = {1, 3, 2, 5, 4, 6, 1};
        int[] result1 = solution(test1);
        System.out.println("Обычный случай");
        printResult(test1, result1);

        int[] test2 = {5, 5, 5, 5, 5};
        int[] result2 = solution(test2);
        System.out.println("Все элементы одинаковые");
        printResult(test2, result2);

        int[] test3 = {1, 2, 3, 4, 5};
        int[] result3 = solution(test3);
        System.out.println("Возрастающая последовательность");
        printResult(test3, result3);

        int[] test4 = {5, 4, 3, 2, 1};
        int[] result4 = solution(test4);
        System.out.println("убывающая последовательность");
        printResult(test4, result4);

        int[] test5 = {42};
        int[] result5 = solution(test5);
        System.out.println("Один элемент");
        printResult(test5, result5);

        int[] test6 = {};
        int[] result6 = solution(test6);
        System.out.println("Пустой массив");
        printResult(test6, result6);

        int[] test7 = {1, 5, 1, 5, 1, 5, 1};
        int[] result7 = solution(test7);
        System.out.println("Чередующес элементы");
        printResult(test7, result7);

        int[] test8 = {1, 2, 2, 2, 3, 3, 4, 2, 2};
        int[] result8 = solution(test8);
        System.out.println("Массив с серией одинаковых элементов");
        printResult(test8, result8);

        int[] test9 = {-10, -5, -20, -15, -30, -25};
        int[] result9 = solution(test9);
        System.out.println("Отрицательные числа");
        printResult(test9, result9);

        int[] test10 = {0, 10, 0, 10, 0, 10, 0};
        int[] result10 = solution(test10);
        System.out.println("Чередование экстремумов");
        printResult(test10, result10);

        int[] test11 = {3, 7};
        int[] result11 = solution(test11);
        System.out.println("Два элемента");
        printResult(test11, result11);

        int[] test12 = {5, 1, 8};
        int[] result12 = solution(test12);
        System.out.println("Три элемента");
        printResult(test12, result12);

        System.out.println("ТЕСТ ВСЁ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        runTests();

        System.out.println("Хотите ввести свой массив? (да/нет): ");
        String response = scanner.next().toLowerCase();

        while (response.equals("да") || response.equals("yes") || response.equals("y")) {
            int[] userArray = inputArray();
            int[] userResult = solution(userArray);

            System.out.println("\nРезультат для вашего массива:");
            printResult(userArray, userResult);

            System.out.println("Хотите ввести еще один массив? (да/нет): ");
            response = scanner.next().toLowerCase();
        }

        System.out.println("Программа завершена.");
        scanner.close();
    }
}
