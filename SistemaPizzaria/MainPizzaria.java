package SistemaPizzaria;
import java.util.Scanner;

public class MainPizzaria{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o seu nome: \n");
        String nome = ler.nextLine();

        System.out.println("Digite a quantidade de pizzas:  ");
        int quantidade = ler.nextInt();

        System.out.println("Digite o preço da pizza: ");
        double preco = ler.nextDouble();

        ClassePizza pizza = new ClassePizza(); // Crie uma instância de ClassePizza com um nome mais significativo
        pizza.Construtor(nome, quantidade, preco);

        System.out.println(pizza.toString()); // Chama o método toString() e imprime o resultado

        ler.close();
    }
}