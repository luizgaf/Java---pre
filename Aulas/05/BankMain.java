import bank.AcOp;
import bank.UserData;
import java.util.Scanner;

public class BankMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account number: ");
        String account = sc.next();
        sc.nextLine();

        System.out.println("Enter Account holder: ");
        String name = sc.nextLine();

        UserData data = new UserData(name, account);

        System.out.println("Enter initial deposit value? (y/n): ");
        String answ = sc.next();

        double balance = 0;
        if (answ.equals("n")){
        }
        else if (answ.equals("y")){
            System.out.println("Enter initial deposit value: ");
            double initvalue = sc.nextDouble();
            balance = AcOp.Deposit(balance, initvalue);
        }
        else{
            System.err.println("Invalid Response");
        }

        System.out.println("Account data:");
        System.out.println("Account: "+ data.GetAccount());
        System.out.println("Holder: "+ data.GetName());
        System.out.printf("Balance: U$ %.2f %n", balance);

        System.out.println("Enter a deposit value: ");
        double dValue = sc.nextDouble();
        balance = AcOp.Deposit(balance, dValue);
        System.out.println("Updated account data:");
        System.out.println("Account data:");
        System.out.println("Account: "+ data.GetAccount());
        System.out.println("Holder: "+ data.GetName());
        System.out.printf("Balance: U$ %.2f %n", balance);

        System.out.println("Enter a withdraw value: ");
        double wValue = sc.nextDouble();
        balance = AcOp.Withdraw(balance, wValue);
        System.out.println("Updated account data:");
        System.out.println("Account data:");
        System.out.println("Account: "+ data.GetAccount());
        System.out.println("Holder: "+ data.GetName());
        System.out.printf("Balance: U$ %.2f %n", balance);
    }
}