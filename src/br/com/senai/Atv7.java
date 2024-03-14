package br.com.senai;
import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite o valor para A: ");
        double a = tec.nextDouble();
        System.out.println("Digite o valor para B: ");
        double b = tec.nextDouble();
        System.out.println("Digite o valor para C: ");
        double c = tec.nextDouble();

        if(a <= b && a <= c) {
            if (b <= c) {
                System.out.println("Em ordem crescente ficou: " + a + " - " + b + " - " + c);
            } else {
                System.out.println("Em ordem crescente ficou: " + a + " - " + c + " - " + b);
            }
        }else if(b <= a && b <= c){
            if(a <= c){
                System.out.println("Em ordem crescente ficou: " + b + " - " + a + " - " + c);
            }else{
                System.out.println("Em ordem crescente ficou: " + b + " - " + c + " - " + a);
            }
        }else{
            if(a <= b){
                System.out.println("Em ordem crescente ficou: " + c + " - " + a + " - " + b);
            }else{
                System.out.println("Em ordem crescente ficou: " + c + " - " + b + " - " + a);
            }
        }


    }
}
