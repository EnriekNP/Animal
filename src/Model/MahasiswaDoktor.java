package Model;

public class MahasiswaDoktor extends Mahasiswa {

    private String judulPenelitianDisertasi;
    private int sidang1;
    private int sidang2;
    private int sidang3;

    public MahasiswaDoktor(String judulPenelitianDisertasi, int sidang1, int sidang2, int sidang3, int NIM, String jurusan, String nama, String alamat, String TTL, String telepon) {
        super(NIM, jurusan, nama, alamat, TTL, telepon);
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
        this.sidang1 = sidang1;
        this.sidang2 = sidang2;
        this.sidang3 = sidang3;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nJudul Penelitian Disertasi : " + judulPenelitianDisertasi
                + "\nnilai Sidang 1 : " + sidang1
                + "\nnilai Sidang 2 : " + sidang2
                + "\nnilai Sidang 3 : " + sidang3;
    }

    public String getJudulPenelitianDisertasi() {
        return judulPenelitianDisertasi;
    }

    public void setJudulPenelitianDisertasi(String judulPenelitianDisertasi) {
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
    }

    public int getSidang1() {
        return sidang1;
    }

    public void setSidang1(int sidang1) {
        this.sidang1 = sidang1;
    }

    public int getSidang2() {
        return sidang2;
    }

    public void setSidang2(int sidang2) {
        this.sidang2 = sidang2;
    }

    public int getSidang3() {
        return sidang3;
    }

    public void setSidang3(int sidang3) {
        this.sidang3 = sidang3;
    }

}
