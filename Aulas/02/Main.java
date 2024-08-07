import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double x, y, result;
        System.out.print("Digite o primeiro Numero: ");
        x = sc.nextDouble();
        System.out.print("Digite o segundo numero: ");
        y = sc.nextDouble();
        result = (x + y) / 2.0 ;
        System.out.println("O resutado foi: "+ result);
        sc.close();
    }
}