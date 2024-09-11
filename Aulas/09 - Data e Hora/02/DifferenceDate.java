import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;

public class DifferenceDate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma data (aaaa-mm-dd)");
        String stringFirstDate = sc.nextLine();

        System.out.println("Digite outra data (aaaa-mm-dd)");
        String stringSecondDate = sc.nextLine();

        LocalDate firstDate = LocalDate.parse(stringFirstDate);
        LocalDate secondDate= LocalDate.parse(stringSecondDate);

        Period difference = Period.between(firstDate, secondDate);

        System.out.println("Diferenca: "+ difference.getYears() +" anos, " + difference.getMonths() +" meses e " + difference.getDays() + " dias");
    }
}