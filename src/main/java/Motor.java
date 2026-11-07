public class Motor extends Kendaraan implements BisaDiservis {
    private int kapasitasMesin;

    public Motor(String id, String merk, String nomorPolisi, String pemilik, int kapasitasMesin) {
        super(id, merk, nomorPolisi, pemilik);
        this.kapasitasMesin = kapasitasMesin;
    }

    // Overloading constructor
    public Motor(String merk, String nomorPolisi, String pemilik, int kapasitasMesin) {
        super(merk, nomorPolisi, pemilik);
        this.kapasitasMesin = kapasitasMesin;
    }

    public int getKapasitasMesin() { return kapasitasMesin; }
    public void setKapasitasMesin(int kapasitasMesin) { this.kapasitasMesin = kapasitasMesin; }

    @Override
    public String getJenisKendaraan() { return "Motor"; }

    @Override
    public double hitungBiayaDasar(int tingkatServis) {
        if (tingkatServis == 1) {
            setPerluServis(false);
            return 75000;
        } else if (tingkatServis == 2) {
            setPerluServis(false);
            return 150000;
        } else {
            setPerluServis(true);
            return 0;
        }
    }

    @Override
    public void lakukanServis() {
        System.out.println("Servis motor sedang diproses.");
        System.out.println("Kapasitas Mesin: " + kapasitasMesin + " cc");
    }
}
