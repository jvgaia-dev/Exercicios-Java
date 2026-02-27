package com.jvgaia.estudos;
//Faça um algoritmo que leia dois valores booleanos (lógicos) e
// determine se ambos são VERDADEIRO ou FALSO.
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        if (a && b){
            System.out.println("ambos sao verdadeiros");
        } else if (!a && !b) {
            System.out.println("ambos sao falsos");
        } else
            System.out.println("um é falso e outro verdadeiro");
    }
}
