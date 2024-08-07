import java.util.Scanner;
public class Ball{
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        double pi =3.14159, resultado;
        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();
        resultado = pi*(Math.pow(raio, 2));
        System.out.printf("Resultado: %.4f", resultado);
        sc.close();
    }
}