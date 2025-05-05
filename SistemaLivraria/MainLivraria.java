package SistemaLivraria;
import java.util.Scanner;

public class MainLivraria{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Digite os dados do livro");
        System.out.println("Titulo: ");
        String nome = sc.nextLine();
        
        
        
        System.out.println("Autor: ");
        String autor = sc.nextLine(); 

        System.out.println("Ano de publicação: ");
        int data = sc.nextInt();
        
        ClasseLivraria armazenado = new ClasseLivraria(nome, autor, data); 

        System.out.println("Dados do livro: ");
        System.out.println(armazenado);
        
        
        


        sc.close();
    }
}