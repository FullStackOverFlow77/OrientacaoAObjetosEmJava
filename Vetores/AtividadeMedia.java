package Vetores;

import java.util.Scanner;

public class AtividadeMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantas pessoas deseja digitar?: ");


        int n = sc.nextInt();
        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for(int i=0;i<n ;i++){
            System.out.println("Digite o dados da " +(i+1) +"ª pessoa:\n"  );
            System.out.println("Digite o nome: ");
            nome[i]= sc.next();
            System.out.println("Digite a idade: ");
            idade[i]=sc.nextInt();
            System.out.println("Digite a altura: ");
            altura[i] = sc.nextDouble();
        }


        double soma = 0.0;

        for(int i =0 ; i<n ; i++){
            soma+=altura[i];
        }
        double mediaAltura =  soma/n;

        System.out.printf("Média das alturas: " , mediaAltura);


        int cont = 0;

        for(int i = 0 ; i<n ; i++){
            if(idade[i] < 16){
                cont = cont + 1; // Conta quantas pessoas que tem menos de 16 anos
            }

        }
            double percent = cont * 100.0 /n ; // Achando a porcentagem ;  colocando a contagem de pessoas menores que 16  vez 100 dividido pela quantidade  
            System.out.printf("Percentual de altura: %.1f%" , percent);

        
        for(int i = 0 ; i<n ; i++){
            if(idade[i] < 16){
                System.out.println("\n"+nome[i]); // No caso aqui estou imprimindo os nomes com idade menor que 16 pois o nome[i] pertence a idade por que estão no mesmo for 
            }

        }



        
        sc.close();
    }
}
