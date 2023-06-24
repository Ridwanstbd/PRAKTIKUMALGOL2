package modul10;

import java.util.Scanner;

/**
 * ! kalkulator
 */
class kalkulator {
    Scanner ip = new Scanner(System.in);
    double penjumlahan (int n){System.out.println("-------penjumlahan--------"); return 0;}
    double pengurangan (int n){System.out.println("-------pengurangan--------"); return 0;}
    double pengkalian (int n){System.out.println("-------penngkalian--------"); return 0;}
    double pembagian (int n){System.out.println("-------pembagian--------"); return 0;}
}
class operasi extends kalkulator {
    double Total;
    int awal = 1;

    @Override
    double penjumlahan (int n){
        double[] inputan = new double[n];
        for (int i = 0;i<inputan.length;i++){
            System.out.print("Masukkan angka ke "+awal++ +" : ");inputan[i]=ip.nextDouble();
            if (i == 0) {
                Total = inputan[0];
            } else {
                Total += inputan[i];
            }
        }
        System.out.println("Angka yang anda jumlahkan ");
        for(int i = 0;i< n;i++){
            System.out.print(inputan[i]);
            if (i > inputan.length -1) {
                break;
            } else {
                System.out.print(" + ");
            }
        }
        System.out.print("\n hasil angka yang angka jumlahkan = "+ Total);
        return Total;
    }
    
    @Override
    double pengurangan (int n){
        double[] inputan = new double[n];
        for (int i = 0;i<inputan.length;i++){
            System.out.print("Masukkan angka ke "+awal++ +" : ");inputan[i]=ip.nextDouble();
            if (i == 0) {
                Total = inputan[0];
            } else {
                Total -= inputan[i];
            }
        }
        System.out.println("Angka yang anda kurangi ");
        for(int i = 0;i< n;i++){
            System.out.print(inputan[i]);
            if (i > inputan.length -1) {
                break;
            } else {
                System.out.print(" - ");
            }
        }
        System.out.print("\n hasil angka yang angka kurangi = "+ Total);
        return Total;
    }
    @Override
    double pengkalian (int n){
        double[] inputan = new double[n];
        for (int i = 0;i<inputan.length;i++){
            System.out.print("Masukkan angka ke "+awal++ +" : ");inputan[i]=ip.nextDouble();
            if (i == 0) {
                Total = inputan[0];
            } else {
                Total *= inputan[i];
            }
        }
        System.out.println("Angka yang anda kali ");
        for(int i = 0;i< n;i++){
            System.out.print(inputan[i]);
            if (i > inputan.length -1) {
                break;
            } else {
                System.out.print(" x ");
            }
        }
        System.out.print("\n hasil angka yang angka kali = "+ Total);
        return Total;
    }
    @Override
    double pembagian (int n){
        double[] inputan = new double[n];
        for (int i = 0;i<inputan.length;i++){
            System.out.print("Masukkan angka ke "+awal++ +" : ");inputan[i]=ip.nextDouble();
            if(i == 0){
                Total = inputan[0];
            }else
            {Total /= inputan[i];}
        }
        System.out.println("Angka yang anda bagi ");
        for(int i = 0;i< n;i++){
            System.out.print(inputan[i]);
            if (i > inputan.length -1) {
                break;
            } else {
                System.out.print(" / ");
            }
        }
        System.out.print("\n hasil angka yang anda bagi = "+ Total);
        return Total;
    
}
}
public class tugas10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);){
            while(true){
                int banyak,pilih;
                kalkulator kal = new kalkulator();
                operasi op = new operasi(); 
                System.out.println("  \nPilih operasi \n1.penjumlahan \n2. pengurangan \n3.perkalian \n4. Pembagian\n0. EXIT");
                System.out.println("masukkan pilhan anda"); pilih = sc.nextInt();
                if(pilih >= 1 && pilih <= 4){                    
                    switch(pilih){
                    case 1 :
                    System.out.println("berapa jumlah angka yang anda tambah? :");banyak = sc.nextInt();
                    kal.penjumlahan(banyak);
                    op.penjumlahan(banyak);
                    break ;
                    case 2 :
                    System.out.println("berapa jumlah angka yang anda kurangi? :");banyak = sc.nextInt();
                    kal.pengurangan(banyak);
                    op.pengurangan(banyak);
                    break ;
                    case 3 : 
                    System.out.println("berapa jumlah angka yang anda kalikan? :"); banyak =sc.nextInt();
                    kal.pengkalian(banyak);
                    op.pengkalian(banyak);
                    break;
                    case 4 : 
                    System.out.println("berapa jumlah angka yang anda bagi? :"); banyak = sc.nextInt();
                    kal.pembagian(banyak);
                    op.pembagian(banyak);
                    break;
                    default :
                }
            }else{
                if (pilih == 0) {
                    System.out.println("EXIT");
                    System.exit(0);
                } else {
                    System.out.println("yang anda masukkan bukan termasuk dari menu");
                    
                }
            }

            }

        }
    }
}
