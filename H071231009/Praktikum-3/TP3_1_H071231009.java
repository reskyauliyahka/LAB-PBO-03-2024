package PERTEMUAN3;

class Tanah {
    private int kelembaban;

    public Tanah(int kelembaban) {
        this.kelembaban = kelembaban;
    }
    public int getKelembaban() {
        return kelembaban;
    }
    public void setKelembaban (int kelembaban) {
        this.kelembaban = kelembaban;
    }

    public void updateKelembaban (int perubahan) {
        kelembaban += perubahan;
        if (kelembaban < 0) {
            kelembaban = 0;
        } else if (kelembaban > 100) {
            kelembaban = 100;
        }
    }
}
class Tumbuhan {
    private String nama;
    private int umur;
    private Tanah tanah;

    public Tumbuhan (String nama, int umur, Tanah tanah) {
        this.nama = nama;
        this.umur = umur;
        this.tanah = tanah; 
    }
    public Tumbuhan (String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        this.tanah = new Tanah(50);
    }
    public void tumbuh() {
        umur++;
        System.out.println(nama + " bertambah umur menjadi " + umur + " tahun");
    }
    public void serapAir() {
        if (tanah.getKelembaban() > 50) {
            System.out.println(nama + "sedang menyerap air dari tanah");
        } else {
            System.out.println(nama + "tidak dapat menyerap air dari tanah");
        }
    }
    public void gantiTanah(Tanah tanahBaru) {
        tanah = tanahBaru;
        System.out.println(nama + " pindah ke tanah baru");
    } 
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }

}

public class TP3_1_H071231009 {
    public static void main(String[] args) {
        Tanah tanah1 = new Tanah(70);
        Tumbuhan tumbuhan1 = new Tumbuhan("Anggrek", 2, tanah1);

        System.out.println("=====Informasi Tumbuhan====");
        System.out.println("Nama: " + tumbuhan1.getNama());
        System.out.println("Umur: " + tumbuhan1.getUmur() + " tahun");

        tumbuhan1.tumbuh();
        tumbuhan1.serapAir();

        tanah1.updateKelembaban(-40);
        System.out.println("\n====Perubahan kelembaban tumbuhan====");
        System.out.println("Kelembaban tanah setelah dikurangi: " + tanah1.getKelembaban());
        tumbuhan1.serapAir();
    }
}