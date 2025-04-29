package InserirProdutos;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalProdutos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produtos produtos = new Produtos();

        System.out.println("Enter Products Data: ");
        
        System.out.println("Name: ");
        produtos.name = sc.nextLine();

        System.out.println("Price: ");
        produtos.price = sc.nextDouble();

        System.out.println("Quantity: ");
        produtos.quantity = sc.nextInt();
        
        System.out.println("Product data: " + produtos.toString());

        System.out.println();
        System.out.println("Enter the number for add Stock: " );
        int quantity = sc.nextInt();
        produtos.addProducts(quantity);

        System.out.println();
        System.out.println("Update Data: " + produtos);

        System.out.println();
        System.out.println("Enther the number for remove Stock: " );
        quantity = sc.nextInt();
        produtos.removeProducts(quantity);

        System.out.println();
        System.out.println("Final: " + produtos);

        
        
        sc.close();
    }
}
