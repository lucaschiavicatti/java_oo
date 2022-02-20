package program;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contribuinte> list = new ArrayList<Contribuinte>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double income = sc.nextDouble();


            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new PessoaFisica(name, income, healthExpenditures));

            }
            else{
                System.out.println("Number of Employees: ");
                int employees = sc.nextInt();
                list.add(new PessoaJuridica(name, income, employees));

            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID: ");
        for (Contribuinte contribuinte: list) {
            double impost = contribuinte.impost();
            System.out.println(contribuinte.getName() + ": $" + contribuinte.impost());
            sum += impost;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();

    }
}
