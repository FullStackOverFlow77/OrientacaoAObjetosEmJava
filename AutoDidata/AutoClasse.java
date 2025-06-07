package AutoDidata;

public class AutoClasse {
    private int code; 
    private String name; 
    private double salary;
    
    public AutoClasse(int code , String name , double salary){
        this.code = code; 
        this.name = name; 
        this.salary = salary;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String toString(){
        return "Code: " + code + " | Name: " + name + " | Salary: " + salary;
    }
    
}
