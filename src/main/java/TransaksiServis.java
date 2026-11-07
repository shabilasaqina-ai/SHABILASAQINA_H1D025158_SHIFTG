public class TransaksiServis {
    private Pelanggan pelanggan;
    private Kendaraan kendaraan;
    private int tingkatServis;
    private double totalBayar;
    private double diskon;

    public TransaksiServis(Pelanggan pelanggan, Kendaraan kendaraan, int tingkatServis) {
        this.pelanggan = pelanggan;
        this.kendaraan = kendaraan;
        this.tingkatServis = tingkatServis;
        this.totalBayar = kendaraan.hitungTotal(tingkatServis);
        this.diskon = 0;
        if (kendaraan instanceof BisaDiskon && totalBayar > 0) {
            BisaDiskon pemberiDiskon = (BisaDiskon) kendaraan;
            this.diskon = pemberiDiskon.hitungDiskon(totalBayar);
        }
    }

    public Pelanggan getPelanggan() { return pelanggan; }
    public Kendaraan getKendaraan() { return kendaraan; }
    public int getTingkatServis() { return tingkatServis; }
    public double getTotalBayar() { return totalBayar - diskon; }

    public void tampilkanStruk() {
        System.out.println("\n============= STRUK SERVIS =============");
        System.out.println("Pelanggan    : " + pelanggan.getNama());
        System.out.println("No. Telepon  : " + pelanggan.getNomorTelepon());
        System.out.println("Kendaraan    : " + kendaraan.getJenisKendaraan());
        System.out.println("Merk         : " + kendaraan.getMerk());
        System.out.println("No. Polisi   : " + kendaraan.getNomorPolisi());
        System.out.println("Jenis Servis : " + (tingkatServis == 1 ? "Ringan" : tingkatServis == 2 ? "Besar" : "Tidak valid"));
        System.out.printf("Biaya + Admin: Rp%.0f%n", totalBayar);
        System.out.printf("Diskon       : Rp%.0f%n", diskon);
        System.out.printf("Total Bayar  : Rp%.0f%n", getTotalBayar());
        System.out.println("========================================");
    }
}
