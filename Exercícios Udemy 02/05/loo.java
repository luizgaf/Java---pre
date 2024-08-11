import java.util.Scanner;
public class loo{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("____________________________________________");
    System.out.println("    Cod |     Produto           |    Preço  ");
    System.out.println("    1   |     Cachorro Quente   |    R$ 4,00");
    System.out.println("    2   |     X-Salada          |    R$ 4,50");
    System.out.println("    3   |     X-Bacon           |    R$ 5,00");
    System.out.println("    4   |     Torrada simples   |    R$ 2,00");
    System.out.println("    5   |     Refrigerante      |    R$ 1,50");
    System.out.println("____________________________________________");
    System.out.println("Digite o numero do produto que você quer: ");
    int produto = sc.nextInt();
    double preco = 0;
    switch (produto) {
        case 1 -> {
            System.out.println("Você escolheu Cachorro Quente!");
            preco = 4;
            }
        case 2 -> {
            System.out.println("Você escolheu X-Salada!");
            preco = 4.50;
            }
        case 3 -> {
            System.out.println("Você escolheu X-Bacon!");
            preco = 5;
            }
        case 4 -> {
            System.out.println("Você escolheu Torrada Simples!");
            preco = 2;
            }
        case 5 -> {
            System.out.println("Você escolheu Refrigerante!");
            preco = 1.50;
            }
        default -> System.out.println("Opção inválida, tente novamente!");
    }   
    System.out.println("Digite a quantidade requerida: ");
    int qtd = sc.nextInt();
    double fnl = preco * qtd;
    System.out.printf("O valor total ficou: R$ %.2f", fnl);
    }
}
