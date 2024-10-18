import java.util.Scanner;
public class Pembalikkanangka{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt(), balik = 0; 
        for( ;angka != 0; angka=angka/10){  
        int a = angka % 10;
        balik = balik * 10 + a;}  
        System.out.println(balik);  
    }  
}  