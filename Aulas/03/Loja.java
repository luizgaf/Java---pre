public class Loja{
    public static void main(String[] args){
        String product1 = "Computer", product2 = "Office desk";
        int age = 30, code = 5290;
        char gender = 'F';
        double price1 = 2100.0, price2 = 650.0, measure = 53.234567;

        System.out.println("Products: ");
        System.out.printf("%n%s, which price is $ %.2f ", product1, price1);
        System.out.printf("%n%s, which price is $ %.2f ", product2, price2);
        System.out.printf("%nRecord: %d years old, code %d and gender: %c ", age, code, gender);
        System.out.printf("%nRounded: %.3f", measure);
    }
}