import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String brand;
    int seriesNumber;
    double price;
    
    public Product(String brand, int seriesNumber, double price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }
    
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Serial Number: " + seriesNumber);
        System.out.println("Price: $" + price);
    }
}

class Smartphone extends Product {
    double screenSize;
    int storageCapacity;
    
    public Smartphone(String brand, int seriesNumber, double price, double screenSize, int storageCapacity) {
        super(brand, seriesNumber, price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }
    
    void displayInfo() {
        super.displayInfo();
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Storage Capacity: " + storageCapacity + "GB");
    }
}

class Camera extends Product {
    int resolution;
    String lensType;
    
    public Camera(String brand, int seriesNumber, double price, int resolution, String lensType) {
        super(brand, seriesNumber, price);
        this.resolution = resolution;
        this.lensType = lensType;
    }
    
    void displayInfo() {
        super.displayInfo();
        System.out.println("Resolution: " + resolution + "MP");
        System.out.println("Lens Type: " + lensType);
    }
}

class Laptop extends Product {
    int ramSize;
    String processorType;
    
    public Laptop(String brand, int seriesNumber, double price, int ramSize, String processorType) {
        super(brand, seriesNumber, price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Ram Size: " + ramSize + "GB");
        System.out.println("Processor Type: " + processorType);
    }
}

public class TP5_2_H071231009 {
    static ArrayList<Product> product = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int pilihMenu;
        do {
            System.out.println("Menu:");
            System.out.print("1. Tambah Produk \n2. Tampilkan Semua Produk \n3. Beli Produk \n4. Keluar");
            System.out.println();
            System.out.print("\n>>> Pilih menu (1-4): ");
            pilihMenu = scan.nextInt();
            scan.nextLine();

            switch (pilihMenu) {
                case 1:
                    tambahProduk();       
                    break;
                case 2:
                    if (product.isEmpty()) {
                        System.out.println("Produk masih kosong, silahkan tambah produk terlebih dahulu");
                    } else {
                        tampilkanSemuaProduk();
                    }
                    break;
                case 3:
                    beliProduk();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                    System.exit(0);
                    break;     
                default:
                    System.out.println("Inputan tidak sesuai.");
            } 

        } while (pilihMenu != 4);
    }
    
    static void tambahProduk() {
        System.out.print("Masukkan Nama Produk: ");
        String brand = scan.nextLine();
        System.out.print("Masukkan Nomor Seri: ");
        int seriesNumber = scan.nextInt();
        System.out.print("Masukkan Harga: ");
        double price = scan.nextDouble();

        System.out.println("Pilih tipe produk: ");
        System.out.print("1. Smarthphone \n2. Laptop \n3. Camera");

        System.out.print("\nPilih tipe produk (1-3): ");
        int tipeProduk = scan.nextInt();

        switch (tipeProduk) {
            case 1:
                System.out.print("Masukkan ukuran layar: ");
                double screenSize = scan.nextDouble();
                System.out.print("Masukkan kapasitas penyimpan (GB): ");
                int storageCapacity = scan.nextInt();
                product.add(new Smartphone(brand, seriesNumber, price, screenSize, storageCapacity));
                break;  
            case 2: 
                System.out.print("Masukkan ukuran ram: ");
                int ramSize = scan.nextInt();
                scan.nextLine();
                System.out.print("Masukkan tipe prrocessor: ");
                String processorType = scan.nextLine();
                product.add(new Laptop(brand, seriesNumber, price, ramSize, processorType));
                break;
            case 3:
                System.out.print("Masukkan resolusi: ");
                int resolution = scan.nextInt();
                scan.nextLine();
                System.out.print("Masukkan tipe lensa: ");
                String lensType = scan.nextLine();
                product.add(new Camera(brand, seriesNumber, price, resolution, lensType));
                break;
            default:
                System.out.print("Inputan tidak sesuai");
        }
        System.out.println("Produk berhasil ditambahkan\n");
    }
    
    static void tampilkanSemuaProduk() {
        System.out.println("Daftar Produk:");
        for (Product product : product) {
            product.displayInfo();
            System.out.println();
        }
    }
    
    static void beliProduk() {
        System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
        int seriesNumber = scan.nextInt();
        boolean found = false;
        
        for (int i = 0; i < product.size(); i++) {
            if (product.get(i).seriesNumber == seriesNumber) {
                System.out.println("Anda telah membeli produk:");
                product.get(i).displayInfo();
                System.out.println();
                found = true;
                product.remove(i);
                break;
            }
        }
        if (!found) {
            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan");
        }
    }
}