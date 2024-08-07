import java.util.Scanner;
public class Calc{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x, y, result;
        System.out.print("Insira um numero: ");
        x = sc.nextInt();
        System.out.print("Insira outro numero: ");
        y = sc.nextInt();
        result = x + y;
        System.out.printf("resultado: %d", result);
        sc.close();
    }
}