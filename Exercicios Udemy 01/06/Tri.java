import java.util.Scanner;
public class Tri{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira algum ponto flutuante: ");
        double A = sc.nextDouble();
        System.out.print("Insira algum ponto flutuante: ");
        double B = sc.nextDouble();
        System.out.print("Insira algum ponto flutuante: ");
        double C = sc.nextDouble();
        sc.close();
        double tri, cir, tra, qua, ret;
        tri = (A*C)/2;
        cir = (3.14159*(Math.pow(C, 2)));
        tra = ((A+B)*C)/2;
        qua = Math.pow(B, 2);
        ret = A*B;
        System.out.printf("Triangulo: %.3f%nCirculo: %.3f%nTrapezio: %.3f%nQuadrado: %.3f%nRetangulo: %.3f", tri, cir, tra, qua, ret);
    }
}