package Model;

public class DosenHonorer extends Dosen {

    private int honorPerSKS;

    public DosenHonorer(int honorPerSKS, MatkulAjar[] listMatkulAjar, String departemen, int NIK, String nama, String alamat, String TTL, String telepon) {
        super(listMatkulAjar, departemen, NIK, nama, alamat, TTL, telepon);
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nHonor Per Sks : " + honorPerSKS;
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

}
