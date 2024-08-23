package money;

public class Dollar{
    public static double exchange(double value, double ammount){
        double p = value * ammount;
        return p * 1.06;
    }
}