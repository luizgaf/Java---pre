import gerenciamento.Empregados;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

        double salary;
        String name;

        for(int i = 0; i < n; i++){
            System.out.println("Funcionario #"+ (i+1) + " :");

            System.out.print("ID: ");
            int id = sc.nextInt();

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
        Integer id = sc.nextInt();
        
		Empregados emp = listaEmpregados.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			Integer percentage = sc.nextInt();
			emp.increaseSalary(percentage);
		}


        System.out.println();
		System.out.println("Lista de empregados:");
		for (Empregados empl : listaEmpregados) {
			System.out.println(empl.toString());
		}
				
		sc.close();
    }
}