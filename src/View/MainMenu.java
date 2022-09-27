package View;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import Control.Controller;
import Model.MataKuliah;
import Model.User;

public class MainMenu {

    public MainMenu(ArrayList<User> listUser, ArrayList<MataKuliah> listMataKuliah) {
        int Menu;
        do {
            Controller control = new Controller();
            Menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Daftar Menu : "
                    + "\n1.Print User Data"
                    + "\n2.Print Nilai Akhir"
                    + "\n3.Rata Rata Nilai Akhir Seluruh Mahasiswa"
                    + "\n4.Print Jumlah Mahasiswa Tidak Lulus"
                    + "\n5.Print Mata Kuliah yang diambil + Presensi"
                    + "\n6.Print Total jam Mengajar Dosen"
                    + "\n7.Print Gaji Staff"
                    + "\n0.Exit"));
            switch (Menu) {
                case 1:
                    String namaDicari = JOptionPane.showInputDialog(null, "Nama User yang ingin di print datanya :");
                    JOptionPane.showMessageDialog(null, control.printUserData(listUser, namaDicari));
                    break;
                case 2:
                    int NIM = Integer.parseInt(JOptionPane.showInputDialog(null, "Nim : "));
                    String kodeMK = JOptionPane.showInputDialog(null, "Kode MK : ");
                    JOptionPane.showMessageDialog(null, "Nilai Akhir Mahasiswa : " + control.printNilaiAkhir(listUser, NIM, kodeMK));
                    break;
                case 3:
                    kodeMK = JOptionPane.showInputDialog(null, "Kode MK : ");
                    JOptionPane.showMessageDialog(null, "Rata-Rata Nilai Akhir Mata Kuliah : " + control.printNR(listUser, kodeMK));
                    break;
                case 4:
                    kodeMK = JOptionPane.showInputDialog(null, "Kode MK : ");
                    JOptionPane.showMessageDialog(null,control.printMahasiswaTidakLulus(listUser, listMataKuliah, kodeMK));
                    break;
                case 5:
                    NIM = Integer.parseInt(JOptionPane.showInputDialog(null, "Nim : "));
                    control.printMatkulAmbilMahasiswa(listUser, NIM);
                    break;
                case 6:
                    int NIK = Integer.parseInt(JOptionPane.showInputDialog(null, "NIK : "));
                    JOptionPane.showMessageDialog(null, "Total Jam Mengajar : " + control.totalJamMengajarDosen(listUser, NIK));
                    break;
                case 7:
                    NIK = Integer.parseInt(JOptionPane.showInputDialog(null, "NIK : "));
                    JOptionPane.showMessageDialog(null, "Total Gaji : " + control.PrintGaji(listUser, NIK));
                    break;
            }

        } while (Menu != 0);
    }
}
