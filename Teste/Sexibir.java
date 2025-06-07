

import java.util.Scanner;
public class Sexibir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] vect = new int[n];
        
        for(int i=0; i<n ; i++){
            System.out.println("Digite algo: ");
            vect[i] = sc.nextInt();
        }
        
        sc.close();
    }
}
