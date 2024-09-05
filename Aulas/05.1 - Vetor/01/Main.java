import java.util.Scanner;
import school.Studant;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos quer adicionar:");
        Integer n = sc.nextInt();
        sc.nextLine();

        Studant[] studant = new Studant[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite o nome do "+ (i+1) +"o Aluno:");
            String name = sc.nextLine();

            System.out.println("Digite a primeira nota do "+ (i+1) +"o Aluno:");
            Double nota1 = sc.nextDouble();

            System.out.println("Digite a segunda nota do "+ (i+1) +"o Aluno:");
            Double nota2 = sc.nextDouble();
            sc.nextLine();

            studant[i] = new Studant(name, nota1, nota2);
            System.out.println("");
        }

        System.out.println("Alunos aprovados:");

        for(int i = 0; i < n; i++){
            if(studant[i].isApproved() == true){
                System.out.println(studant[i].getName());
            }
        }
    }
}
