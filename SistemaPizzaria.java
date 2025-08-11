import java.util.Scanner;

public class SistemaPizzaria{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos dados
        System.out.print("Digite o salário atual do funcionário: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o tempo de serviço (anos): ");
        int anos = scanner.nextInt();

        System.out.print("Digite a nota de avaliação de desempenho (1 a 10): ");
        int nota = scanner.nextInt();

        double bonus = 0;

        // Cálculo do bônus conforme regras
        if (nota >= 9 && nota <= 10) {  // Excelente
            if (anos > 5) {
                bonus = salario * 0.20;
            } else {
                bonus = salario * 0.15;
            }
        } else if (nota >= 7 && nota <= 8) { // Bom
            if (anos > 5) {
                bonus = salario * 0.12;
            } else {
                bonus = salario * 0.10;
            }
        } else if (nota >= 5 && nota <= 6) { // Regular
            bonus = salario * 0.05;
        } else { // Abaixo do esperado
            bonus = 0;
        }

        double salarioFinal = salario + bonus;

        // Exibir resultados
        System.out.printf("Bônus: R$ %.2f%n", bonus);
        System.out.printf("Salário final: R$ %.2f%n", salarioFinal);

        scanner.close();
    }
}
