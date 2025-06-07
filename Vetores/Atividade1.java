package Vetores;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        int n = ler.nextInt();

        double[] vect = new double[n];

        for(int i=0; i<n ; i++){
            vect[i] = ler.nextDouble();

        }

        double soma = 0.0;

        for(int i=0; i<n ; i++){
            soma+= vect[i];
        }

        double average = soma / n;

        System.out.printf("AVERAGE: %.2f",average);


       
       
        ler.close();

    }
}