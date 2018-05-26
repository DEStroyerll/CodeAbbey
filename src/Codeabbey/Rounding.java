package Codeabbey;

import java.util.Scanner;

/**
 * Программа которая делит два числа
 * введенные с клавиатуры.
 * И результат округляет до ближайшего целого
 * при помощи класса Math метода round
 */
public class Rounding {
    public static void main(String[] args) {
        Rounding round = new Rounding();
        round.roundNumbers();

    }

    public double roundNumbers() {
        Scanner scanner = new Scanner(System.in);
        double a, b;

        System.out.println("Введите два числа: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        double result = (a / b);
        System.out.println(Math.round(result));
        return result;

    }
}
