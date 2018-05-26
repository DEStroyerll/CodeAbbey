package Codeabbey;

import java.util.Scanner;

/**
 * Количество гласных букв
 */
public class Vowels {
    public static void main(String[] args) {

        String str = " ";
        int glas = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                case 'o':
                case 'y':
                case 'i':
                case 'e':
                case 'u':
                    glas++;
            }
        }
        System.out.println(glas);

    }

    public void method() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Количество строк: ");
        int linesCount = scan.nextInt();
        //народная мудрость
        scan.nextLine();

        for (int i = 0; i < linesCount; i++) {
            String line = scan.nextLine();

            int count = 0;
            for (int j = 0; j < line.length(); j++) {
                switch (line.charAt(j)) {
                    case 'a':
                    case 'o':
                    case 'y':
                    case 'i':
                    case 'e':
                    case 'u':
                        count++;
                }
            }
            System.out.printf("В строке '%s' %d гласных\n", line, count);
        }
    }
}

