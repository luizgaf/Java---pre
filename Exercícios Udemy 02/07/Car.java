import java.util.Scanner;

public class Car{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        System.out.println("Digite dois numeros para determinar as coordenadas: ");
        System.out.println("X: ");
        x = sc.nextDouble();
        System.out.println("Y: ");
        y = sc.nextDouble();
        if(x == 0 && y == 0){
            System.out.println("Origem");   
        }
        if(x > 0){
            if(y > 0){
                System.out.println("Q1");  
            }
            else{
                System.out.println("Q4");  
            }
        }
        if(x < 0){
            if( y> 0){
                System.out.println("Q2");  
            }
            else{
                System.out.println("Q3");  
            }
        }
    }
}