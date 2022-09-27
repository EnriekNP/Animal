package Control;

import Model.MahasiswaDoktor;
import Model.Dosen;
import Model.DosenTetap;
import Model.DosenHonorer;
import Model.Karyawan;
import Model.MahasiswaMagister;
import Model.Mahasiswa;
import Model.MahasiswaSarjana;
import Model.MataKuliah;
import Model.Staff;
import Model.User;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controller {

    public String printUserData(ArrayList<User> listUser, String nama) {
        for (int i = 0; i < listUser.size(); i++) {
            User user = listUser.get(i);
            if (user.getNama().equals(nama)) {
                JOptionPane.showMessageDialog(null, "Berhasil");
                String status = "User Adalah ";
                if (user instanceof Mahasiswa) {
                    status += "Mahasiswa ";
                    Mahasiswa mahasiswa = (Mahasiswa) user;
                    if (mahasiswa instanceof MahasiswaSarjana) {
                        MahasiswaSarjana sarjana = (MahasiswaSarjana) mahasiswa;
                        status += "Sarjana\n" + sarjana.toString();
                    } else if (mahasiswa instanceof MahasiswaMagister) {
                        MahasiswaMagister magister = (MahasiswaMagister) mahasiswa;
                        status += "Magister\n" + magister.toString();
                    } else if (mahasiswa instanceof MahasiswaDoktor) {
                        MahasiswaDoktor doktor = (MahasiswaDoktor) mahasiswa;
                        status += "Doktor\n" + doktor.toString();
                    }
                } else if (user instanceof Dosen) {
                    status += "Dosen ";
                    Dosen dosen = (Dosen) user;
                    if (dosen instanceof DosenTetap) {
                        DosenTetap dosentetap = (DosenTetap) dosen;
                        status += "Tetap\n" + dosentetap.toString();
                    } else if (dosen instanceof DosenHonorer) {
                        DosenHonorer honorer = (DosenHonorer) dosen;
                        status += "Honorer\n" + honorer.toString();
                    }
                } else if (user instanceof Karyawan) {
                    Karyawan karyawan = (Karyawan) user;
                    status += "\nKaryawan" + karyawan.toString();
                }
                return status;
            }
        }
        return "Tidak ada user dengan nama " + nama;
    }

    public int printNilaiAkhir(ArrayList<User> listUser, int NIM, String kodeMK) {
        int rataRata = -1;
        Mahasiswa mahasiswa = cekNIM(listUser, NIM);
        if (mahasiswa instanceof MahasiswaSarjana) {
            MahasiswaSarjana sarjana = (MahasiswaSarjana) mahasiswa;
            for (int j = 0; j < sarjana.getListMataKuliah().size(); j++) {
                if (sarjana.getListMataKuliah().get(j).getMataKuliah().getKode().equals(kodeMK)) {
                    rataRata = (sarjana.getListMataKuliah().get(j).getN1() + sarjana.getListMataKuliah().get(j).getN2() + sarjana.getListMataKuliah().get(j).getN3()) / 3;
                }
            }
        } else if (mahasiswa instanceof MahasiswaMagister) {
            MahasiswaMagister magister = (MahasiswaMagister) mahasiswa;
            for (int j = 0; j < magister.getListMataKuliah().size(); j++) {
                if (magister.getListMataKuliah().get(j).getMataKuliah().getKode().equals(kodeMK)) {
                    rataRata = (magister.getListMataKuliah().get(j).getN1() + magister.getListMataKuliah().get(j).getN2() + magister.getListMataKuliah().get(j).getN3()) / 3;
                }
            }
        } else if (mahasiswa instanceof MahasiswaDoktor) {
            MahasiswaDoktor doktor = (MahasiswaDoktor) mahasiswa;
            rataRata = (doktor.getSidang1() + doktor.getSidang2() + doktor.getSidang3()) / 3;
        }

        return rataRata;
    }

    public int printNR(ArrayList<User> listUser, String kodeMK) {
        int total = 0;
        int nilaiAkhir = 0;
        int counter = 0;
        for (int i = 0; i < listUser.size(); i++) {
            User user = listUser.get(i);
            if (user instanceof Mahasiswa) {
                Mahasiswa mahasiswa = (Mahasiswa) user;
                if (mahasiswa instanceof MahasiswaSarjana || mahasiswa instanceof MahasiswaMagister) {
                    nilaiAkhir = printNilaiAkhir(listUser, mahasiswa.getNIM(), kodeMK);
                    if (nilaiAkhir != -1) {
                        total += nilaiAkhir;
                        counter++;
                    }
                }
            }
        }
        if (counter > 0) {
            return total / counter;
        } else {
            return 0;
        }
    }

    public String printMahasiswaTidakLulus(ArrayList<User> listUser, ArrayList<MataKuliah> matkul, String kodeMK) {
        int jumlahMahasiswaTidakLulus = 0;
        int nilaiAkhir = 0;
        int jumlahMahasiswa = 0;
        for (int i = 0; i < listUser.size(); i++) {
            User user = listUser.get(i);
            if (user instanceof Mahasiswa) {
                Mahasiswa mahasiswa = (Mahasiswa) user;
                if (mahasiswa instanceof MahasiswaSarjana || mahasiswa instanceof MahasiswaMagister) {
                    nilaiAkhir = printNilaiAkhir(listUser, mahasiswa.getNIM(), kodeMK);
                    if (nilaiAkhir != -1) {
                        if (nilaiAkhir < 56) {
                            jumlahMahasiswaTidakLulus++;
                        }
                        jumlahMahasiswa++;
                    }
                }
            }
        }
        String namaMatkul = "";
        for (int i = 0; i < matkul.size(); i++) {
            if (matkul.get(i).getKode().equals(kodeMK)) {
                namaMatkul = matkul.get(i).getNama();
            }
        }
        if (jumlahMahasiswa > 0) {
            return "<" + jumlahMahasiswaTidakLulus + "> dari <" + jumlahMahasiswa + "> mahasiswa tidak lulus matakuliah " + namaMatkul;
        } else {
            return "Tidak ada Mahasiswa di matakuliah " + namaMatkul;
        }
    }

    public void printMatkulAmbilMahasiswa(ArrayList<User> listUser, int NIM) {
        Mahasiswa mahasiswa = cekNIM(listUser, NIM);
        String matkulPresensi = "";
        int presensi = 0;
        if (mahasiswa instanceof MahasiswaSarjana) {
            MahasiswaSarjana sarjana = (MahasiswaSarjana) mahasiswa;
            for (int i = 0; i < sarjana.getListMataKuliah().size(); i++) {
                for (int j = 0; j < sarjana.getListMataKuliah().get(i).getListPresensi().size(); j++) {
                    if (sarjana.getListMataKuliah().get(i).getListPresensi().get(j).getStatus() == 1) {
                        presensi++;
                    }
                }
                matkulPresensi += sarjana.getListMataKuliah().get(i).getMataKuliah().toString() + "\nJumlah Presensi : " + presensi;
            }
        } else if (mahasiswa instanceof MahasiswaMagister) {
            MahasiswaMagister magister = (MahasiswaMagister) mahasiswa;
            for (int i = 0; i < magister.getListMataKuliah().size(); i++) {
                for (int j = 0; j < magister.getListMataKuliah().get(i).getListPresensi().size(); j++) {
                    if (magister.getListMataKuliah().get(i).getListPresensi().get(j).getStatus() == 1) {
                        presensi++;
                    }
                }
                matkulPresensi += magister.getListMataKuliah().get(i).getMataKuliah().toString() + "\nJumlah Presensi : " + presensi;
            }
        }
        JOptionPane.showMessageDialog(null, "Mata Kuliah : " + matkulPresensi);
    }

    private Mahasiswa cekNIM(ArrayList<User> listUser, int NIM) {
        for (int i = 0; i < listUser.size(); i++) {
            User user = listUser.get(i);
            if (user instanceof Mahasiswa) {
                Mahasiswa mahasiswa = (Mahasiswa) user;
                if (mahasiswa.getNIM() == NIM) {
                    return mahasiswa;
                }
            }
        }
        return null;
    }

    public int totalJamMengajarDosen(ArrayList<User> listUser, int NIK) {
        int total = 0;
        Dosen dosen = (Dosen) cekNIK(listUser, NIK);
        if (dosen instanceof Dosen) {
            for (int i = 0; i < dosen.getListMataKuliahDiajar().size(); i++) {
                for (int j = 0; j < dosen.getListMataKuliahDiajar().get(i).getListPresensiStaff().size(); j++) {
                    if (dosen.getListMataKuliahDiajar().get(i).getListPresensiStaff().get(j).getStatus() == 1) {
                        total += dosen.getListMataKuliahDiajar().get(i).getListPresensiStaff().get(j).getJam();
                    }
                }
            }
            return total;
        }
        return -1;
    }

    private Staff cekNIK(ArrayList<User> listUser, int NIK) {
        for (int i = 0; i < listUser.size(); i++) {
            User user = listUser.get(i);
            if (user instanceof DosenTetap) {
                DosenTetap dosentetap = (DosenTetap) user;
                if (dosentetap.getNIK() == NIK) {
                    return dosentetap;
                }
            } else if (user instanceof DosenHonorer) {
                DosenHonorer dosenhonorer = (DosenHonorer) user;
                if (dosenhonorer.getNIK() == NIK) {
                    return dosenhonorer;
                }
            } else if (user instanceof Karyawan) {
                Karyawan karyawan = (Karyawan) user;
                if (karyawan.getNIK() == NIK) {
                    return karyawan;
                }
            }
        }
        return null;
    }

    public int PrintGaji(ArrayList<User> listUser, int NIK) {
        int unit = cekPresensiStaff(cekNIK(listUser, NIK));
        int gaji = 0;
        Staff staff = cekNIK(listUser, NIK);
        if (staff instanceof Karyawan) {
            gaji = unit / 22 * ((Karyawan) staff).getSalary();
        } else if (staff instanceof DosenTetap) {
            gaji = ((DosenTetap) staff).getSalary() + (unit * 25000);
        } else if (staff instanceof DosenHonorer) {
            gaji = unit * ((DosenHonorer) staff).getHonorPerSKS();
        }
        return gaji;
    }

    private int cekPresensiStaff(Staff staff) {
        int total = 0;
        if (staff instanceof Karyawan) {
            Karyawan karyawan = (Karyawan) staff;
            for (int i = 0; i < karyawan.getListPresensiStaff().size(); i++) {
                if (karyawan.getListPresensiStaff().get(i).getStatus() == 1) {
                    total++;
                }
            }
            return total;
        } else if (staff instanceof Dosen) {
            Dosen dosen = (Dosen) staff;
            for (int i = 0; i < dosen.getListMataKuliahDiajar().size(); i++) {
                for (int j = 0; j < dosen.getListMataKuliahDiajar().get(i).getListPresensiStaff().size(); j++) {
                    if (dosen.getListMataKuliahDiajar().get(i).getListPresensiStaff().get(j).getStatus() == 1) {
                        total++;
                    }
                }
            }
            return total;
        }
        return -1;
    }
}
