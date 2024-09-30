import java.util.Scanner;
public class kelluasbangundatar{
    public static void main(String[] args) {
        //Afrizal Muzacky 245150600111016
        double p, l , jr, a, t, alas, lpp, kpp, ll, kl, ls, ks, phi = 3.14;
        int plhn;
        Scanner sd = new Scanner(System.in);
        System.out.println("Menu : ");
        System.out.println("1. Menghitung luas dan keliling persegi panjang");
        System.out.println("2. Menghitung luas dan keliling lingkaran");
        System.out.println("3. Menghitung luas dan keliling segitiga");
        System.out.print("Pilihan anda : ");
        plhn = sd.nextInt();

        
        switch (plhn) {
            case 1:
                System.out.print("Masukkan panjang  : ");
                p = sd.nextDouble();
                System.out.print("Masukkan lebar    : ");
                l = sd.nextDouble();
                kpp = 2 * (p + l);
                lpp = p * l;
                System.out.println("Keliling persegi panjang    : " + kpp + " cm");
                System.out.println("Luas persegi panjang        : " + lpp + " cm2");break;
            case 2 :
                System.out.print("Masukkan jari-jari : ");
                jr = sd.nextDouble();
                kl = 2 * phi * jr;
                ll = phi * jr * jr;
                System.out.println("Keliling lingkaran  : " + kl + " cm");
                System.out.println("Luas lingkaran      : " + ll + " cm2");break;
            case 3 :
                System.out.print("Masukkan a : ");
                a = sd.nextDouble();
                System.out.print("Masukkan b : ");
                alas = sd.nextDouble();
                System.out.print("Masukkan r : ");
                t = sd.nextDouble();
                ks = a + t + alas;
                ls = 0.5 * alas * a;
                System.out.println("Keliling segitiga   : " + ks + " cm");
                System.out.println("Luas segitiga       : " + ls + " cm2");break;
            default: System.out.println("Data tak ditemukan, program dihentikan...");break;
        }

    }
}