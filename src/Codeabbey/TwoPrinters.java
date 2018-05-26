package Codeabbey;

import java.util.Scanner;

/**
 * Программа которая вычисляет минимальное
 * время работы между двух принтеров
 */
public class TwoPrinters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int x, y, numPages;
        for (int i = 0; i < size; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            numPages = scanner.nextInt();

            System.out.println(printTime(x, y, numPages));

        }

    }

    public static int printTime(int x, int y, int n) {
        int nx = n * y / (x + y);
        return Math.min((n - nx) * y, (nx + 1) * x);
    }
}
