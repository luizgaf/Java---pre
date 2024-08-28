import java.util.Scanner;
import Product.Product;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite quantos produtos quer adicionar: ");
        int n = sc.nextInt();
        double media = 0;

        Product[] produto = new Product[n];
        for(int i = 0; i < n ; i++ ){
            System.out.printf("Digite o nome e preço do produto '%d': %n", i + 1);
            String name = sc.next();
            double price = sc.nextDouble();

            produto[i] = new Product(name, price, 0);

            media += produto[i].priPrice();
        }
        media /= n;

        System.out.println("Preco Medio: R$ "+ media);
    }
}