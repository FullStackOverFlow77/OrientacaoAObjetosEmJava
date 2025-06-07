package Vetores;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vect = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Números negativos: \n");

        for(int i =0;i<n;i++){
            if(vect[i] < 0){
                System.out.print(vect[i]);
            }
            else{
                System.out.printf("Números positivos: %s" , vect[i]);
            }

        

        
            sc.close();
        }
        }
    }


