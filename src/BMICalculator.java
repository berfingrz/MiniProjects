import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // BMI = KG / M * M

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your kilogram:");
        int kilo = scanner.nextInt();

        System.out.println("Enter your metres:");
        double boy = scanner.nextDouble();

        double bmi = kilo / (boy * boy);

        System.out.println("BMI: "+ bmi);
    }
}