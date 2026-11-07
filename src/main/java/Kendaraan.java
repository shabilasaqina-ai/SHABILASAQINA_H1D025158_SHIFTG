public abstract class Kendaraan {
    public static final double BIAYA_ADMIN = 5000.0;

    private final String idKendaraan;
    private String merk;
    private String nomorPolisi;
    private String namaPemilik;
    private boolean perluServis;

    public Kendaraan(String idKendaraan, String merk, String nomorPolisi, String namaPemilik) {
        this.idKendaraan = idKendaraan;
        this.merk = merk;
        this.nomorPolisi = nomorPolisi;
        this.namaPemilik = namaPemilik;
        this.perluServis = true;
    }

    // Overloading constructor
    public Kendaraan(String merk, String nomorPolisi, String namaPemilik) {
        this("KND-" + nomorPolisi.replaceAll("\\s+", ""), merk, nomorPolisi, namaPemilik);
    }

    public String getIdKendaraan() { return idKendaraan; }
    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }
    public String getNomorPolisi() { return nomorPolisi; }
    public void setNomorPolisi(String nomorPolisi) { this.nomorPolisi = nomorPolisi; }
    public String getNamaPemilik() { return namaPemilik; }
    public void setNamaPemilik(String namaPemilik) { this.namaPemilik = namaPemilik; }
    public boolean isPerluServis() { return perluServis; }
    protected void setPerluServis(boolean perluServis) { this.perluServis = perluServis; }

    public void tampilkanInfo() {
        System.out.println("ID Kendaraan : " + idKendaraan);
        System.out.println("Jenis        : " + getJenisKendaraan());
        System.out.println("Merk         : " + merk);
        System.out.println("Nomor Polisi : " + nomorPolisi);
        System.out.println("Nama Pemilik : " + namaPemilik);
        System.out.println("Perlu Servis : " + (perluServis ? "Ya" : "Tidak"));
    }

    public double hitungTotal(int tingkatServis) {
        double biaya = hitungBiayaDasar(tingkatServis);
        return biaya == 0 ? 0 : biaya + BIAYA_ADMIN;
    }

    public abstract String getJenisKendaraan();
    public abstract double hitungBiayaDasar(int tingkatServis);
}
