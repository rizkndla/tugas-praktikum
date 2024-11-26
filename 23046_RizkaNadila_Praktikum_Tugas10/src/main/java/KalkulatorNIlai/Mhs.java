package KalkulatorNIlai;

public class Mhs {

    private String NIM, Nama, Alamat, MK;
    private double n1, n2, n3, n4, n5;

    public Mhs(String NIM, String Nama, String Alamat, String MK, 
            double n1, double n2, double n3, double n4, double n5) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.MK = MK;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
    }

    public double NilaiAkhir() {
        return (n1 * 10/100) + (n2 * 15/100) + (n3 * 25/100) + (n4 * 15/100) + (n5 * 35/100);
    }

    public String Nama() {
        return Nama;
    }
    
    public String NIM() {
        return NIM;
    }
    
    public String Alamat() {
        return Alamat;
    }

    public String Matakuliah() {
        return MK;
    }
}
