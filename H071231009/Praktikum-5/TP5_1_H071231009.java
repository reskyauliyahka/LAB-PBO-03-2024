import java.util.Scanner;

class BangunRuang {
    double rusuk, radius, sisi, panjang, lebar, tinggi;
}
class BangunDatar {
    double sisi, panjang, lebar, radius, a, b, c, d, tinggi;
}

class Kubus extends BangunRuang {
    public Kubus(double rusuk) {
        this.rusuk = rusuk;
    }
    double hitungLuas() {
        return 6 * rusuk * rusuk;
    }
    double hitungVolume() {
        return rusuk * rusuk * rusuk;
    }   
}
class Balok extends BangunRuang {
    public Balok(double panjang, double tinggi, double lebar) {
        this.panjang = panjang;
        this.tinggi = tinggi;
        this.lebar = lebar;
    }
    double  hitungLuas() {
        return (2 * panjang * lebar) + (2 * panjang * tinggi) + (2 * lebar * tinggi);
    }
    double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}
class Bola extends BangunRuang {
    public Bola(double radius) {
        this.radius = radius;
    }
    double hitungLuas() {
        return 4 * Math.PI * radius * radius;
    }
    double hitungVolume() {
        return (4.0/3.0) * Math.PI * radius * radius * radius;
    }
}
class Tabung extends BangunRuang {
    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }
    double hitungLuas() {
        return 2 * Math.PI * radius * (radius + tinggi);
    }
    double hitungVolume() {
        return Math.PI * radius * radius * tinggi;
    }
}
class Persegi extends BangunDatar {
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    double hitungKeliling() {
        return 4 * sisi;
    }
    double hitungLuas() {
        return sisi * sisi;
    }
}
class PersegiPanjang extends BangunDatar {
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    double hitungLuas() {
        return panjang * lebar;
    }
}
class Lingkaran extends BangunDatar {
    public Lingkaran(double radius) {
        this.radius = radius;
    }
    double hitungKeliling() {
        return 2 * Math.PI * radius;
    }
    double hitungLuas() {
        return Math.PI * radius * radius;
    }
}
class Trapesium extends BangunDatar {
    public Trapesium(double a, double b, double c, double d, double tinggi) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.tinggi = tinggi;
    }
    double hitungKeliling() {
        return a + b + c + d;
    }
    double hitungLuas() {
        return ((a + b) / 2) * tinggi;
    }
}

public class TP5_1_H071231009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("==== BANGUN RUANG ====");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");
        System.out.println("==== BANGUN DATAR ====");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. TRAPESIUM");

        System.out.println("-----------------------------------");
        System.out.print("Pilihan: ");
        int pilihan = scan.nextInt();
        System.out.println("-----------------------------------");

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan rusuk kubus: ");
                double rusuk = scan.nextDouble();
                Kubus kubus = new Kubus(rusuk);
                System.out.println("Luas Kubus: " + kubus.hitungLuas());
                System.out.println("Volume Kubus: " + kubus.hitungVolume());
                System.out.println("-----------------------------------");
                break;
            case 2:
                System.out.print("Masukkan Panjang Balok: ");
                double p = scan.nextDouble();
                System.out.print("Masukkan lebar Balok: ");
                double l = scan.nextDouble();
                System.out.print("Masukkan tinggi Balok: ");
                double t = scan.nextDouble();
                Balok balok = new Balok(p, t, l);
                System.out.println("Luas Balok: " + balok.hitungLuas());
                System.out.println("Volume Balok: " + balok.hitungVolume());
                System.out.println("-----------------------------------");
                break;
            case 3:
                System.out.print("Masukkan jari-jari Bola: ");
                double radius = scan.nextDouble();
                Bola bola = new Bola(radius);
                System.out.println("Luas Bola: " + bola.hitungLuas());
                System.out.println("Volume Bola: " + bola.hitungVolume());
                System.out.println("-----------------------------------");
                break;
            case 4:
                System.out.print("Masukkan radius Tabung: ");
                double radiusTabung = scan.nextDouble();
                System.out.print("Masukkan tinggi Tabung: ");
                double tinggi = scan.nextDouble();
                Tabung tabung = new Tabung(radiusTabung, tinggi);
                System.out.println("Luas Tabung: " + tabung.hitungLuas());
                System.out.println("Volume Tabung: " + tabung.hitungVolume());
                System.out.println("-----------------------------------");
                break;
            case 5:
                System.out.print("Masukkan sisi Persegi: ");
                double sisi = scan.nextDouble();
                Persegi persegi = new Persegi(sisi);
                System.out.println("Luas Persegi: " + persegi.hitungLuas());
                System.out.println("Keliling Persegi: " + persegi.hitungKeliling());
                System.out.println("-----------------------------------");
                break;
            case 6: 
                System.out.print("Masukkan panjang Persegi Panjang: ");
                double panjang = scan.nextDouble();
                System.out.print("Masukkan lebar Persegi Panjang: ");
                double lebar = scan.nextDouble();
                PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
                System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
                System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());
                System.out.println("-----------------------------------");
                break;
            case 7:
                System.out.print("Masukkan jari-jari Lingkaran: ");
                double r = scan.nextDouble();
                Lingkaran lingkaran = new Lingkaran(r);
                System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
                System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());
                System.out.println("-----------------------------------");
                break;
            case 8:
                System.out.print("Masukkan sisi 1 trapesium: ");
                double a = scan.nextDouble();
                System.out.print("Masukkan sisi 2 trapesium: ");
                double b = scan.nextDouble();
                System.out.print("Masukkan sisi 3 trapesium: ");
                double c = scan.nextDouble();
                System.out.print("Masukkan sisi 4 trapesium: ");
                double d = scan.nextDouble();
                System.out.print("Masukkan tinggi trapesium: ");
                double tinggiTrapesium = scan.nextDouble();
                Trapesium trapesium = new Trapesium(a, b, c, d, tinggiTrapesium);
                System.out.println("Luas Trapeseium: " + trapesium.hitungLuas());
                System.out.println("Keliling Trapesium: " + trapesium.hitungKeliling());
                System.out.println("-----------------------------------");
                break;

            default:
                scan.close();
                break;
        }
    }
}