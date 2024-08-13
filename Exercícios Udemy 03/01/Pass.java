import java.util.Scanner;
public class Pass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do { 
            System.out.println("Digite a senha: ");
            int senha = sc.nextInt();
            if (senha == 12345) {
                i = 1;
            }
            else{
                System.out.printf("%nSenha invália, tente novamente!");
            }

        } while (i == 0);
        System.out.printf("%nSenha correta, Bem vindo!");
        System.exit(0);
    }
}