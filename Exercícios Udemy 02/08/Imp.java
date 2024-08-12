import java.util.Scanner;

public class Imp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salario: R$ ");
        double sal = sc.nextDouble();
            if(sal < 2000.01){
                System.out.println("Insento de imposto de renda");
                System.exit(0);
            }
                if(sal > 2000 && sal < 3000.01){
                    sal -= 2000;
                    sal *= 0.08;
                    System.out.printf("O seu imposto de renda é igual a: R$ %.2f", sal);
                    System.exit(0);
                }
                if(sal > 3000 && sal < 4500.01){
                    double tsal = 80;
                    sal -= 3000;
                    sal *= 0.18;
                    sal += tsal;
                    System.out.printf("O seu imposto de renda é igual a: R$ %.2f", sal);
                    System.exit(0);
                }
                if(sal > 4500){
                    double tsal = 350;
                    sal -= 4500;
                    sal *= 0.28;
                    sal += tsal;
                    System.out.printf("O seu imposto de renda é igual a: R$ %.2f", sal);
                    System.exit(0);
                }
    }
}
            