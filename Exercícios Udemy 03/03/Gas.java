import java.util.Scanner;

public class Gas{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r, g = 0, a = 0, d = 0;
        do { 
            System.out.println("_______________________________");
            System.out.println("Digite o combustível preferido:");
            System.out.println("1- Álcool");
            System.out.println("2- Gasolina");
            System.out.println("3- Diesel");
            r = sc.nextInt();
            switch (r) {
                case 1:
                    a++;
                    break;
                case 2:
                    g++;
                    break;
                case 3:
                    d++;
                    break;
                case 4:
                    break;
                default:
                    System.out.println("ERRO: caractere inválido tente novamente");
            }
        } while (r != 4);
        System.out.printf("Muito Obrigado!%nÁlcool: %d%nGasolina: %d%nDiesel: %d", a, g, d);
    }
}