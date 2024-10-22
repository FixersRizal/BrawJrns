import java.util.*;
public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long gbulan = sc.nextLong();
        String status = sc.next();
        int usia = sc.nextInt();
        if (gbulan > 3000000 && status.equals("tetap") && usia >= 20 && usia <= 60) {
                    if (gbulan >= 7000000) {
                            System.out.println("Rekening yang tersedia: Silver dan Premium");
                    }
                    else if (gbulan > 3000000 && gbulan < 7000000) {
                            System.out.println("Rekening yang tersedia: Silver");
                    }
                }
        else {
            System.out.println("Anda tidak layak membuka rekening");
        }
    }
}
