package Exercicios1000a1010;

import java.util.Scanner;

public class Exercicio1007 {

    public static void main(String[] args) {
        int A, B, C, D, DIFERENCA;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor");
        A = Integer.parseInt(sc.nextLine());

        System.out.println("Digite um valor");
        B = Integer.parseInt(sc.nextLine());

        System.out.println("Digite um valor");
        C = Integer.parseInt(sc.nextLine());

        System.out.println("Digite um valor");
        D = Integer.parseInt(sc.nextLine());

        DIFERENCA = (A * B) - (C * D);

        System.out.println("DIFERENCA = " + DIFERENCA);

    }
}
