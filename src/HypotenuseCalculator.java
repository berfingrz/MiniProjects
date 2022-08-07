import java.util.Scanner;

public class HypotenuseCalculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a,b;

        System.out.println("First edge:");
        a = scanner.nextInt();

        System.out.println("Second edge");
        b = scanner.nextInt();

        double h = Math.sqrt(a * a + b * b);
        System.out.println("Hypotenuse: "+ h);
    }
}
