package Exercicios1011a1020;

import java.util.Scanner;

public class Exercicio1013 {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        double A, B, C, triangulo, circulo,
                trapezio, quadrado, retangulo, pi;
        pi = 3.14159;

        System.out.printf("Qual valor de A?");
        A = Double.parseDouble(sc.nextLine());

        System.out.printf("Qual valor de B?");
        B = Double.parseDouble(sc.nextLine());

        System.out.printf("Qual valor de C?");
        C = Double.parseDouble(sc.nextLine());

        triangulo = (A * C) / 2;
        circulo = (C * C) * pi;
        trapezio = (A + B) * C / 2;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printtriangulo, "eh o maior");


    }
}
