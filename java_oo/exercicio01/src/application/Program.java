package application;

import entities.Rectangle;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Digite a largura e a altura do retangulo: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println(rectangle.width + ", " + rectangle.height);
        System.out.println("Sua Área é: " + rectangle.area());
        System.out.println("Seu perímetro é: " + rectangle.perimeter());
        System.out.printf("Sua diagonal é: %.2f", rectangle.diagonal());

        sc.close();

    }
}
