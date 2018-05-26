package Codeabbey;

import java.util.Scanner;

/**
 * Программа конвертации градусов фаренгейта в цельсии
 */
public class ConvertingDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в градусах за Фаренгейтом: ");
        int tempFahrenheit;
        for (int i = 0; i < scanner.nextInt(); i++) {
            tempFahrenheit = scanner.nextInt();
            System.out.print(Math.round((tempFahrenheit - 32) / 1.8) + " ");
            break;
        }
    }
}
