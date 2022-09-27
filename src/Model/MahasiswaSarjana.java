package Model;

import java.util.ArrayList;
public class MahasiswaSarjana extends Mahasiswa {

    private ArrayList<MatkulAmbil> listMataKuliah = new ArrayList<>();

    public MahasiswaSarjana(MatkulAmbil listMataKuliah[], int NIM, String jurusan, String nama, String alamat, String TTL, String telepon) {
        super(NIM, jurusan, nama, alamat, TTL, telepon);
        for (int i = 0; i < listMataKuliah.length; i++) {
            this.listMataKuliah.add(listMataKuliah[i]);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public ArrayList<MatkulAmbil> getListMataKuliah() {
        return listMataKuliah;
    }

    public void setListMataKuliah(ArrayList<MatkulAmbil> listMataKuliah) {
        this.listMataKuliah = listMataKuliah;
    }
}
