package AtividadeLembrar;

import java.util.Scanner;


public class MainAluno{
    public static void main(String[]args){
        
        

        Scanner ler = new Scanner(System.in); 

        System.out.println("Digite o seu nome: ");
        String nome = ler.nextLine(); 

        System.out.println("Digite a sua idade: "); 
        int idade = ler.nextInt(); 

        System.out.println("Digite o seu salário: ");
        double salario = ler.nextDouble(); 

        ClasseAluno toString = new ClasseAluno(nome, idade, salario);

        System.out.println(toString);
        


        ler.close();
    }
}