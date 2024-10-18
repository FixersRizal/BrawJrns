import java.util.*;
public class kelulusan {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nis = sc.nextInt();
    double nilai = sc.nextDouble();
    System.out.println("NIS: " + nis);
    if (nilai >= 70) {
        System.out.println("Hasil: Selamat, Anda dinyatakan \"LULUS\"!");
    } else System.out.println("Hasil: Maaf, Anda dinyatakan \"BELUM LULUS\"!");
}
}
