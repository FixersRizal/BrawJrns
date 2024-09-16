import java.util.Scanner;

public class PLNjava {
    public static void main(String[] args) {
    int awalm, akhirm, bbeban, ppj, pemakaian, tarif, hslppj, tbayar;
    String nama, kelurahan;
    Scanner scn = new Scanner(System.in);
    System.out.print("Masukkan nama                     = ");
    nama = scn.nextLine();
    System.out.print("Masukkan kelurahan                = ");
    kelurahan = scn.nextLine();
    System.out.print("Masukkan posisi awal Kwh Meter    = ");
    // ini punya Afrizal M
    awalm = scn.nextInt();
    System.out.print("Masukkan posisi akhir Kwh Meter   = ");
    akhirm = scn.nextInt();
    System.out.print("Masukkan biaya beban saat ini     = ");
    bbeban = scn.nextInt();
    System.out.print("Masukkan PPJ (dalam persen)       = ");
    ppj = scn.nextInt();
    pemakaian = akhirm - awalm;
    tarif = pemakaian * bbeban;
    hslppj = (tarif * ppj)/100;
    tbayar = tarif + hslppj;
    System.out.println("===================PLN Java===================");
    System.out.println("Nama                    = " + nama);
    System.out.println("Kelurahan               = " + kelurahan);
    System.out.println("Pemakaian bulan ini     = " + pemakaian + " Kwh Meter");
    System.out.println("Tarif listrik           = " + "Rp. " + tarif + ",-");
    System.out.println("PPJ " + ppj + "%"+ "                 = "+ "Rp. " + hslppj + ",-");
    System.out.println("Total bayar             = " + "Rp. " + tbayar + ",-");
    System.out.println("==============================================");
    }
}