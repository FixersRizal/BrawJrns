import java.util.*;
public class dulinanlampu {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int detik = sc.nextInt();
        String lampuA;
        String lampuB;
        String lampuC;
        System.out.println("Detik ke-" + detik);
        //lampu
        //a
            if (detik < 30) {
                System.out.println("Lampu A: Hijau");
            }
            else if (detik > 30) {
                System.out.println("Lampu A: Kuning");
            } 
            else if (detik > 33) {
                System.out.println("Lampu A: Merah");
            }
        //b
            if (detik < 20) {
                lampuB = "Hijau";
                if (detik > 20) {
                    lampuB = "Kuning";
                } 
                else if (detik > 23) {
                    lampuB = "Merah";
                }
                System.out.println("Lampu A: " + lampuB);
                if (lampuB.equals("Merah")) {
                    System.out.println("Pengendara di jalur B tidak boleh lewat");
                }
        }
        //c
            if (detik < 25) {
                lampuC = "Hijau";
                if (detik > 25) {
                    lampuC = "Kuning";
                } 
                else if (detik > 28) {
                    lampuC = "Merah";
                }
                System.out.println("Lampu A: " + lampuC);
                if (lampuC.equals("Merah")) {
                    System.out.println("Pengendara di jalur C tidak boleh lewat");
                }
        }
    }
}