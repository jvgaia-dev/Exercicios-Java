package com.jvgaia.estudos;
//Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor = scanner.nextDouble();
        double reajuste = valor * 0.05;
        double salarioFinal = valor + reajuste;

        System.out.println("Salario com reajuste de 5%: " + salarioFinal);

        scanner.close();
    }
}
