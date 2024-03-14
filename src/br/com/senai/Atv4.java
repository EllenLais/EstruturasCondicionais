package br.com.senai;


import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite o saldo inicial: ");
        double saldoInicial = tec.nextDouble();
        System.out.println("Digite o valor do cheque que entrou: R$");
        double cheque = tec.nextDouble();

        if(cheque <= saldoInicial){
            saldoInicial = saldoInicial - cheque;
            System.out.println("Seu novo saldo: R$" + saldoInicial);
        }else{
            System.out.println("Este cheque não pode ser descontado");
            System.out.println("Seu saldo continua: R$" + saldoInicial);
        }

    }
}
