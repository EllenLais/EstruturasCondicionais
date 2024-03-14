package br.com.senai;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double desconto;

        System.out.println("Digite o nome do cliente: ");
        String cliente = tec.nextLine();
        System.out.println("Digite o valor da compra: R$");
        double compra = tec.nextDouble();

        if(compra <= 200){
            desconto = 10;
        }else if(compra <= 500){
            desconto = 15;
        }else{
            desconto = 20;
        }

        double valorDesconto = (compra * desconto)/100;
        double valorPagar = compra - desconto;

        System.out.println("O nome do cliente é: " + cliente);
        System.out.println("O valor da compra foi: R$" + compra);
        System.out.println("O percentual de desconto foi de: " + desconto + "%");
        System.out.println("O valor do desconto foi de: R$" + valorDesconto);
        System.out.println("O valor a pagar foi de: R$" + valorPagar);

    }
}
