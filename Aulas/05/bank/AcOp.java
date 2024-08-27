package bank;

public class AcOp{

    public static double Deposit(double balance, double dValue){
        return balance + dValue;
    }

    public static double Withdraw(double balance, double wValue){
        return balance - wValue - 5;
    }
}