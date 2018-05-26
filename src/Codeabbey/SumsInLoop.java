package Codeabbey;

import java.util.Scanner;

/**
 * Метод который считывает два чиисла с клавиатуры
 * и сумирует их между собой
 */
public class SumsInLoop {
    public static void main(String[] args) {
    }

    public void method() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два любых числа: ");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print(scanner.nextInt() + scanner.nextInt() + " ");
            break;
        }
    }

}
