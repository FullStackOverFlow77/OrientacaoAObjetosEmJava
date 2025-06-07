import java.util.Scanner;

import Atividade2Etapas.ClasseAtividade;



public class MainAtividade{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ClasseAtividade account;

        System.out.println("Enter Account number: ");
        int number = sc.nextInt();

        System.out.println("Enter Account Holder: ");
        System.out.println();
        String holder = sc.nextLine();

        System.out.println("Is there an initial deposit value(y/n): ");
        char response = sc.next().charAt(0);
        if(response == 'y'){
            System.out.println("Enter initial deposit: ");
            double inicialDeposit = sc.nextDouble();
            account = new ClasseAtividade(number, holder, inicialDeposit);
        }
        else{
            account = new ClasseAtividade(number, holder); 
        }


        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);
        
        
        System.out.println();
        System.out.println("Enter deposit value: ");
        double depositValue = sc.nextDouble();



        




        sc.close();
    }
}
