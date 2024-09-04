import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Maçã");
        fruits.add("Banana");
        fruits.add("Cereja");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
