package MembrosEstaticos;
import java.util.Locale;
import java.util.Scanner;

public class RadiusSemEstatico {


    public static void main(String[] args) {
        
        CalculatorSemEstatico calc = new CalculatorSemEstatico();
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter Radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);

        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n" , c);
        System.out.printf("Volume: %.2f%n" , v);
        System.out.printf("PI Value: %.2f%n" , calc.PI);

        sc.close();
    }

    
    
}
