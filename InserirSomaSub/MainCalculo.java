package InserirSomaSub;

import java.util.Scanner;

public class MainCalculo {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

    ObrigacaoInstancia calc = new ObrigacaoInstancia();

    System.out.println("Digite o seu número 1 e 2: ");
    double a = sc.nextDouble();
    double b = sc.nextDouble();

    System.out.println("A soma de ambos números ficaram de: ");
    double soma = ObrigacaoInstancia.adicao(a,b);
    System.out.println(soma);

    System.out.println("A subtração de ambos números foram de: ");
    double subtracao = ObrigacaoInstancia.remocao(a,b);
    System.out.println(subtracao);
    sc.close();

    }
   
}
