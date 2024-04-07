package Exercicios1011a1020;

import java.util.Scanner;

public class Exercicio1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        
        double raio, pi, volume;
        pi = 3.14159;
        
        System.out.printf("Qual raio da esfera?");
        raio = Double.parseDouble(sc.nextLine());
        
        volume = (4.0/3) * pi *  Math.pow(raio, 3);
        
        System.out.printf("VOLUME = %.3f\n", volume);
        
    }
}
