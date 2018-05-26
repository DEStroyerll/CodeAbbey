package Codeabbey;

/**
 * Программа которая определяет
 * можно ли построить треугольник
 * с заданными сторонами.
 */
public class Triangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.triangle(3, 4, 5));
    }

    public boolean triangle(double a, double b, double c) {
        boolean flag = false;
        if (a < b + c && b < a + c && c < a + b) {
            flag = true;
        }
        return flag;
    }
}
