package Exercicios1000a1010;

import java.util.Scanner;

public class Exercicio1008 {

    public static void main(String[] args) {
        
        int NumeroFuncionario, HorasTrabalhadas;
        double ValorHora, SALARIO;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Qual Número do funcionario?");
        NumeroFuncionario = Integer.parseInt(sc.nextLine());

        System.out.printf("Qual números de horas trabalhadas?");
        HorasTrabalhadas = Integer.parseInt(sc.nextLine());

        System.out.printf("Qual valor recebido por hora?");
        ValorHora = Double.parseDouble(sc.nextLine());

        SALARIO = HorasTrabalhadas * ValorHora;

        System.out.printf("NUMBER = %d\n", NumeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", SALARIO);
    }
}
