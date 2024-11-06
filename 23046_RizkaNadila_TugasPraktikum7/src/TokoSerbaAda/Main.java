package TokoSerbaAda;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TokoSerbaAda toko = new TokoSerbaAda();

        System.out.print("Masukkan Item Barang: ");
        int jumlahItem = scanner.nextInt();
        scanner.nextLine(); 

        String[][] transaksi = new String[jumlahItem][2];

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode: ");
            transaksi[i][0] = scanner.nextLine();
            System.out.print("Masukkan Jumlah Beli: ");
            transaksi[i][1] = scanner.nextLine();
        }

        toko.tampilkanNota(transaksi);
    }
}
