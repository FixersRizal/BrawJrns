import java.util.Scanner;
public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahk = sc.nextInt();
        long totalGaji = 0;
        int gaji;
        for (int i = 0; i < jumlahk; i++) {
            boolean gajiValid = false;
            while (!gajiValid) {
                gaji = sc.nextInt();
                //0000 4?
                if (gaji % 1000 == 0) {
                    totalGaji += gaji;
                    gajiValid = true;
                }else{continue;}
            }
        }
        System.out.println(totalGaji);
}
}