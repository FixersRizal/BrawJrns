import java.util.*;
public class biodata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama = sc.nextLine();
        short umur = sc.nextShort();sc.nextLine();
        String asal = sc.nextLine();
            System.out.println("Nama Anda: " + nama);
            System.out.println("Umur Anda: " + umur);
            System.out.println("Kota Asal Anda: " + asal);
    }
}