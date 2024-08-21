import java.util.Scanner;
public class media{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos casos você quer colocar: ");
        int caso = sc.nextInt();
        double[] x = new double[caso];
        for(int i = 0; i < caso; i++){
            System.out.println("Digite os numeros de caso: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            a *= 2; b *= 3; c*= 5;
            x[i] = ((a+b+c)/10);;
            System.out.printf("Caso %d: %.1f%n", i+1, x[i]);
        }
        sc.close();
    }
}