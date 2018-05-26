package Codeabbey;

import java.util.Scanner;

/**
 * Программа вычисляющая среднее значение массива
 */
public class AverageValueOfTheArray {
    public static void main(String[] args) {

    }

    public void method1() {
        int[] numbers = {1613, 1203, 1521, 1234, 424, 1135, 1899, 910};

        double average = 0;
        if (numbers.length > 0) {
            double sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum += numbers[j];
            }
            average = sum / numbers.length;
        }
        System.out.println(Math.round(average));
    }


    public void method2() {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for (int i = 0; i < cases; i++) {
            int n = scanner.nextInt();
            double sum = 0;
            int count = 0;

            while (n != 0) {
                sum += n;
                count++;
                n = scanner.nextInt();
            }

            System.out.print((int) (sum / count + 0.5) + " ");
        }
    }
}
