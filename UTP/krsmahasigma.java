import java.util.*;
public class krsmahasigma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlsiswa = sc.nextInt();
        int plsks = 0;
        int sks = 0;
        int b = 0;
        int hasil = 0;
        for (int a = 0;a < jmlsiswa;a++) {
            String nama = sc.next();
            for (;b < 3;b++){
                sks = sc.nextInt();
                if (sks == 1 || sks == 2 || sks == 3) {
                    if (sks == 1) {
                        plsks = 100;
                    }
                    else if (sks == 2) {
                        plsks = 80;
                    }
                    else if (sks == 3) {
                        plsks = 20;
                    }
                }
                if (sks == -1) {
                    break;
                }
                hasil += plsks;
            }
                System.out.println("Total SKS " + nama +" : "+ hasil );
        }
    }
}

// Total SKS Gilang : 60
// Total SKS Yogi : 100
// Total SKS Irfan : 200


// Mata Kuliah dan SKS:
// Pemrograman Dasar: 100 SKS (kode: 1)
// Matematika Diskrit: 80 SKS (kode: 2)
// Pancasila: 20 SKS (kode: 3)

// Input pertama adalah jumlah mahasiswa.

// Untuk setiap mahasiswa, masukkan:

// Nama mahasiswa.
// Kode mata kuliah yang ingin diambil (1, 2, atau 3).
// Mahasiswa dapat memasukkan hingga 3 mata kuliah. 
// Jika mahasiswa ingin berhenti sebelum mencapai 3 mata kuliah, mereka dapat memasukkan -1.