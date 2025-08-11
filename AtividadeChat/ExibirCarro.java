package AtividadeChat;

import java.util.Scanner;

public class ExibirCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro carro1 = new Carro();
        System.out.println("Digite a marca do carro:");
        carro1.setMarca(sc.nextLine());

        System.out.println("Digite o modelo do carro:");
        carro1.setModelo(sc.nextLine());

        System.out.println("Digite o ano do carro:");
        carro1.setAno(sc.nextInt());

        LigarCarro ligar = new LigarCarro();
        String resultado = ligar.ligarCarro(carro1);

        System.out.println("\n" + resultado);

        sc.close();
    }
}
