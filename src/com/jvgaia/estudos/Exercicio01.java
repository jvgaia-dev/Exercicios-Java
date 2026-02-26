package com.jvgaia.estudos;
//Faça um algoritmo que leia os valores de A, B, C
// e em seguida imprima na tela a soma entre A e B e mostre se a soma é menor que C.

public class Exercicio01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        int c = 20;
        int soma = a + b;

        System.out.println("a + b = " + soma);
        if (soma < c){
            System.out.println("A soma de a+b é menor que c");
        }
    }
}
