import java.util.Scanner;

public class GasolineCalculator {
    public static void main(String[] args){

        /* Bir aracın kilometrede ne kadar yaktığını ve kaç kilometre yol yaptığı bilgileri alınır.
           Ve sürücünün toplam ne kadar ödemesi gerektiği hesaplanır.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Aracınız kilometrede kac kurus yakıyor? (Örn: 0,32): ");
        double kurus = scanner.nextDouble();

        System.out.println("Aracınızla kaç km gittiniz? :");
        int km = scanner.nextInt();

        System.out.println("Toplam ödenmesi gereken tutar: " + (kurus * km) + "TL");
    }
}
