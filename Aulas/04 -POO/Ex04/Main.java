import java.util.Scanner;
import money.Dollar;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do dólar: ");
            double value = sc.nextDouble();

        System.out.println("Digite a quantidade requerida: ");
            double ammount = sc.nextDouble();

        double result = Dollar.exchange(value, ammount);
        System.out.printf("O total ficará: R$ %.2f", result);
    }
}