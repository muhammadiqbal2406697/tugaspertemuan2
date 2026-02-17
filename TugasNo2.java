//Muhammad Iqbal Al-Ayaysy
//2406697
//Nomer 2

package tugasno2;
import java.util.Scanner;

public class TugasNo2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int uang;
        boolean hujan;
        
        System.out.print("Masukkan jumlah uang kamu: ");
        uang = input.nextInt();
        
        System.out.print("Apakah diluar lagi hujan? (true/false): ");
        hujan = input.nextBoolean();
        
        String kesimpulan =((uang>5000) && (!hujan)) ?"Jadi Membeli Gorengan" : "Tidak jadi membeli gorengan";
        
        System.out.println("\nKesimpulan : " + kesimpulan);
       
    }
}