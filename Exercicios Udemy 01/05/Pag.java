import java.util.Scanner;
public class Pag{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o codigo da peca A: ");
            int codeA = sc.nextInt();
        System.out.print("Digite o numero de pecas A: ");
            int npecA = sc.nextInt();
        System.out.print("Digite o valor de cada peca A: ");  
            double valorA = sc.nextDouble();
        System.out.print("Digite o codigo da peca B: ");
            int codeB = sc.nextInt();
        System.out.print("Digite o numero de pecas B: ");
            int npecB = sc.nextInt();
        System.out.print("Digite o valor de cada peca B: ");  
            double valorB = sc.nextDouble();
        sc.close();

        System.out.printf("%nCode A: %d%nCode B: %d%nValor a pagar: R$ %.2f", codeA, codeB, (npecA*valorA)+(npecB*valorB));
    }
}