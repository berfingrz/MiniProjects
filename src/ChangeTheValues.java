import java.util.Scanner;

public class ChangeTheValues {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int first, second;

        System.out.println("First value:");
        first = scanner.nextInt();

        System.out.println("Second value:");
        second = scanner.nextInt();

        System.out.println("Before Changes");
        System.out.println("First value: "+ first + " Second Value: " +second);

        int temp = first;
        first = second;
        second = temp;

        System.out.println("After Changes");
        System.out.println("First value: "+ first + " Second Value: " +second);
    }
}
