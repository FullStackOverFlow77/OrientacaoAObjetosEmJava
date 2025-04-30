package Teste;

import java.util.Scanner;

public class JavaPrincipal {
    public static void main(String[] args) {
    
    
        Scanner ler = new Scanner(System.in);
        
        ClasseJava livro1 , livro2 , livro3 , autor1 , autor2 , autor3 , ano1 , ano2 , ano3 ; 

        livro1 = new ClasseJava();
        livro2 = new ClasseJava();
        livro3 = new ClasseJava();

        autor1 = new ClasseJava(); 
        autor2 = new ClasseJava(); 
        autor3 = new ClasseJava(); 

        ano1 = new ClasseJava(); 
        ano2 = new ClasseJava(); 
        ano3 = new ClasseJava();
        
        System.out.println("Digite o nome dos Livros:        ");
        livro1.livro = ler.nextLine();
        livro2.livro = ler.nextLine();
        livro3.livro = ler.nextLine();

        System.out.println("Digite o nome dos Autores ");
        autor1.autor = ler.nextLine();
        autor2.autor = ler.nextLine();
        autor3.autor = ler.nextLine();

        System.out.println("Digite o ano do Livro: ");
        ano1.ano = ler.nextInt();
        ano2.ano = ler.nextInt();
        ano3.ano = ler.nextInt();

        ExibicaoBiliotoeca mostrarResultado = new ExibicaoBiliotoeca();

        mostrarResultado.mostrar(livro1,autor1, ano1);
        System.out.println();
        mostrarResultado.mostrar(livro2,autor2, ano2);
        System.out.println();
        mostrarResultado.mostrar(livro3,autor3, ano3);
        System.out.println();



        ler.close();
}
}
