package program;

import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor do dolar? ");
        double priceDolar = sc.nextDouble();

        System.out.print("Digite o valor em dolares a ser comprado: ");
        double dolar = sc.nextDouble();

        System.out.println(CurrencyConverter.payForDolar(priceDolar,dolar));
    }
}
