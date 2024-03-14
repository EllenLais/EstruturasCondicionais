package br.com.senai;

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite o comprimento de LE: ");
        double le = tec.nextDouble();
        System.out.println("Digite o comprimento de LD: ");
        double ld = tec.nextDouble();
        System.out.println("Digite o comprimento de LI: ");
        double li = tec.nextDouble();

        if(li < (le + ld) && le < (ld + li) && ld < (li + le)){
            if((le == ld) && (le == li)){
                System.out.println("Triângulo equilátero");
            }else if((li == ld) || (li == le) || (le == ld)){
                System.out.println("Triângulo isóceles");
            }else{
                System.out.println("Triângulo escaleno");
            }
        }else{
            System.out.println("Não é um triângulo");
        }
    }
}
