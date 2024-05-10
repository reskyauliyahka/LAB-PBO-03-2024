import java.util.Scanner;

public class InputBukanAngka {
    public static int inputInteger(Scanner scan, String kata) {
        while (true) {
            System.out.print(kata);
            try {
                int angka = Integer.parseInt(scan.nextLine());
                return angka;
            } catch (NumberFormatException e) {
                System.out.println("Inputan harus berupa angka. Silahkan coba lagi.");
            }
        }
    }

    public static double inputDouble(Scanner scan, String kata) {
        while (true) {
            System.out.print(kata);
            try {
                double angka = Double.parseDouble(scan.nextLine());
                return angka;
            } catch (NumberFormatException e) {
                System.out.println("Inputan harus berupa angka. Silahkan coba lagi.");
            }
        }
    }
}
