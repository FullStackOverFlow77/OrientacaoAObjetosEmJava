package Vetores;

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a quantidade de alunos: ");
        int n = sc.nextInt();
        String[] vect = new String[n];

        for(int i =0;i<n;i++){
            System.out.println("Digite o aluno " + (i+1) + ": ");
            vect[i] = sc.next();
        }

        System.out.println("Alunos Salvos: ");

        for(int i =0;i<n;i++){
            System.out.println(vect[i]);
            
        }
        sc.close();
    }
}
