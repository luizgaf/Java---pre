import java.util.Scanner;
import entities.Retangle;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Retangle x = new Retangle();
        System.out.println("Insira comprimento e altura do triangulo: ");
        x.width = sc.nextDouble();
        x.height = sc.nextDouble();
        double area, perimeter, diagonal;
        area = x.area();
        perimeter = x.perimeter();
        diagonal = x.diagonal();
        System.out.printf("Area: %.2f%nPerimetro: %.2f%nDiagonal: %.2f", area, perimeter, diagonal);
    }
}