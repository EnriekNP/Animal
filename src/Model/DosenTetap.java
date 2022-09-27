package Model;

public class DosenTetap extends Dosen {

    private int salary;

    public DosenTetap(int salary, MatkulAjar[] listMatkulAjar, String departemen, int NIK, String nama, String alamat, String TTL, String telepon) {
        super(listMatkulAjar, departemen, NIK, nama, alamat, TTL, telepon);
        this.salary = salary;
    }
    @Override
    public String toString(){
        return super.toString() 
                +"\nSalary : "+salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
