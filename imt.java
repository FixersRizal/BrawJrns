import java.util.Scanner;
public class imt {
    public static void main(String[] args) {
        //Afrizal Muzacky 245150600111016
        int b;
        float t, imt;
        String kategori;
        Scanner sc=new Scanner(System.in);
        System.out.print("Berat badan (kg) : ");
        b = sc.nextInt();
        System.out.print("Tinggi badan (m) : ");
        t = sc.nextFloat();
        imt = b / (t*t);
        if (imt > 30) {
            kategori = "Kegemukan";
        } else if (imt > 25 && imt <= 30) {
            kategori = "Gemuk";
        } else if (imt > 18.5 && imt <= 25) {
            kategori = "Normal";
        } else if (imt > 0 && imt <= 18.5) {
            kategori = "Kurus";
        } else {
            kategori = "Tidak terdefinisi";
        }
        System.out.printf("IMT = %.2f " + "Termasuk %s", imt, kategori);
    }
}