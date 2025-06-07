package AtividadeArray;

import java.util.Scanner;

public class AtividadeArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        double[] vect = new double[n];

        for(int i = 0 ; i < n ; i++){
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0; 

        for(int i=0 ; i < n ; i++){
            sum +=vect[i];
        }

        double avg = sum / n;

        System.out.printf("Resultado : %.2f " , avg , "/n");

        sc.close();
    }
}
