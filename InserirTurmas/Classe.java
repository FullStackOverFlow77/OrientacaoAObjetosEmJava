package InserirTurmas;

import java.util.Scanner;

public class Classe {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Alunos aluno1 , aluno2 , aluno3 , identidade1 ,identidade2, identidade3,salario1, salario2, salario3;

        aluno1 = new Alunos();
        aluno2 = new Alunos();
        aluno3 = new Alunos();

        identidade1 = new Alunos();
        identidade2 = new Alunos();
        identidade3 = new Alunos();

        salario1 = new Alunos();
        salario2 = new Alunos();
        salario3 = new Alunos();
        
        System.out.println("Digite o nome de 3 alunos: ");
        aluno1.a = ler.nextLine();
        aluno2.a = ler.nextLine();
        aluno3.a = ler.nextLine();

        System.out.println("\nDigite a idade: ");
        identidade1.b = ler.nextInt();
        identidade2.b = ler.nextInt();
        identidade3.b = ler.nextInt();

        System.out.println("\nDigite o saldo Mensal: ");
        salario1.c = ler.nextDouble();
        salario2.c = ler.nextDouble();
        salario3.c = ler.nextDouble();

        exibirResultados exibir = new exibirResultados();

        System.out.println("\nResultado:\n");

        exibir.mostrar(aluno1.a , identidade1.b , salario1.c);
        System.out.println("\n");
        exibir.mostrar(aluno2.a , identidade2.b , salario2.c);
        System.out.println("\n");
        exibir.mostrar(aluno3.a , identidade3.b , salario3.c);
        System.out.println("\n");

        ler.close();
    }   
    }
    

