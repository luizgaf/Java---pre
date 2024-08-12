import java.util.Scanner;

public class Intervalo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;
        System.out.println("Digite um número para verificar o intervalo: ");
        numero = sc.nextDouble();
        if(numero < 1 || numero > 100){
            System.out.println("Fora de Intervalo");   
        }
        if(1 <= numero && numero <= 25){
            System.out.println("Intervalo: [1, 25]");
        }
        if(25 < numero && numero <= 50){
            System.out.println("Intervalo: [25, 50]");
        }
        if(50 < numero && numero <= 75){
            System.out.println("Intervalo: [50, 75]");
        }
        if(75 < numero && numero <= 100){
            System.out.println("Intervalo: [75, 100]");
        }
    }
}