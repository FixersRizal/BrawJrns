import java.util.Scanner;

public class KecuranganUjian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean ikutUjian = scanner.nextBoolean();
        boolean adaSaksi = scanner.nextBoolean();
        boolean bersediaDiselidiki = scanner.nextBoolean();
        boolean catatanAkademisBaik = scanner.nextBoolean();

        if (ikutUjian) {
            if (adaSaksi) {
                System.out.println("Peserta diduga curang.");
                if (bersediaDiselidiki) {
                    if (catatanAkademisBaik) {
                        System.out.println("Peserta dipertimbangkan sanksi ringan.");
                    } else {
                        System.out.println("Peserta terkena sanksi sesuai kebijakan.");
                    }
                } else {
                    System.out.println("Peserta ditindak sesuai kebijakan.");
                }
            } else {
                System.out.println("Peserta tidak terdeteksi melakukan kecurangan.");
            }
        } else {
            System.out.println("Tidak ada evaluasi kecurangan.");
        }

        scanner.close();
    }
}