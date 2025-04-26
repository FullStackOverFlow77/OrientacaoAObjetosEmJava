package InserirCarros;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Organizacao marca1 , marca2 , marca3 , cor1 , cor2 , cor3 , preco1 , preco2 , preco3 ;
        marca1 = new Organizacao(); 
        marca2 = new Organizacao(); 
        marca3 = new Organizacao(); 
 
        cor1 = new Organizacao();
        cor2 = new Organizacao();
        cor3 = new Organizacao();

        preco1 = new Organizacao(); 
        preco2 = new Organizacao(); 
        preco3 = new Organizacao(); 

        System.out.println("Digite a Marca do Carro: ");
        
        marca1.marca = ler.nextLine();
        marca2.marca = ler.nextLine();
        marca3.marca = ler.nextLine();

        System.out.println("Digite a Cor do Carro");

        cor1.cor = ler.next();
        cor2.cor = ler.next();
        cor3.cor = ler.next();

        System.out.println("Digite o preço do carro: ");

        preco1.preco = ler.nextDouble();
        preco2.preco = ler.nextDouble();
        preco3.preco = ler.nextDouble();

        ExibicaoDados exibir = new ExibicaoDados();

        exibir.mostrarResultado(marca1.marca , cor1.cor , preco1.preco);
        exibir.mostrarResultado(marca2.marca , cor2.cor , preco2.preco);
        exibir.mostrarResultado(marca3.marca , cor3.cor , preco3.preco);



        ler.close();
    }
    
}

