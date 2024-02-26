package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введи число а, b и c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b || b == c || c == a ) {
            System.out.printf("a, b и c являются сторонами равнобедренного треугольника");
        }
        else if ((a == b) && (b == c) && (c == a)) {
            System.out.printf("a, b и c являются сторонами равностороннего треугольника" );
        }
        else if ((a + b <= c)&&(b + c <= a)&&(a + c <= b)) {
            System.out.printf("a, b и c не являются сторонами треугольника");
        }

        double square = Math.pow(a, 2);
        square = Math.pow(b, 2);
        square = Math.pow(c, 2);

        if ((a + b == c) || (b + c == a) || (c + a == b)) {
            System.out.printf("a, b и c являются сторонами прямоугольного треугольника");
        }
        else {
            System.out.printf("a, b и c являются сторонами обычного треугольника");
        }

    }
}
