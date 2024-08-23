package Loja;

import java.util.Scanner;
import Product.Product;

public class addProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite Nome, o preço e a quantidade do produto: ");
            String name = sc.nextLine();
            double price = sc.nextDouble();
            int qnt = sc.nextInt();

            Product p1 = new Product(name, price, qnt);

            System.out.printf("Produto adicionado!%nNome: %s %nPreço: R$ %.2f %nQuantidade: %d%n", p1.priName(), p1.priPrice(), p1.priQtd());

            System.out.println("Deseja atualizar algo? y / n");
            sc.nextLine();  // Limpar o buffer
            String answer = sc.nextLine();

            if (answer.equals("n")) {
                System.out.println("OK! Tudo certo");
            } else if (answer.equals("y")) {
                System.out.printf("Você deseja mudar %n1- Nome %n2- Preço %n3- Quantidade.%n");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Digite o Nome: ");
                        sc.nextLine();  // Limpar o buffer
                        name = sc.nextLine();
                        p1.updateName(name);
                        break;
                    case 2:
                        System.out.println("Digite o Preço: ");
                        price = sc.nextDouble();
                        p1.updatePrice(price);
                        break;
                    case 3:
                        System.out.println("Digite a Quantidade: ");
                        qnt = sc.nextInt();
                        p1.updateQtd(qnt);
                        break;
                    default:
                        System.out.println("Resposta inválida, encerrando programa com informações atuais...");
                }
                System.out.printf("Produto atualizado!%nNome: %s %nPreço: R$ %.2f %nQuantidade: %d%n", p1.priName(), p1.priPrice(), p1.priQtd());
            } else {
                System.out.println("Resposta inválida, encerrando programa com informações atuais...");
            }
        } finally {
            sc.close();
        }
    }
}
