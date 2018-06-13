package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("Piter");
        hello("Diana");
        hello("Ilia");

        double len = 7;
        System.out.println("Площадь квадрата со стороной " + len + " = " + aria(len));

        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + aria(a, b));
    }

    public static void hello(String somebody) {
        System.out.println("Hello," + somebody + "!");
    }

    public static double aria(double b) {
        return b * b;
    }

    public static double aria(double a, double b) {
        return a * b;
    }

}
