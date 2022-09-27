package Model;

import java.util.ArrayList;

public class Karyawan extends Staff {

    private int salary;
    private ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<>();

    public Karyawan(PresensiStaff[] presensi, int salary, int NIK, String nama, String alamat, String TTL, String telepon) {
        super(NIK, nama, alamat, TTL, telepon);
        for (int i = 0; i < presensi.length; i++) {
            listPresensiStaff.add(presensi[i]);
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        String daftarPresensiStaff = "";
        for (int i = 0; i < listPresensiStaff.size(); i++) {
            daftarPresensiStaff += listPresensiStaff.get(i).toString();
        }
        return super.toString()
                + "\nSalary : " + salary
                + "\nPresensi : " + daftarPresensiStaff;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

}
