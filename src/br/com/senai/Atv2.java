package br.com.senai;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = tec.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = tec.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = tec.nextDouble();

        nota1 = nota1 * 2/10;
        nota2 = nota2 * 3/10;
        nota3 = nota3 * 5/10;

        double media = nota1 + nota2 + nota3;

        if(media >= 6){
            System.out.println("Aprovado com média: " + media);
        }else if(media >= 4){
            System.out.println("Recuperação com média: " + media);
        }else{
            System.out.println("Reprovado com média: " + media);
        }
    }
}
