import java.util.*;

public class sistemakademik2 {
    public static void main(String[] args) {
        //Afrizal Muzacky 245150600111016
        String nama, nim, matkul, matkul2, huruf, huruf2, tanya;
        int sks, sks2;
        double nilai, nilai2, ipk, bobot=0, bobot2=0;
        Scanner sc = new Scanner(System.in);
        do {System.out.println("SELAMAT DATANG DI SISTEM AKADEMIK");
        System.out.println("            FILKOM UB            ");
        System.out.println("=================================");
        System.out.println(" ");
        System.out.print("Masukkan nama mahasiswa : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM mahasiswa : ");
        nim = sc.next();
        System.out.print("Masukkan nama matakuliah 1 : ");
        matkul = sc.nextLine()+sc.nextLine();
        System.out.print("Masukkan sks matakuliah 1 : ");
        sks = sc.nextInt();
        System.out.print("Masukkan nilai angka matakuliah 1 : ");
        nilai = sc.nextDouble();
        while (nilai < 0 || nilai > 100) {
            System.out.println("Nilai angka harus di antara 0 - 100");
            System.out.print("Masukkan nilai angka matakuliah 1 : ");
            nilai = sc.nextDouble();
        }if (nilai > 80 && nilai <= 100) {
            huruf = "A";
        }else if (nilai > 75 && nilai <= 80) {
            huruf = "B+";
        }else if (nilai > 69 && nilai <= 75) {
            huruf = "B";
        }else if (nilai > 60 && nilai <= 69) {
            huruf = "C+";
        }else if (nilai > 55 && nilai <= 60) {
            huruf = "C";
        }else if (nilai > 50 && nilai <= 55) {
            huruf = "D+";
        }else if (nilai > 44 && nilai <= 50) {
            huruf = "D";
        } else {
            huruf = "E";
        }
        //batas kedua
        System.out.print("Masukkan nama matakuliah 2 : ");
        matkul2 = sc.nextLine()+sc.nextLine();
        System.out.print("Masukkan sks matakuliah 2 : ");
        sks2 = sc.nextInt();
        System.out.print("Masukkan nilai angka matakuliah 2 : ");
        nilai2 = sc.nextDouble();
        while (nilai2 < 0 || nilai2 > 100) {
            System.out.println("Nilai angka harus di dantara 0 - 100");
            System.out.print("Masukkan nilai angka matakuliah 2 : ");
            nilai2 = sc.nextDouble();
        }if (nilai2 > 80 && nilai2 <= 100) {
            huruf2 = "A";
        }else if (nilai2 > 75 && nilai2 <= 80) {
            huruf2 = "B+";
        }else if (nilai2 > 69 && nilai2 <= 75) {
            huruf2 = "B";
        }else if (nilai2 > 60 && nilai2 <= 69) {
            huruf2 = "C+";
        }else if (nilai2 > 55 && nilai2 <= 60) {
            huruf2 = "C";
        }else if (nilai2 > 50 && nilai2 <= 55) {
            huruf2 = "D+";
        }else if (nilai2 > 44 && nilai2 <= 50) {
            huruf2 = "D";
        } else {
            huruf2 = "E";
        }
        //Perhitungan bobot
        if (huruf.equals("A"))
            bobot = 4.0;
        if (huruf.equals("B+")) 
            bobot = 3.5;
        if (huruf.equals("B")) 
            bobot = 3.0;
        if (huruf.equals("C+")) 
            bobot = 2.5;
        if (huruf.equals("C")) 
            bobot = 2.0;
        if (huruf.equals("D+")) 
            bobot = 1.5;
        if (huruf.equals("D")) 
            bobot = 1.0;
        if (huruf.equals("E")) 
            bobot = 0.0;
        //bobot ke2
        if (huruf2.equals("A"))
            bobot2 = 4.0;
        if (huruf2.equals("B+")) 
            bobot2 = 3.5;
        if (huruf2.equals("B")) 
            bobot2 = 3.0;
        if (huruf2.equals("C+")) 
            bobot2 = 2.5;
        if (huruf2.equals("C")) 
            bobot2 = 2.0;
        if (huruf2.equals("D+")) 
            bobot2 = 1.5;
        if (huruf2.equals("D")) 
            bobot2 = 1.0;
        if (huruf2.equals("E")) 
            bobot2 = 0.0;
            //bobot end
        double mutu = sks*bobot, mutu2 = sks2*bobot2, totalmutu = mutu + mutu2;
        //rumus IPK
        int totalsks = sks + sks2;
        ipk = totalmutu / totalsks;
        //rumus IPK end

        //batas intro
        System.out.println(" ");
        System.out.println("IDENTITAS MAHASISWA");
        System.out.println("Nama mahasiswa      : " + nama);
        System.out.println("NIM mahasiswa       : " + nim);
        System.out.println("  Matakuliah1       : " + matkul);
        System.out.println("  SKS MK1           : " + sks);
        System.out.printf("  Nilai MK1         : %.2f\n", nilai);
        System.out.println("  Nilai huruf MK1   : " + huruf);
        System.out.println(" ");
        // sudah kedua
        System.out.println("  Matakuliah2       : " + matkul2);
        System.out.println("  SKS MK2           : " + sks2);
        System.out.printf("  Nilai MK2         : %.2f\n", nilai2);
        System.out.println("  Nilai huruf MK2   : " + huruf2 );
        System.out.println(" ");
        System.out.printf("IPK: %.2f", ipk);
        System.out.println();
        System.out.println();
        System.out.print("Apakah anda ingin mengulangi lagi ? (Y/T)  ");
        tanya = sc.nextLine()+sc.nextLine();
        tanya = tanya.equals("Y")? "oke" : "no";
    } while (tanya.equals("oke"));
    }
}