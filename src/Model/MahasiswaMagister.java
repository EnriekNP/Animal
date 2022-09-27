package Model;

import java.util.ArrayList;

public class MahasiswaMagister extends Mahasiswa {

    private ArrayList<MatkulAmbil> listMataKuliah = new ArrayList<>();
    private String judulPenelitianTesis;

    public MahasiswaMagister(MatkulAmbil listMataKuliah[], String judulPenelitianTesis, int NIM, String jurusan, String nama, String alamat, String TTL, String telepon) {
        super(NIM, jurusan, nama, alamat, TTL, telepon);
        for (int i = 0; i < listMataKuliah.length; i++) {
            this.listMataKuliah.add(listMataKuliah[i]);
        }
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJudul Penelitian Tesis : " + judulPenelitianTesis;
    }

    public ArrayList<MatkulAmbil> getListMataKuliah() {
        return listMataKuliah;
    }

    public void setListMataKuliah(ArrayList<MatkulAmbil> listMataKuliah) {
        this.listMataKuliah = listMataKuliah;
    }

    public String getJudulPenelitianTesis() {
        return judulPenelitianTesis;
    }

    public void setJudulPenelitianTesis(String judulPenelitianTesis) {
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

}
