package Exercicios1000a1010;

import java.util.Scanner;

public class Exercicio1006 {

    public static void main(String[] args) {
        double A, B, C, MEDIA;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota 1");
        A = Double.parseDouble(sc.nextLine());

        System.out.println("Digite a nota 2");
        B = Double.parseDouble(sc.nextLine());

        System.out.println("Digite a nota 3");
        C = Double.parseDouble(sc.nextLine());

        MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10;

        System.out.printf("MEDIA = %.1f\n", MEDIA);

    }
}
