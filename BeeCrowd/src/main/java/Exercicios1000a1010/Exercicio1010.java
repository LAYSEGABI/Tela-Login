package Exercicios1000a1010;

import java.util.Scanner;

public class Exercicio1010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoPeca1, codigoPeca2, quantidadePeca1,
                quantidadePeca2;

        double valorPeca1, valorPeca2, totalPecas1,
                totalPecas2, totalCompra;

        System.out.printf("Informe o codigo da peca 1 \n");
        codigoPeca1 = Integer.parseInt(sc.nextLine());

        System.out.printf("Informe a quantidade da peca 1 \n");
        quantidadePeca1 = Integer.parseInt(sc.nextLine());

        System.out.printf("Informe o valor da peca 1 \n");
        valorPeca1 = Double.parseDouble(sc.nextLine());

        System.out.printf("Informe o código da peca 2 \n");
        codigoPeca2 = Integer.parseInt(sc.nextLine());

        System.out.printf("Informe a quantidade da peca 2 \n");
        quantidadePeca2 = Integer.parseInt(sc.nextLine());

        System.out.printf("Informe o valor da peça 2");
        valorPeca2 = Double.parseDouble(sc.nextLine());

        
        totalPecas1 = quantidadePeca1 * valorPeca1;
        totalPecas2 = quantidadePeca2 * valorPeca2;

        totalCompra = totalPecas1 + totalPecas2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalCompra);
    }
}
