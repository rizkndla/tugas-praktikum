package TokoSerbaAda;

public class TokoSerbaAda {
    private Barang[] daftarBarang;

    public TokoSerbaAda() {

        daftarBarang = new Barang[3];
        daftarBarang[0] = new Barang("a001", "Buku", 3000);
        daftarBarang[1] = new Barang("a002", "Pensil", 2000);
        daftarBarang[2] = new Barang("a003", "Pulpen", 5000);
    }

    public Barang getBarangByKode(String kode) {
        for (Barang barang : daftarBarang) {
            if (barang.getKode().equals(kode)) {
                return barang;
            }
        }
        return null;
    }

    public void tampilkanNota(String[][] transaksi) {
        System.out.println("TOKO SERBA ADA");
        System.out.println("*****************************");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        int totalBayar = 0;
        for (int i = 0; i < transaksi.length; i++) {
            Barang barang = getBarangByKode(transaksi[i][0]);
            if (barang != null) {
                int jumlahBeli = Integer.parseInt(transaksi[i][1]);
                int jumlahBayar = barang.getHarga() * jumlahBeli;
                totalBayar += jumlahBayar;
                System.out.printf("%-3d %-12s %-12s %-7d %-11d %-12d\n", (i + 1), barang.getKode(), barang.getNama(), barang.getHarga(), jumlahBeli, jumlahBayar);
            } else {
                System.out.println("Barang dengan kode " + transaksi[i][0] + " tidak ditemukan.");
            }
        }
        System.out.println("Total Bayar: " + totalBayar);
    }
}
