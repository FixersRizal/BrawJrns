import java.util.Scanner;
public class gajipegawai {
    public static void main(String[] args) {
        //Afrizal Muzacky 245150600111016
        Scanner sc = new Scanner(System.in);
        int jamk,jamk2, upah=0,upah2=0, lembur=0, denda1=0, denda2=0, total;
        System.out.print("Jam kerja    : ");
        jamk = sc.nextInt();
        // upah = sc.nextInt();
        if (jamk >= 0) {
            upah = 5000 * jamk;
            if (jamk > 60) {
                upah = upah - 5000 * (jamk - 60);
            }
        }
        if (jamk > 60) {
            jamk2 = jamk - 60;
            lembur = 6000 * jamk2;
        }
        if (jamk < 50) {
            denda1 = 50 - jamk;
            denda2 = 1000 * denda1;
        }
        System.out.println("Upah         : Rp. " + upah);
        System.out.println("Lembur       : Rp. " + lembur);
        // lembur = sc.nextInt();
        System.out.println("Denda        : Rp. " + denda2);
        // denda = sc.nextInt();
        total = upah + lembur - denda2;
        System.out.println("============================");
        System.out.println("Total        : Rp. " + total);
        // total = sc.nextInt();
    }
}