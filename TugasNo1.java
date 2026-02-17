//Muhammad Iqbal Al-Ayaysy
//2406697
//Nomer 1

package tugasno1;
import java.util.Scanner;

public class TugasNo1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int a,b,c;
        int jumlah,kurang,kali;
        double bagi;
        
        System.out.print("Masukkan bilangan pertama: ");
        a= input.nextInt();
        
        System.out.print("Masukan bilangan kedua: ");
        b= input.nextInt();
        
        System.out.print("Masukkan bilangan ketiga: ");
        c= input.nextInt();
        
        jumlah = a+b+c;
        kurang = a-b-c;
        kali = a*b*c;

        bagi = (double) a/b/c;
        
        System.out.println("\nHasil Operasi: ");
        System.out.println("Penjumlahan = " + jumlah);
        System.out.println("Pengurangan = " + kurang);
        System.out.println("Perkalian = " + kali);
        System.out.println("Pembagian = " + bagi);
    }
}
