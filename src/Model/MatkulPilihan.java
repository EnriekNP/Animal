package Model;

public class MatkulPilihan extends MataKuliah {

    private int jumlahMinimumMahasiswa;

    public MatkulPilihan(int jumlahMinimumMahasiswa, String Kode, int SKS, String Nama) {
        super(Kode, SKS, Nama);
        this.jumlahMinimumMahasiswa = jumlahMinimumMahasiswa;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nJumlah Minimum Mahasiswa :" + jumlahMinimumMahasiswa;
    }

    public int getJumlahMinimumMahasiswa() {
        return jumlahMinimumMahasiswa;
    }

    public void setJumlahMinimumMahasiswa(int jumlahMinimumMahasiswa) {
        this.jumlahMinimumMahasiswa = jumlahMinimumMahasiswa;
    }

}
