package br.com.senai;

import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = tec.nextInt();

        if(num %2 == 0){
            System.out.println("Esse número é par");
        }else{
            System.out.println("Esse número é ímpar");
        }
    }
}
