package Vetores;

import java.util.Scanner;

public class Atividade4 {
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

        for(int i =0 ; i<n ;i++){
            System.out.println("Dados da "+(i+1) +" ª pessoa\n"+ "Nome: "+ nome[i] + " | Idade: " + idade[i] +" | Altura: " + altura[i] + "\n");
        }



        sc.close();
    }
}
