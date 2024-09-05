package school;

public class Studant {

    private Double[] grade = new Double[2]; 
    private String name;
    private Double media;

    public Studant(String name, Double grade1, Double grade2) {
        this.name = name;
        this.grade[0] = grade1;
        this.grade[1] = grade2;
        this.media = (grade[0] + grade[1])/2;
    }

    public Double getMedia(){
        return media;
    }

    public boolean  isApproved(){
        if(media < 6){
            return false;
        }
        else{
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public Double getGrade1() {
        return grade[0];
    }

    public Double getGrade2() {
        return grade[1];
    }
}
