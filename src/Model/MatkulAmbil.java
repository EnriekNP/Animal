package Model;

import java.util.ArrayList;

public class MatkulAmbil {

    private MataKuliah mataKuliah;
    private ArrayList<Presensi> listPresensi = new ArrayList<>();
    private int n1;
    private int n2;
    private int n3;

    public MatkulAmbil(Presensi[] listPresensi, int n1, int n2, int n3, MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
        for (int i = 0; i < listPresensi.length; i++) {
            this.listPresensi.add(listPresensi[i]);
        }
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return mataKuliah.toString() + "\nNilai ke 1 : " + n1 + "\nNilai ke 2 : " + n2 + "\nNilai ke 3 : " + n3 + "\nDaftar Presensi : " + daftarPresensi();
    }

    private String daftarPresensi() {
        String daftarPresensi = "";
        for (int i = 0; i < listPresensi.size(); i++) {
            daftarPresensi += listPresensi.get(i).toString();
        }
        return daftarPresensi;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public ArrayList<Presensi> getListPresensi() {
        return listPresensi;
    }

    public void setListPresensi(ArrayList<Presensi> listPresensi) {
        this.listPresensi = listPresensi;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

}
