import java.util.Scanner;

public class Altura{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas deseja adicionar?");
        int n = sc.nextInt();

        double[] h = new double[n];
        double media = 0;

        for(int i = 0; i < n ; i++ ){
            System.out.printf("Digite a altura '%d' em metros: ", i + 1);
            h[i] = sc.nextDouble();
            media += h[i];
            }
        media /= n;
        System.out.printf("Media: %.2f", media);
        sc.close(); 
    }
}