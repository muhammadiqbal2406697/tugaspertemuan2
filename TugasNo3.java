//Muhammad Iqbal Al-Ayaysy
//2406697
//Nomer 3

package tugasno3;
import java.util.Scanner;

public class TugasNo3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int hasil;
        char a ='1';
        char b ='2';
        
        hasil = a+b;
        
        System.out.println("Nilai karakter '1' ASCII adalah = "+(int)a);
        System.out.println("Nilai karakter '2' ASCII adalah = "+(int)b);
        System.out.println("Hasil penjumlahan ASCII :" + hasil);
    }
}