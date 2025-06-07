package Vetores;

import java.util.Scanner;

public class Atividade2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contagem_de_quantidade = sc.nextInt();
        ClasseAtividade2[] vect = new ClasseAtividade2[contagem_de_quantidade];

        for(int i=0; i<vect.length ; i++){
            String nome = sc.next();
            double preco = sc.nextDouble();
            vect[i] = new ClasseAtividade2(nome,preco);
        }

        double soma = 0.0;

        for(int i=0; i<vect.length ; i++){
            soma+= vect[i].getPreco();
            
        }

        double avg = soma /vect.length ;
        System.out.printf("AVERAGE: %.2f",avg);
        
        System.out.println("\nProdutos: \n");

        // For para imprimir o nome junto com o preço 

        for(int i=0; i<vect.length ; i++){
            System.out.printf("Nome: %s | Preço: %.2f %n" ,vect[i].getNome(),vect[i].getPreco());
        }

        
        sc.close();
    }
}