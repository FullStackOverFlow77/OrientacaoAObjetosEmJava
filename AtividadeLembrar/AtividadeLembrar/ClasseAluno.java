package AtividadeLembrar;

public class ClasseAluno {
    private String aluno; 
    private int idade; 
    private double salario;

    ClasseAluno(){

    }
    public ClasseAluno(String aluno , int idade , double salario){
        this.aluno = aluno; 
        this.idade = idade; 
        this.salario = salario ; 
    }

    public String getAluno(){
        return aluno; 
    }
    public void setAluno(String aluno){
        this.aluno = aluno; 
    }

    public int getIdade(){
        return idade; 
    }

    public void setIdade(int idade){
        this.idade = idade; 
    }

    public double getSalario(){
        return salario; 
    }
    public void setSalario(double salario){
        this.salario = salario; 
    }
    
    public String toString(){
        return "Nome: " + aluno + "Idade: " + idade + "Salário: " + salario;
    }

}
