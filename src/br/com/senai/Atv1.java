package br.com.senai;

import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);


        System.out.println("Digite o valor para A: ");
        double a = tec.nextDouble();
        System.out.println("Digite o valor para B: ");
        double b = tec.nextDouble();

        if (a > b){
            System.out.println("Em ordem crescente: " + b + " - " + a);
        }else{
            System.out.println("Em ordem crescente: " + a + " - " + b);
        }

    }
}
