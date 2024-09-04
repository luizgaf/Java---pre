import java.util.Scanner;
import gerenciamento.Empregados;
import java.util.ArrayList;
import java.util.List;

public class Main{
    private static boolean hasId(int id, List<Empregados> lista){
        for(Empregados emp : lista){
            if(emp.getId() == id){
            return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Empregados> listaEmpregados = new ArrayList<>();

        System.out.println("Insira o numero de funcionários: ");
        int n = sc.nextInt();

        int id;
        double salary;
        String name;

        int percentage;

        for(int i = 0; i < n; i++){
            System.out.println("Funcionario #"+ (i+1) + " :");

            System.out.print("ID: ");
            id = sc.nextInt();

            while(hasId(id, listaEmpregados)){
                System.out.print("Id já utilizado, tente novamente: ");
                id = sc.nextInt();
            }
            System.out.print("Nome: ");
            sc.nextLine();
            name = sc.nextLine();

            System.out.print("Salary: ");
            salary = sc.nextDouble();

            listaEmpregados.add(new Empregados(name, id, salary));
        }
        System.out.print("Entre com o ID do empregado que deseja aumentar o salário: ");
        id = sc.nextInt();

        boolean found = false;
        // do {
        //     System.out.print("Entre com o ID do empregado que deseja aumentar o salário: ");
        //     id = sc.nextInt();
        //     final int currentId = id; // Criar uma cópia final de 'id' para uso na lambda
        //     Empregados emp = listaEmpregados.stream()
        //                                     .filter(x -> x.getId() == currentId)
        //                                     .findFirst()
        //                                     .orElse(null);
        //     if (emp != null) {
        //         System.out.println("Quanto você deseja aumentar?");
        //         percentage = sc.nextInt();
        //         emp.increaseSalary(percentage);
        //         found = true;
        //     } else {
        //         System.out.println("ID não existe, tente novamente.");
        //     }
        // } while (!found);

        // CORRIGIR DEPOIS


        System.out.println();
		System.out.println("Lista de empregados:");
		for (Empregados emp : listaEmpregados) {
			System.out.println(emp.toString());
		}
				
		sc.close();
    }
}