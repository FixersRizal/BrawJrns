import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int nilai1, nilai2, hasil;
        System.out.print("masukkan nilai 1 : ");
        nilai1 = input.nextInt();
        System.out.print("masukkan nilai 2 : ");
        nilai2 = input.nextInt();
        hasil = nilai1+nilai2;
        String nama,NIM;
        System.out.println("maka hasil : "+hasil);
        System.out.print("Masukkan nama = ");
        nama = input.next();
        System.out.print("Masukkan NIM = ");
        NIM = input.next();
        System.out.println("Nama anda adalah " + nama + " dengan NIM = " + NIM);
    }
}