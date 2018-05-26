package Codeabbey;

import java.util.Scanner;

/**
 * Вычислить сумму первых членов
 * арифметической последовательности.
 *
 * @data:
 * 5 2 3
 * 3 0 10
 * @answer: 21 30
 */
public class SummaNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b, n, sum;
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            sum = 0;
            a = scanner.nextInt();
            b = scanner.nextInt();
            n = scanner.nextInt();

            for (int j = 0; j < n; j++) {
                sum += (a + b * j);
            }
            System.out.print(sum + " ");
//        scanner.close();
        }

    }

    //Метод сумирующий все числа в цикле
    //с заданного начала, шагом и конечным числом
    public int method(int start, int end, int step) {
        int summa = 0;
        for (int i = start; i < end; i += step) {
            summa += i;
        }
        return summa;
    }
}
