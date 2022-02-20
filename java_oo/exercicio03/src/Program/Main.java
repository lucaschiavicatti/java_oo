package Program;

import java.util.Scanner;

import entities.Aluno;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite suas notas em cada trimestre: ");
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.println("A nota final é: " + aluno.notaFinal());
        if (aluno.notaFinal() < 60) {
            System.out.println("Reprovado");
            System.out.println("Faltaram " + (60 - aluno.notaFinal()) + " pontos para alcançar a média de 60 pontos.");
        }
        else {
            System.out.println("Aprovado com " + aluno.notaFinal() + " pontos");
        }

        sc.close();
    }
}
