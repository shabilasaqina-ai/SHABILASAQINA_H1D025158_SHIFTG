# Sistem Manajemen Bengkel Otomotif

Project Java untuk Responsi Akhir PBO. Tema: Otomotif (digit terakhir NIM 8).

## Cara membuka di IntelliJ IDEA
1. Ekstrak ZIP project.
2. Buka IntelliJ IDEA, pilih **File > Open**.
3. Pilih folder `Otomotif_IntelliJ_IDEA` (folder yang berisi `pom.xml`).
4. Pilih **Open as Project** jika diminta dan tunggu Maven selesai dimuat.
5. Atur Project SDK ke JDK 17 atau lebih baru.
6. Buka `src/main/java/Main.java`, lalu klik ikon hijau **Run** di samping `main`.

## Menjalankan lewat terminal
Di terminal IntelliJ, pada folder project:

```bash
mvn clean compile
mvn exec:java
```

## Isi project
- `Kendaraan.java`: abstract superclass
- `Mobil.java` dan `Motor.java`: subclass
- `BisaDiservis.java` dan `BisaDiskon.java`: interface
- `Pelanggan.java`: data pelanggan
- `TransaksiServis.java`: perhitungan dan struk
- `Main.java`: program utama

## Sepuluh persyaratan PBO
1. State dan behavior: atribut serta method prosedur dan fungsi.
2. Immutability: konstanta `BIAYA_ADMIN` dan `idKendaraan` bertipe `final`.
3. Enkapsulasi dan overloading: atribut private, getter/setter, `this`, dan konstruktor overload.
4. Inheritance: `Mobil` dan `Motor` extends `Kendaraan`.
5. Super chaining: `super(...)` dan `super.tampilkanInfo()`.
6. Overriding: method subclass memakai `@Override`.
7. Abstract class: `Kendaraan` memiliki abstract method.
8. Percabangan state: if/else mengubah status `perluServis`.
9. Polimorfisme interface: pemanggilan melalui referensi `BisaDiservis`.
10. Multiple interface: `Mobil implements BisaDiservis, BisaDiskon`.


Screenshot run code:
<img width="599" height="263" alt="Screenshot 2026-11-07 215602" src="https://github.com/user-attachments/assets/457b5b10-634a-4f0e-840f-138271babd4f" />

<img width="640" height="359" alt="Screenshot 2026-11-07 215617" src="https://github.com/user-attachments/assets/66385c35-d139-40e4-9b52-bfda4f6094da" />

<img width="637" height="359" alt="Screenshot 2026-11-07 215634" src="https://github.com/user-attachments/assets/2a98bc05-1885-410c-a5aa-91bd82e4c4ee" />

