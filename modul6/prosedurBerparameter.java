import java.util.Scanner;

public class prosedurBerparameter {
    public static void segitiga(double alas, double tinggi) {
        double luas =0.5 * alas * tinggi;
        System.out.println("Luas Segitiga       : "+ luas);
    }
    public static void lingkaran( double jari) {
        double phi = 3.14;
        double luas2 = phi * jari*jari;
        System.out.println("Luas Lingkaran     : "+ luas2);
    }
    public static void main(String []args) {
        try (Scanner input = new Scanner(System.in);){
            System.out.print("MENU PILIHAN \n 1. Luas Segitiga \n 2. Luas Lingkaran \n 3. NULL \n");
            System.out.print("Masukkan pilihan 1..3 : ");
            int pilihanUser = input.nextInt();
            switch (pilihanUser){
                case 1:
                System.out.println("Masukkan Alas : ");
                double alas = input.nextDouble();
                System.out.println("Masukkan Tinggi : ");
                double tinggi = input.nextDouble();
                segitiga(alas, tinggi);
                break;
                case 2:
                System.out.println("Masukan Jari jari : ");
                double jari2 =input.nextDouble();
                lingkaran(jari2);
                break;
                case 3:
                System.out.println("Pilihan Salah");
                break;
                default :
                System.out.println("Baca Lagi Menu nya");
            }

        };
        
    }
}