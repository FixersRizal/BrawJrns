import java.util.*;
public class namapass {
    public static void main(String[] args){
        String nm1, pw1, nm2, pw2, proof;
        String biodata = "Nama : Afrizal Muzacky\nUmur : 19 Tahun\nTempat Tinggal : Malang\nStatus : Mahasiswa";
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama anda       = ");
        nm1 = sc.nextLine();
        System.out.print("Masukkan password anda   = ");
        pw1 = sc.nextLine();
        System.out.print("Masukkan nama anda       = ");
        nm2 = sc.nextLine();
        System.out.print("Masukkan password anda   = ");
        pw2 = sc.nextLine();
        proof = (nm2.equals(nm1) && pw2.equals(pw1))?biodata : "data tidak ditemukan";
        //cetak biodata
        System.out.println("\nBIODATA MAHASISWA");
        System.out.println("==================");
        System.out.println(proof);
    }
}