package InserirAnimais;

import java.util.Scanner;



public class PrincipalAnimais {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        AnimaisClasses nome1 = new AnimaisClasses();
        AnimaisClasses nome2 = new AnimaisClasses();
        AnimaisClasses nome3 = new AnimaisClasses();

        AnimaisClasses idade1 = new AnimaisClasses();
        AnimaisClasses idade2 = new AnimaisClasses();
        AnimaisClasses idade3 = new AnimaisClasses(); 

        AnimaisClasses preco1 = new AnimaisClasses(); 
        AnimaisClasses preco2 = new AnimaisClasses(); 
        AnimaisClasses preco3 = new AnimaisClasses(); 

        
        System.out.println("Digite o Nome do seu animal: \n");
        
        nome1.nome = ler.nextLine();
        nome2.nome = ler.nextLine();
        nome3.nome = ler.nextLine();
       
        System.out.println("\nDigite a idade do seu animal: \n");

        idade1.idade = ler.nextInt();
        idade2.idade = ler.nextInt();
        idade3.idade = ler.nextInt();

        System.out.println("\nDigite o preço do seu animal: \n");

        preco1.preco = ler.nextDouble();
        preco2.preco = ler.nextDouble();
        preco3.preco = ler.nextDouble();
        
        System.out.println("\n");
        
        ExibicaoAnimais exibicao = new  ExibicaoAnimais();

        exibicao.mostrarResultado(nome1.nome, idade1.idade, preco1.preco);
        System.out.println("\n");
        exibicao.mostrarResultado(nome2.nome, idade2.idade, preco2.preco);
        System.out.println("\n");
        exibicao.mostrarResultado(nome3.nome, idade3.idade, preco3.preco);
        System.out.println("\n");
        
        ler.close();

    }
}
