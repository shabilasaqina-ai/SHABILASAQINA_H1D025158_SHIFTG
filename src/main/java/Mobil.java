public class Mobil extends Kendaraan implements BisaDiservis, BisaDiskon {
    private int jumlahPintu;

    public Mobil(String id, String merk, String nomorPolisi, String pemilik, int jumlahPintu) {
        super(id, merk, nomorPolisi, pemilik);
        this.jumlahPintu = jumlahPintu;
    }

    public Mobil(String merk, String nomorPolisi, String pemilik, int jumlahPintu) {
        super(merk, nomorPolisi, pemilik);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() { return jumlahPintu; }
    public void setJumlahPintu(int jumlahPintu) { this.jumlahPintu = jumlahPintu; }

    @Override
    public String getJenisKendaraan() { return "Mobil"; }

    @Override
    public double hitungBiayaDasar(int tingkatServis) {
        if (tingkatServis == 1) {
            setPerluServis(false);
            return 150000;
        } else if (tingkatServis == 2) {
            setPerluServis(false);
            return 300000;
        } else {
            setPerluServis(true);
            return 0;
        }
    }

    @Override
    public void lakukanServis() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu : " + jumlahPintu);
        System.out.println("Servis mobil sedang diproses.");
    }

    @Override
    public double hitungDiskon(double total) { return total * 0.10; }
}
