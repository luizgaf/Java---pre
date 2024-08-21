package employes;
public class employes{
    public String name;
    public double GossSalary;
    public double Tax;

    public double NetSalary() {
        return GossSalary - Tax;
    }

    public void IncreaseSalary( int percent) {
        GossSalary += GossSalary *percent/100;
    }
}