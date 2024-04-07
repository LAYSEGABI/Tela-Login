package Exercicios1000a1010;

import java.util.Scanner;

public class Exercicio1002 {

    public static void main(String[] args) {
        double Pi, Area, Raio;

        Pi = 3.14159;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio");
        Raio = Double.parseDouble(sc.nextLine());

        Area = Pi * (Raio * Raio);
        System.out.printf("A =%.4f\n ", Area);
    }
}
