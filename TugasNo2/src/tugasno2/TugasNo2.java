package tugasno2;
import java.util.Scanner;

public class TugasNo2{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int uang;
        boolean hujan;
        boolean hasil;
        
        System.out.print("Masukkan jumlah uang kamu: ");
        uang = input.nextInt();
        
        System.out.print("Apakah diluar lagi hujan? (true/false): ");
        hujan = input.nextBoolean();
        
        hasil = (uang > 5000) && (!hujan);
        
        System.out.println("\nKesimpulan : " + hasil);
       
    }
}