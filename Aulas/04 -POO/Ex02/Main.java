import java.util.Scanner;
import employes.employes;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        employes pe = new employes();
        System.out.println("Digite o nome do Empregado: ");
        pe.name = sc.nextLine();
        System.out.println("Digite o salário do Empregado: ");
        pe.GossSalary = sc.nextDouble();
        System.out.println("Digite o imposto do Empregado: ");
        pe.Tax = sc.nextDouble();

        System.out.printf("Employee: %s , R$ %.2f %n", pe.name, pe.NetSalary());
        System.out.println("Qual porcentagem aumentar do salario: ");
        int pc = sc.nextInt();
        pe.IncreaseSalary(pc);
        System.out.println("Updated: ");
        System.out.printf("Employee: %s , %.2f %n", pe.name, pe.NetSalary());
    }
}