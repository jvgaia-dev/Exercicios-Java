package com.jvgaia.estudos;

import java.util.Scanner;

//Faça um algoritmo que leia dois valores inteiros A e B,
// se os valores de A e B forem iguais, deverá somar os dois valores,
//caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
//imprimir seu valor na tela.
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int A = scanner.nextInt();
        System.out.println("Digite mais um numero: ");
        int B = scanner.nextInt();

        if (A == B) {
            int c = A + B;
            System.out.println("C = " + c);
        } else {
            int c = A * B;
            System.out.println("C = " + c);

            scanner.close();
        }
    }
}
