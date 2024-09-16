import java.util.Scanner;

public class operatorbil {
    public static void main(String[] args) {
        int x, y, jumlah, kurang, kali;
        double bagi;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        jumlah = x + y;
        kurang = x - y;
        kali = x * y;
        bagi = (x*1.0) / (y*1.0);
        System.out.println("Hasil penjumlahan           = " + jumlah);
        System.out.println("Hasil pengurangan           = " + kurang);
        System.out.println("Hasil perkalian             = " + kali);
        System.out.println("Hasil pembagian             = " + bagi);
    }
}