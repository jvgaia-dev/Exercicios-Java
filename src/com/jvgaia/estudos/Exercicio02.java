package com.jvgaia.estudos;
//Faça um algoritmo para receber um número qualquer
// e imprima na tela se o número é par ou ímpar, positivo ou negativo.
public class Exercicio02 {
    public static void main(String[] args) {
        int num = 0;

        if (num % 2 == 0){
            System.out.println("o numero é par");
        } else
            System.out.println("o numero é impar");

        if (num > 0){
            System.out.println("o numero é positivo");
        } else if (num < 0) {
            System.out.println("o numero é negativo");
        } else
            System.out.println("o numero é zero");
    }
}
