
package Exercicios1000a1010;

import java.util.Scanner;

public class Exercicio1003 {
    
    public static void main(String[] args) {
 
        int A, B, SOMA;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor 1");
        A = Integer.parseInt(sc.nextLine());
        
        System.out.println("Digite um valor 2");
        B = Integer.parseInt(sc.nextLine());
        
        SOMA = A + B;
        
        System.out.println("SOMA = " + SOMA);
 
    }
}
