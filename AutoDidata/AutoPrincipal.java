package AutoDidata;

import java.util.Scanner;

public class AutoPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to System of remember");

        System.out.println("Please digited your code: ");
        int code = sc.nextInt();

        System.out.println("Digited your name now: ");
        String name = sc.next();

        System.out.println("And finally enter your salary: ");
        double salary = sc.nextDouble();

        AutoClasse toString = new AutoClasse(code, name, salary); 

        System.out.println(toString);

        
        
        


        sc.close();
    }
}
