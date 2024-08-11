import java.util.Scanner;
public class Par{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
            double num = sc.nextDouble();
        if(num % 2 == 0 || num == 0){
            System.out.print("Par");
        }
        else{
            System.out.print("Ímpar");
        }
    }
}