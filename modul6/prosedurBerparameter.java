import java.util.Scanner;
class menghitung{
    public void segitiga(double alas, double tinggi) {
        double luas =0.5 * alas * tinggi;
        System.out.println("Luas Segitiga       : "+ luas);
    }
    public void lingkaran( double jari) {
        double phi = 3.14;
        double luas2 = phi * jari*jari;
        System.out.println("Luas Lingkaran     : "+ luas2);
    }
}

public class prosedurBerparameter {
    public static void main(String []args) {
        menghitung M = new menghitung();
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
                M.segitiga(alas, tinggi);
                break;
                case 2:
                System.out.println("Masukan Jari jari : ");
                double jari =input.nextDouble();
                M.lingkaran(jari);
                break;
                case 3:
                System.out.println("Pilihan Salah");
                break;
                default :
                System.out.println("Baca Lagi Menu nya");
            }

        }
        
    }
}