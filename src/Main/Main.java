package Main;

import java.util.ArrayList;
import Model.User;
import Model.MahasiswaSarjana;
import Model.MahasiswaMagister;
import Model.MahasiswaDoktor;
import Model.DosenTetap;
import Model.DosenHonorer;
import Model.Karyawan;
import Model.MataKuliah;
import Model.MatkulAjar;
import Model.MatkulAmbil;
import Model.MatkulPilihan;
import Model.Presensi;
import Model.PresensiStaff;
import View.MainMenu;

public class Main {

    public Main() {
        ArrayList<User> listUser = new ArrayList<>();
        ArrayList<MataKuliah> listMataKuliah = new ArrayList<>();
        Presensi presensiSarjana11[] = {
            new Presensi("10/9/2022", 1),
            new Presensi("11/9/2022", 0),
            new Presensi("12/9/2022", 1)};
        Presensi presensiSarjana12[] = {
            new Presensi("21/11/2022", 0),
            new Presensi("22/11/2022", 1)
        };
        Presensi presensiSarjana13[] = {
            new Presensi("17/3/2022", 1),
            new Presensi("18/3/2022", 1)
        };
        Presensi presensiSarjana21[] = {
            new Presensi("02/7/2022", 0),
            new Presensi("03/7/2022", 1),
            new Presensi("04/7/2022", 1),
            new Presensi("05/7/2022", 0)};
        Presensi presensiSarjana22[] = {
            new Presensi("9/01/2022", 1),
            new Presensi("10/01/2022", 0)
        };
        Presensi presensiSarjana23[] = {
            new Presensi("24/06/2022", 0),};
        Presensi presensiSarjana24[] = {
            new Presensi("13/05/2022", 0),
            new Presensi("14/05/2022", 1),
            new Presensi("15/05/2022", 1)
        };
        Presensi presensiSarjana31[] = {
            new Presensi("1/12/2022", 1),
            new Presensi("2/12/2022", 1),};
        Presensi presensiSarjana32[] = {
            new Presensi("21/11/2022", 1),
            new Presensi("22/11/2022", 1),
            new Presensi("03/11/2022", 1)
        };
        Presensi presensiSarjana41[] = {
            new Presensi("1/04/2022", 0),
            new Presensi("2/04/2022", 0),
            new Presensi("3/04/2022", 1),
            new Presensi("3/04/2022", 0)
        };
        Presensi presensiSarjana42[] = {
            new Presensi("21/11/2022", 0),
            new Presensi("22/11/2022", 1)
        };
        Presensi presensiSarjana43[] = {
            new Presensi("1/12/2022", 1),};
        Presensi presensiSarjana44[] = {
            new Presensi("21/11/2022", 0),
            new Presensi("22/11/2022", 1)
        };
        Presensi presensiSarjana45[] = {
            new Presensi("1/12/2022", 1),
            new Presensi("2/12/2022", 1),
            new Presensi("3/12/2022", 0)
        };
        listMataKuliah.add(new MataKuliah("IF-101", 4, "Algoritma & Pemrograman"));
        listMataKuliah.add(new MataKuliah("IF-102", 3, "Web Desain"));
        listMataKuliah.add(new MataKuliah("IF-201", 7, "Struktur Data"));
        listMataKuliah.add(new MataKuliah("IF-201P", 4, "Praktikum Struktur Data"));
        listMataKuliah.add(new MataKuliah("IF-202", 3, "Pemrograman web"));
        listMataKuliah.add(new MataKuliah("IF-203", 2, "Kalkulus"));
        listMataKuliah.add(new MatkulPilihan(20, "IF-901", 2, "Computer Vision"));
        listMataKuliah.add(new MatkulPilihan(15, "IF-902", 3, "Game Development"));
        MatkulAmbil matkulAmbilSarjana1[] = {
            new MatkulAmbil(presensiSarjana11, 70, 80, 90, listMataKuliah.get(0)),
            new MatkulAmbil(presensiSarjana12, 90, 30, 70, listMataKuliah.get(1)),
            new MatkulAmbil(presensiSarjana13, 80, 32, 44, listMataKuliah.get(6))
        };
        MatkulAmbil matkulAmbilSarjana2[] = {
            new MatkulAmbil(presensiSarjana21, 60, 50, 40, listMataKuliah.get(0)),
            new MatkulAmbil(presensiSarjana22, 35, 40, 90, listMataKuliah.get(1)),
            new MatkulAmbil(presensiSarjana23, 80, 32, 44, listMataKuliah.get(4)),
            new MatkulAmbil(presensiSarjana24, 78, 41, 21, listMataKuliah.get(7))
        };
        MatkulAmbil matkulAmbilSarjana3[] = {
            new MatkulAmbil(presensiSarjana31, 42, 36, 12, listMataKuliah.get(0)),
            new MatkulAmbil(presensiSarjana32, 87, 70, 77, listMataKuliah.get(4)),};
        MatkulAmbil matkulAmbilSarjana4[] = {
            new MatkulAmbil(presensiSarjana41, 70, 80, 90, listMataKuliah.get(3)),
            new MatkulAmbil(presensiSarjana42, 90, 30, 70, listMataKuliah.get(4)),
            new MatkulAmbil(presensiSarjana43, 88, 98, 70, listMataKuliah.get(1)),
            new MatkulAmbil(presensiSarjana44, 37, 22, 67, listMataKuliah.get(6)),
            new MatkulAmbil(presensiSarjana45, 49, 68, 58, listMataKuliah.get(2))
        };
        MahasiswaSarjana sarjana[] = {
            new MahasiswaSarjana(matkulAmbilSarjana1, 1121001, "Informatika", "Tono", "Sudirman 5A", "Cimahi,4/04/2003", "081224232123"),
            new MahasiswaSarjana(matkulAmbilSarjana2, 1121002, "Informatika", "Bedu", "Ahmad Yani 30 B", "Bandung,03/08/2003", "082302932912"),
            new MahasiswaSarjana(matkulAmbilSarjana3, 1221002, "Supply Chain", "Koni", "Kolonel Masturi 32", "Jakarta,14/02/2003", "082342132123"),
            new MahasiswaSarjana(matkulAmbilSarjana4, 1321002, "Online Business", "Andre", "Ahmad Yani 30 B", "Surabaya,29/09/2003", "08429238291231")
        };
        Presensi presensi4[] = {
            new Presensi("7/10/2022", 1),
            new Presensi("8/10/2022", 1)
        };
        Presensi presensi5[] = {
            new Presensi("4/4/2022", 1),};
        Presensi presensi6[] = {
            new Presensi("28/9/2022", 1),
            new Presensi("29/9/2022", 1),
            new Presensi("30/9/2022", 0)
        };
        Presensi presensi7[] = {
            new Presensi("14/5/2022", 1),
            new Presensi("15/5/2022", 0),
            new Presensi("16/5/2022", 1),
            new Presensi("17/5/2022", 1)
        };
        MatkulAmbil matkulAmbil2[] = {
            new MatkulAmbil(presensi4, 80, 80, 40, listMataKuliah.get(2)),
            new MatkulAmbil(presensi5, 70, 83, 91, listMataKuliah.get(3)),
            new MatkulAmbil(presensi6, 68, 72, 32, listMataKuliah.get(4)),
            new MatkulAmbil(presensi7, 77, 89, 79, listMataKuliah.get(7))
        };
        MahasiswaMagister magister = new MahasiswaMagister(matkulAmbil2, "Pengaruh Machine Learning Terhadap Pertumbuhan Perusaahan", 2221001, "Ilmu Komputer", "Budi", "Pasir Kaliki 2", "Ambon,2/1/1999", "08293291293");
        MahasiswaDoktor doktor = new MahasiswaDoktor("Aplikasi Algoritma Binary Search Tree dalam Bisnis nyata", 70, 80, 70, 3321001, "Master of Informatics", "Reni", "Surapati 30", "Jogjakarta,14/12/1994", "0832949283213");
        PresensiStaff presensiStaff1[] = {
            new PresensiStaff(2, "10/9/2022", 1),
            new PresensiStaff(4, "11/9/2022", 0),
            new PresensiStaff(3, "12/9/2022", 1)
        };
        PresensiStaff presensiStaff2[] = {
            new PresensiStaff(1, "7/10/2022", 1),
            new PresensiStaff(3, "8/10/2022", 1)
        };
        PresensiStaff presensiStaff3[] = {
            new PresensiStaff(1, "9/11/2022", 0),
            new PresensiStaff(1, "10/11/2022", 1)
        };
        MatkulAjar matkulAjar1[] = {
            new MatkulAjar(presensiStaff1, listMataKuliah.get(0)),
            new MatkulAjar(presensiStaff2, listMataKuliah.get(2)),
            new MatkulAjar(presensiStaff3, listMataKuliah.get(6))
        };
        DosenTetap dosenTetap = new DosenTetap(1000000, matkulAjar1, "Informatika", 1022001, "Bejo", "H Juanda 23 B", "Manado,4/4/1987", "0812342312312");
        PresensiStaff presensiStaff4[] = {
            new PresensiStaff(1, "7/10/2022", 1),
            new PresensiStaff(3, "8/10/2022", 1)
        };
        PresensiStaff presensiStaff5[] = {
            new PresensiStaff(4, "4/4/2022", 1),};
        PresensiStaff presensiStaff6[] = {
            new PresensiStaff(2, "28/9/2022", 1),
            new PresensiStaff(2, "29/9/2022", 1),
            new PresensiStaff(3, "30/9/2022", 0)
        };
        PresensiStaff presensiStaff7[] = {
            new PresensiStaff(1, "11/11/2022", 0),
            new PresensiStaff(4, "12/11/2022", 1),
            new PresensiStaff(3, "13/11/2022", 1),
            new PresensiStaff(2, "14/11/2022", 1)
        };
        MatkulAjar matkulAjar3[] = {
            new MatkulAjar(presensiStaff4, listMataKuliah.get(1)),
            new MatkulAjar(presensiStaff5, listMataKuliah.get(3)),
            new MatkulAjar(presensiStaff6, listMataKuliah.get(4)),
            new MatkulAjar(presensiStaff7, listMataKuliah.get(7))
        };
        DosenHonorer honorer = new DosenHonorer(100000, matkulAjar3, "Informatika", 1022002, "Jono", "Dipatiukur 44 A", "Bandung,8/9/1988", "082412412312");
        PresensiStaff presensiStaff8[] = {
            new PresensiStaff(2, "14/11/2022", 1),
            new PresensiStaff(1, "15/11/2022", 0),
            new PresensiStaff(3, "16/11/2022", 1)
        };
        Karyawan karyawan = new Karyawan(presensiStaff8, 3000000, 1322001, "Dadang", "Buah Batu 103", "Cirebon 22/03/1979", "08989232123122");

        listUser.add(doktor);

        listUser.add(dosenTetap);

        listUser.add(magister);

        listUser.add(honorer);

        listUser.add(karyawan);
        for (int i = 0; i < sarjana.length; i++) {
            listUser.add(sarjana[i]);
        }
        new MainMenu(listUser, listMataKuliah);
    }

    public static void main(String[] args) {
        new Main();
    }
}
