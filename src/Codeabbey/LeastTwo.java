package Codeabbey;

import java.util.Scanner;

/**
 * Методы, которые определяют миниальное значение
 * между двумя заданными числами
 * введенные с клавиатуры или заданные в массив
 */
public class LeastTwo {
    public static void main(String[] args) {
        }


    public void method1() {
        Scanner inputdata = new Scanner(System.in);
        System.out.println("\'Ctr + D\' - exit!");

        int res = inputdata.nextInt();

        for (int i = 0; i < res; i++) {
            System.out.println(Math.min(inputdata.nextInt(), inputdata.nextInt()));

        }

    }


    public void method2() {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int a, b;
        for (int i = 0; i < number; i++) {
            a = input.nextInt();
            b = input.nextInt();
            if (a < b) {
                System.out.println(a + " ");
            } else {
                System.out.println(b + " ");
            }
        break;
        }
    }

    public void method3() {
        int[][] array = {{-6854157, 1995360}, {3300878, -7736311},
                {-5667979, 2445432}, {8833171, 1490480}, {354221, -9633191},
                {1348178, -8826199}, {2640509, -4618011}, {6356222, 9235617},
                {5909194, 7246544}, {-5535708, 8714041}, {9772395, -9818186},
                {-5352570, -3811040}, {3796968, -6668147}, {-5822135, -6550271}};
        int a;
        int b;

        for (int x = 0; x < array.length; x++) {
            a = array[x][0];
            b = array[x][1];
            if (a < b)
                System.out.print(a + " ");
            else
                System.out.print(b + " ");
        break;
        }
    }
}

