import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao adicionadas? :");
        int num = sc.nextInt();

        Data[] cons = new Data[num];
        int male = 0;

        for (int i = 0; i < num ; i++){
            System.out.println("Digite a altura da "+ (i+1) +"a pessoa:");
            Double  alt = sc.nextDouble();

            System.out.println("Digite a genero da "+ (i+1) +"a pessoa:");
            String sex = sc.next();
            if(sex.charAt(0) == 'M'){
                male++;
            }

            cons[i] = new Data(sex, alt);
        }

        // verificar maior e menor
        double maior = 0;
        double menor = 0;
        for(int i = 0; i< num ; i++){
            if(cons[i].getAlt() > maior){
                maior = cons[i].getAlt();
            }
            if(menor == 0){
                menor = maior;
            }
            if(cons[i].getAlt() < menor){
                menor = cons[i].getAlt();
            }
        }


        //media
        double media = 0;
        int mulher = 0;
        for(int i = 0; i< num ; i++){
            if(cons[i].getSex().charAt(0) == 'F'){
                media += cons[i].getAlt();
                mulher++;
            }
        }

        System.out.printf("Menor altura: %.2f%n", menor);
        System.out.printf("Maior altura: %.2f%n", maior);
        System.out.printf("Media altura mulheres: %.2f%n", media/mulher);
        System.out.println("Numero de homens: "+ male);

    }
}