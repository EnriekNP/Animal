package Model;

public class Staff extends User {

    private int NIK;

    public Staff(int NIK, String nama, String alamat, String TTL, String telepon) {
        super(nama, alamat, TTL, telepon);
        this.NIK = NIK;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nNIK : " + NIK;
    }

    public int getNIK() {
        return NIK;
    }

    public void setNIK(int NIK) {
        this.NIK = NIK;
    }

}
