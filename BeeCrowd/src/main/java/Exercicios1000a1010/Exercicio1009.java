package Exercicios1000a1010;

import java.util.Scanner;

public class Exercicio1009 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double comissao = 0.15, salarioFixo, montanteVendas, comissaoTotal, salarioTotal;
        String nomeVendedor;

        System.out.printf("Qual nome do vendedor?");
        nomeVendedor = (sc.nextLine());

        System.out.printf("Qual salario FIXO do vendedor?");
        salarioFixo = Double.parseDouble(sc.nextLine());
        
        System.out.printf("Qual o valor total das vendas efetuadas?");
        montanteVendas = Double.parseDouble(sc.nextLine());
        
        
        comissaoTotal = montanteVendas * comissao;
        salarioTotal = salarioFixo + comissaoTotal;

        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);

    }
}
