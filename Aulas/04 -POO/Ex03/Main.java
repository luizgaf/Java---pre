import java.util.Scanner;
import alunos.Aluno;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.name = sc.nextLine();

        System.out.println("Digite as 3 notas do aluno: ");
        aluno.ga = sc.nextDouble();
        aluno.gb = sc.nextDouble();
        aluno.gc = sc.nextDouble();
        
        aluno.verify();

        System.out.printf("Aluno: %s%nNota: %.2f%nResult: %s%n", aluno.name, aluno.gg, aluno.result);
        if(aluno.result == "FAILED"){
            System.out.println("Missing: "+ aluno.rg);
        }
    }
}