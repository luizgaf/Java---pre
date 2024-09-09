public class Data{

    private String sex;
    private Double alt;

    public Data(String sex, Double alt){
        this.sex = sex;
        this.alt = alt;
    }

    public Double getAlt(){
        return alt;
    }

    public String getSex(){
        return sex;
    }
}