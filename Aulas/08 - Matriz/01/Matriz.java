import java.util.Scanner;

public class Matriz{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int ordem = sc.nextInt();

        int[] [] matriz = new int[ordem] [ordem];

        int j = 0, ans, neg = 0, i = 0;

        // Inserir os valores na matriz
        for (i=0; i < matriz.length; i++) {
                    for (j=0; j<matriz[i].length; j++) {
                        matriz[i][j] = sc.nextInt();
                        if(matriz[i][j] < 0){
                            neg++;
                        }
                    }
                }


        // Achar diagonal da matriz
        System.out.println("Diagonal da matriz:");

        for(i = 0; i < ordem; i++){
            System.out.print(+ matriz[i][i] +" ");
        }

        // Numeros negativos
        System.out.println(" QTD Numeros negativos: "+ neg);
    }
}