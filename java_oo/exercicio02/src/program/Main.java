package Program;

import java.util.Scanner;
import entities.Employee;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Digite nome, salário bruto e imposto do funcionário: ");
        employee.name = sc.nextLine();
        employee.grossSalary = sc.nextDouble();
        employee.tax = sc.nextDouble();

        System.out.println(employee.name + ", " + employee.netSalary());

        System.out.print("Digite a porcentagem do salário a ser acrescido: ");
        employee.increaseSalary(sc.nextDouble());

        System.out.println(employee.name + ", " + employee.netSalary());

    }
}
