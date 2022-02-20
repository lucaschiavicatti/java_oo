package program;

import entities.Client;
import entities.OrderItem;
import entities.Order;
import entities.Product;
import status.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println(" Digite os dados do cliente: ");
        System.out.print("Nome: ");
        String clientName = sc.nextLine();
        System.out.print("E-mail: ");
        String clientEmail = sc.next();
        System.out.print("Data de nascimento: ");
        Date clientBirthDay = sdf.parse(sc.next());
        Client client = new Client(clientName, clientEmail, clientBirthDay);

        System.out.println("Digite os dados do pedido: ");
        System.out.print("STATUS: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.print("Quantos itens para esse pedido? ");
        int itemsQuantity = sc.nextInt();
        for (int i = 1; i <= itemsQuantity; i++) {
            System.out.println("Digite o item #" + i);
            System.out.print("Nome do Produto: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Preço do produto: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantity = sc.nextInt();
            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println(order);


        sc.close();







    }
}
