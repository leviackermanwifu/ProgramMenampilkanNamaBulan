package fosalgo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arrayBulan= {"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
        if(n >= 1 && n <= 12){
            for(int i = 0;i <= 3;i++){
                System.out.println(arrayBulan[n -1]);
                n++;
                //n = n % 12;
                if(n > 12) n = 1;
            }
        }
    }
}
        
        
        
    


