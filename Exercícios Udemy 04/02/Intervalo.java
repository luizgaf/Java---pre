import java.util.Scanner;
public class Intervalo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos numeros quer colocar: ");
            int j = sc.nextInt();
            int[] x = new int[j];
            int in = 0, out = 0;
            System.out.println("");
            for(int i = 0; i < j; i++){
                x[i] = sc.nextInt();
            }
            for(int i = 0; i < j; i++){
                if(10 <= x[i] && x[i] <= 20 ){
                    in++;
                }
                else{
                    out++;
                }
            }
        System.out.println("");
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}