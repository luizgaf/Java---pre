import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class TwoDateDiff{


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LocalDate localDateNow = LocalDate.now();

        System.out.println("Digite sua data de nascimento (aaaa-mm-dd) :");
        String stringBirthDate = sc.nextLine();

        LocalDate birthDate = LocalDate.parse(stringBirthDate);

        Period idade = Period.between(birthDate, localDateNow);

        System.out.println("Voce tem "+ idade.getYears() +" anos, " + idade.getMonths() +" meses e " + idade.getDays() + " dias");
    }
}