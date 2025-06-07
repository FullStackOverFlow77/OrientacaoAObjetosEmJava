import java.util.Scanner;

public class TesteAltura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos dados você deseja digitar?: ");
        int n = sc.nextInt();
        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for(int i=0;i<n;i++){
            System.out.println("Usuário " + (i+1) + "ª: ");
            System.out.println("Digite o seu nome: ");
            nome[i] = sc.next();
            System.out.println("Digite a sua idade: ");
            idade[i] = sc.nextInt();
            System.out.println("Digite a sua altura: ");
            altura[i] = sc.nextDouble();

        }

        System.out.println("\nPessoas cadastradas\n");

        for(int i=0;i<n;i++){
            System.out.printf("Nome: %s | Idade: %d | Altura: %.2f%n " , nome[i] , idade[i] , altura[i] );
        }

        System.out.println("Pessoas maiores de 18 anos \n");

        for(int i=0;i<n;i++){
            if(idade[i] >= 18){
                System.out.println("\nApenas " + nome[i] + " Podem ir frequentar um barzinho\n ");
            }
            else{
                System.out.println("O resto não pode pois infelizmen te são 🤦‍♂️ bebe: "+ nome[i]);
            }
        }




        sc.close();
    }
}
