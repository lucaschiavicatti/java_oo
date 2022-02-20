package program;

import java.util.Scanner;

import entities.BankAccount;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount bankAccount;

        System.out.print("Insira o número da conta: ");
        int number = sc.nextInt();

        System.out.print("Insira o Nome do proprietário da conta: ");
        String name = sc.next();

        System.out.print("Será com depósito inicial (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.print("Insira o valor do depósito inicial: ");
            double initialDeposit = sc.nextDouble();
            bankAccount = new BankAccount(number, name, initialDeposit);
        }
        else {
            bankAccount = new BankAccount(number, name);
        }

        System.out.println();
        System.out.println("Informações da conta bancária:");
        System.out.println(bankAccount);

        System.out.println();
        System.out.print("Deposite um valor: ");
        double depositValue = sc.nextDouble();
        bankAccount.deposit(depositValue);
        System.out.println("Informações atualizadas:");
        System.out.println(bankAccount);

        System.out.println();
        System.out.print("Digite o valor de saque:");
        double withdrawValue = sc.nextDouble();
        bankAccount.withdraw(withdrawValue);
        System.out.println("Informações atualizadas:");
        System.out.println(bankAccount);

        sc.close();

    }
}
