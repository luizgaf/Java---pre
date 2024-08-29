import java.util.Scanner;
import hotel.roomMan;

public class Main{
    public static void main(String[] args){
        roomMan[] data = new roomMan[11];
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
            int i = sc.nextInt();
        
        int[] ocupied = new int[i];

        for(int j = 0; j < i; j++ ){

            System.out.printf("Rent %d %n", j+1);
            sc.nextLine();
            System.out.print("Name: "); 
                String name = sc.nextLine();

            System.out.print("Email: "); 
                String email = sc.nextLine();

            System.out.print("Room: "); 
                int room = sc.nextInt();
            System.out.printf("=========================%n");

            ocupied[j] = room;
            data[room] = new roomMan(name, email, room);
        }

        System.out.println("Busy Rooms:");
        for(int j = 0; j < i; j++ ){
            System.out.printf("%d : %s, %s %n", data[ocupied[j]].getRoom(), data[ocupied[j]].getName(), data[ocupied[j]].getEmail());
        }

    }
}