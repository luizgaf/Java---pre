import java.util.Scanner;
public class Mlp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva dois Numeros: ");
            double na = sc.nextDouble();
            double nb = sc.nextDouble();
            if(na<nb){
                double tp = nb;
                nb = na;
                na = tp;
            }
            if((na % nb) == 0){
                System.out.println("É Múltiplo");
            }
            else{
                System.out.println("Não é Múltiplo");
            }
    }
}