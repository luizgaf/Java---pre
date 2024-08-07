import java.util.Scanner;
public class Salario{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu numero: ");
        int numero = sc.nextInt();
        System.out.print("Digite suas horas trabalhadas: ");
        int horas = sc.nextInt();
        System.out.print("Digite o valor recebido por hora em R$: ");
        double valor = sc.nextDouble();
        double salario = horas*valor;
        System.out.printf("Funcionario Numero: %d%nO seu salario e de: R$ %.2f", numero, salario);
        sc.close();
    }
}