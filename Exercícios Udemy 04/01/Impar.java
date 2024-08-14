import java.util.Scanner;
public class Impar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int x = sc.nextInt();
        System.out.println("");
        for(int i = 1; i <= x; i++){
            if((i % 2) != 0){
                System.out.println(i);
            }
            else{}
        }
    }
}