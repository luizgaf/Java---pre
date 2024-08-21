package alunos;
public class Aluno{
    public String name;
    public double ga, gb, gc;
    public String result;
    public double rg;

    public double gg;

    public void verify(){
        gg = ga+gb+gc;
        if(gg < 60){
            result = "FAILED";
            rg = 60 - gg;
        }
        else{
            result = "PASS";
        }
    }

}