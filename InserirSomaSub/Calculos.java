package InserirSomaSub;

import java.util.Scanner;



public class Calculos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        
        
        System.out.println("Digite o seu número: ");
        int numero = sc.nextInt();
        
        

        System.out.println(("Digite Mais um número para ser acrescentado: "));
        int numeroSoma = sc.nextInt();

        System.out.println("Digite um número para remover um pouco da quantidade: ");
        int numeroSubtracao = sc.nextInt();
        
        MainSub calc = new MainSub();

        calc.exibirResultados(numero, numeroSoma, numeroSubtracao);



        System.out.printf("Resultado" , calc);
        
        sc.close();



    }
    
}
