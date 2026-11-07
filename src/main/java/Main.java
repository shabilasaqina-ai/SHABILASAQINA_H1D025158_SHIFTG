import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("       SISTEM MANAJEMEN BENGKEL");
        System.out.println("              TEMA OTOMOTIF");
        System.out.println("========================================");

        System.out.print("Nama pelanggan       : ");
        String nama = input.nextLine();
        System.out.print("Nomor telepon        : ");
        String telepon = input.nextLine();
        Pelanggan pelanggan = new Pelanggan(nama, telepon);

        System.out.println("\nPilih kendaraan:");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();

        Kendaraan kendaraan;
        if (pilihan == 1) {
            System.out.print("Merk mobil           : ");
            String merk = input.nextLine();
            System.out.print("Nomor polisi         : ");
            String nomor = input.nextLine();
            System.out.print("Jumlah pintu         : ");
            int pintu = input.nextInt();
            kendaraan = new Mobil(merk, nomor, nama, pintu);
        } else if (pilihan == 2) {
            System.out.print("Merk motor           : ");
            String merk = input.nextLine();
            System.out.print("Nomor polisi         : ");
            String nomor = input.nextLine();
            System.out.print("Kapasitas mesin (cc) : ");
            int cc = input.nextInt();
            kendaraan = new Motor(merk, nomor, nama, cc);
        } else {
            System.out.println("Pilihan kendaraan tidak tersedia.");
            input.close();
            return;
        }

        System.out.println("\nPilih jenis servis:");
        System.out.println("1. Servis ringan");
        System.out.println("2. Servis besar");
        System.out.print("Pilihan: ");
        int tingkatServis = input.nextInt();

        System.out.println("\n--- Proses Servis ---");
        if (kendaraan instanceof BisaDiservis) {
            BisaDiservis layanan = (BisaDiservis) kendaraan;
            layanan.lakukanServis();
        }

        TransaksiServis transaksi = new TransaksiServis(pelanggan, kendaraan, tingkatServis);
        transaksi.tampilkanStruk();
        System.out.println("Status setelah servis: " + (kendaraan.isPerluServis() ? "Masih perlu servis" : "Servis selesai"));
        input.close();
    }
}
