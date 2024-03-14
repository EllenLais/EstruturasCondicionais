package br.com.senai;

import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro número: ");
        int num1 = tec.nextInt();
        System.out.println("Digite o valor do segundo número: ");
        int num2 = tec.nextInt();
        System.out.println("Digite o valor do terceiro número: ");
        int num3 = tec.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("O maior número é o " + num1);
        }else if(num2 >= num1 && num2 >= num3){
            System.out.println("O maior número é o " + num2);
        }else{
            System.out.println("O maior número é o " + num3);
        }
        if(num1 <= num2 && num1 <= num3){
            System.out.println("O menor número é o " + num1);
        }else if(num2 <= num1 && num2 <= num3){
            System.out.println("O menor número é o " + num2);
        }else{
            System.out.println("O menor número é o " + num3);
        }
    }
}
