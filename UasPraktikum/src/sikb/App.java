package sikb;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
            Scanner input = new Scanner(System.in);
            int pilih;
            System.out.println("Sistem Informasi Kebun Binatang Surabaya Zoo \n Silakan Pilih klasifikasi :");
            System.out.println("1. Mamalia \n2. Aves \n3. Pisces \n4. Reptil \n0. Keluar");
            System.out.println("Pilihan Anda : ");
            pilih = input.nextInt();
            if (pilih >= 1 && pilih <=4) {
                switch (pilih) {
                    case 1:
                        Klasifikasi.mamalia();
                        break;
                    case 2:
                        Klasifikasi.aves();
                        break;
                    case 3:
                        Klasifikasi.pisces();
                        break;
                    case 4:
                        Klasifikasi.reptil();
                        break;
                
                    default:
                        System.out.println("bukan termasuk dari menu!!");
                        break;
                }
            } else {
                if (pilih == 0) {
                    System.out.println("Selamat Jalan.. Hati-hati");
                    System.exit(0);                        
                } else {
                    System.out.println("Mohon Diperhatikan Lagi ya....");
                }
            }
        input.close();
        
    }
}
