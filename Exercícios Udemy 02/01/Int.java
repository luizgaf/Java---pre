import java.util.Scanner;
public class Int{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
            double num = sc.nextInt();
        if(num < 0){
            System.out.print("Negativo");
        }
        else{
            System.out.print("Não Negativo");
        }
    }
}