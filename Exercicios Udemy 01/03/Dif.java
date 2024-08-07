import java.util.Scanner;
public class Dif{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Insira 4 valores: %n");
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double D = sc.nextDouble();
        double diff = A*B-C*D;
        System.out.printf("Diferenca: %.2f", diff);
        sc.close();
    }
}