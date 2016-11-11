package rizkifaujim.app12141425;

import java.util.Scanner;


public class tebakangka {
    public static void main(String[] args){
        
        int random,tebak,jumlah;
        random = (int)(Math.random()*100);
        System.out.println("Tebaklah Angka Antara 1-100");
        Scanner masukan = new Scanner(System.in);
        jumlah = 0;
        do{
            jumlah++;
            System.out.print("Masukan Tebakan Anda : ");
            tebak=masukan.nextInt();
        }
        
        
    }
    
}
