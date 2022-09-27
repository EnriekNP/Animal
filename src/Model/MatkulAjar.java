package Model;

import java.util.ArrayList;

public class MatkulAjar {

    private MataKuliah mataKuliah;
    private MatkulPilihan mataKuliahPilihan;
    private ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<>();

    public MatkulAjar(PresensiStaff[] listPresensiStaff, MataKuliah mataKuliah) {
        for (int i = 0; i < listPresensiStaff.length; i++) {
            this.listPresensiStaff.add(listPresensiStaff[i]);
        }
        this.mataKuliah = mataKuliah;
    }

    public MatkulAjar(PresensiStaff[] listPresensiStaff, MatkulPilihan mataKuliahPilihan) {
        for (int i = 0; i < listPresensiStaff.length; i++) {
            this.listPresensiStaff.add(listPresensiStaff[i]);
        }
        this.mataKuliahPilihan = mataKuliahPilihan;
    }

    @Override
    public String toString() {
        if (mataKuliah == null) {
            return mataKuliahPilihan.toString() + "\nDaftar Presensi Staff : " + daftarPresensiStaff();
        } else {
            return mataKuliah.toString() + "\nDaftar Presensi Staff : " + daftarPresensiStaff();
        }
    }

    private String daftarPresensiStaff() {
        String daftarPresensiStaff = "";
        for (int i = 0; i < listPresensiStaff.size(); i++) {
            daftarPresensiStaff += listPresensiStaff.get(i).toString();
        }
        return daftarPresensiStaff;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public MatkulPilihan getMataKuliahPilihan() {
        return mataKuliahPilihan;
    }

    public void setMataKuliahPilihan(MatkulPilihan mataKuliahPilihan) {
        this.mataKuliahPilihan = mataKuliahPilihan;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

}
