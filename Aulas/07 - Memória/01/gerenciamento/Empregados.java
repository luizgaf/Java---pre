package gerenciamento;

public class Empregados{

    private String name;
    private Integer id;
    private Double salary;

    public Empregados(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100.0;
    }

        public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String toString(){
        return id + ", " + name + ", " + String.format("R$ %.2f", salary);
    }

}