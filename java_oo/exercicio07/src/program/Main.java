package program;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entities.Employee;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("Insira o número de funcionários: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Funcionário #" + i + ": ");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("Esse id já está em uso, tente novamente: ");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salário: ");
            double salary = sc.nextDouble();
            list.add(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.print("Insira o id do funcionário que aumentará o salário: ");
        int id = sc.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {


        sc.close();
    }
}
