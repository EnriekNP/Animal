package Model;

import java.util.ArrayList;

public class Dosen extends Staff {

    private String departemen;
    private ArrayList<MatkulAjar> listMataKuliahDiajar = new ArrayList<>();

    public Dosen(MatkulAjar[] listMatkulAjar, String departemen, int NIK, String nama, String alamat, String TTL, String telepon) {
        super(NIK, nama, alamat, TTL, telepon);
        for (int i = 0; i < listMatkulAjar.length; i++) {
            this.listMataKuliahDiajar.add(listMatkulAjar[i]);
        }
        this.departemen = departemen;
    }

    @Override
    public String toString() {
        return super.toString() + "Departement : " + departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<MatkulAjar> getListMataKuliahDiajar() {
        return listMataKuliahDiajar;
    }

    public void setListMataKuliahDiajar(ArrayList<MatkulAjar> listMataKuliahDiajar) {
        this.listMataKuliahDiajar = listMataKuliahDiajar;
    }

}
