package KalkulatorNIlai;
import java.util.ArrayList;
import KalkulatorNIlai.Mhs;


public class InputMhs {

    ArrayList<Mhs> listmhs;

    public InputMhs() {
        listmhs = new ArrayList();
    }

    public void insertData(String NIM, String Nama, String Alamat, String MK, 
            double n1, double n2, double n3, double n4, double n5) {
        Mhs mhs = new Mhs(NIM, Nama, Alamat, MK, n1, n2, n3, n4, n5);
        listmhs.add(mhs);
    }

    public ArrayList<Mhs> getALL() {
        return listmhs;
    }

    public void deleteData(int index) {
        listmhs.remove(index);
    }
}
