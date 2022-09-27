package Model;

public class Presensi {

    private String tanggal;
    private int status;

    public Presensi(String tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    @Override
    public String toString() {
        return "\nTanggal : " + tanggal
                + "\nStatus : " + penentuStatus(status);
    }

    private Status penentuStatus(int status) {
        if (status == 0) {
            return Status.ALPHA;
        } else {
            return Status.HADIR;
        }
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
