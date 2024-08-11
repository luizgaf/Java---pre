import java.util.Scanner;
public class Jog{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva a hora inicial do jogo: ");
            double ha = sc.nextDouble();
        System.out.println("Escreva a hora final do jogo: ");
            double hb = sc.nextDouble();
        double res;
        if(ha<hb){
            res = hb - ha;
        }
        else{
            res = 24 - ha + hb;
        }
        System.out.printf("O jogo durou: %.0f", res);
    }
}