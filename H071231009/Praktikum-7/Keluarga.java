import java.util.Scanner;

public class Keluarga extends Karyawan {
    String status;

    void statusKeluarga() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Status(Menikah/Belum Menikah): ");
            status = scan.nextLine().toUpperCase();
            if (status.equals("MENIKAH") || status.equals("BELUM MENIKAH")) {
                break;
            } else {
                System.out.println("Tingkat pendidikan yang dimasukkan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
