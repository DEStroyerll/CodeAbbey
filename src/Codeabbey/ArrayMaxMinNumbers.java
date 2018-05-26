package Codeabbey;

import java.util.Scanner;

/**
 * Программа определяющая максимальное и минимальное
 * число введенное с клавиатуры
 */
public class ArrayMaxMinNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");

        int a = scanner.nextInt();
        int[] array = new int[a];

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
    }

}
