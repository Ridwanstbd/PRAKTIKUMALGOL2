import java.util.Scanner;

public class utsPraktikum {
    public static void main(String [] Args) {
        System.out.println("-----------------------------------------");
        System.out.println("                MENU UTAMA               ");
        System.out.println("-----------------------------------------");
        System.out.println("         1. Keliling Lingkaran           ");
        System.out.println("         2. Keliling Persegi             ");
        System.out.println("         3. Keliling Segitiga            ");
        System.out.println("         4. Selesai                      ");
        System.out.println("-----------------------------------------");
        System.out.println("   Masukkan Pilihan Anda [1..4] = ....   ");
        System.out.println("-----------------------------------------");
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Jika Pilih = ");
            int pilih = input.nextInt();
            {
            switch (pilih) {
                case 1:
                    System.out.println("Menghitung keliling lingkaran");
                    double phi = 3.14;
                    System.out.print("Masukkan diameter : ");
                    Double d = input.nextDouble();
                    Double k = phi * d;
                    System.out.println("Hasil Keliling dari lingkaran berdiameter "+d+" = "+k);
                    break;
                case 2:
                    System.out.println("Menghitung keliling persegi");
                    System.out.print("Masukkan panjang sisi : ");
                    Double s = input.nextDouble();
                    Double k2 = 4*s;
                    System.out.println("Hasil keliling dari persegi dengan sisi "+s+" = "+k2);
                    break;
                case 3:
                    System.out.println("Menghitung keliling Segitiga");
                    System.out.print("Masukkan sisi pertama : ");
                    Double sisi1 = input.nextDouble();
                    System.out.print("Masukkan sisi kedua : ");
                    double sisi2 = input.nextDouble();
                    System.out.print("Masukkan sisi ketiga : ");
                    double sisi3 = input.nextDouble();
                    double k3 = sisi1+sisi2+sisi3;
                    System.out.println("Hasil keliling dari segitiga = "+k3);
                    break;
                case 4:
                    System.out.println("Selesai");
                    break;
                default:
                    System.out.println("Jika pilih selain [1..4] = maaf anda salah pilih, Ulang !!");
                    break;
            }
            System.out.print(" ");
            }
        }
    }
}
