import java.util.Scanner;
public class Cart{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x, y;
            do {
                System.out.println("Digite coordenadas (x , y): ");
                x = sc.nextInt();
                y = sc.nextInt();
                if(x>0){
                    if(y>0){
                        System.err.println("Quadrante 1");
                    }
                    if(y<0){
                        System.err.println("Quadrante 4");
                    }
                }
                if(x<0){
                    if(y>0){
                        System.err.println("Quadrante 2");
                    }
                    if(y<0){
                        System.err.println("Quadrante 3");
                    }
                }
                if(x == 0 || y == 0){
                    x = 0; y =0;
                }
            } while (x != 0 || y != 0);
            System.out.println("Programa terminado pois x ou y é igual a 0");
        }
        System.exit(1);
    }
}