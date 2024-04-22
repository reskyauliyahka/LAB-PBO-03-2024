package No_2;

class HandPhone {
    private String merk;
    private String model;
    private double harga;
    private int tahunProduksi;
    private String deskripsi;

    public HandPhone () {};
    public HandPhone (String merk, String model, double harga, int tahunProduksi, String deskripsi) {
        this.merk = merk;
        this.model = model;
        this.harga = harga;
        this.tahunProduksi = tahunProduksi;
        this.deskripsi = deskripsi;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getMerk() {
        return merk;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public double getHarga() {
        return harga;
    } 
    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
    public int getTahunProduksi(){
        return tahunProduksi;
    }
    public void setDeskripsi (String deskripsi) {
        this.deskripsi = deskripsi;
    }
    public String getDeskripsi () {
        return deskripsi;
    }
    public void displayInfo() {
        System.out.println("Merek: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Harga: " + harga);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Deskripsi: " + deskripsi);

    }

}

public class Main {
    public static void main(String[] args) {
        HandPhone handPhone = new HandPhone();
        handPhone.setMerk ("Oppo");
        handPhone.setModel("abc");
        handPhone.setHarga(1000000);
        handPhone.setTahunProduksi(1966);
        handPhone.setDeskripsi("handphone bagus");
        handPhone.displayInfo();

        HandPhone handPhone2 = new HandPhone("Samsung", "dcf", 2000000, 1967, "hanphone cantik");
        System.out.println(handPhone2.getMerk());
        System.out.println(handPhone2.getModel());
        System.out.println(handPhone2.getHarga());
        System.out.println(handPhone2.getTahunProduksi());
        System.out.println(handPhone2.getDeskripsi());

        SelfUtils.displaySelfData();



    }
}
class SelfUtils {
    public static void displaySelfData () {
        System.out.println("Nama: Resky Auliyah Kartini Askin ");
        System.out.println("Nim : H071231009");
    }
}
