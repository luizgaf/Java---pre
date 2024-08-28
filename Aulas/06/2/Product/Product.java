package Product;

public class Product{

    private String name;
    private double value;
    private int qtd;

    public Product(String name, double value, int qtd){
        this.name = name;
        this.value = value;
        this.qtd = qtd;
    }
    // Nome
    public String priName(){
        return name;
    }

    public void updateName(String name){
        this.name = name;
    }

    // Preço
    public double priPrice(){
        return value;
    }

    public void updatePrice(double value){
        this.value = value;
    }

    // Quantidade
    public int priQtd(){
        return qtd;
    }

    public void updateQtd(int qtd){
        this.qtd = qtd;
    }

}