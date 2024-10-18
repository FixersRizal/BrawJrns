import java.util.*;
public class seleksi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int norut = sc.nextInt();
        String berkas = sc.nextLine()+sc.nextLine();
        double nilai = sc.nextDouble();
        if (berkas.equals("Lengkap")) {
            if (nilai >= 75) {
                System.out.println("Selamat, Anda diterima!");
            } else {System.out.println("Maaf, Anda tidak diterima karena nilai kurang dari 75!!");}
        }
        if (berkas.equals("Tidak Lengkap")) {
            System.out.println("Maaf, Anda tidak diterima karena berkas tidak lengkap!!!");
        }
    }
}