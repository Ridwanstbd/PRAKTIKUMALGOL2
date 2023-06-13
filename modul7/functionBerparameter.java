import java.util.Scanner;
class menghitung{
public double lingkaran(double jari){
    double lingkaran = 3.14 * jari*jari;
    System.out.println("Luas lingkaran  : "+lingkaran);
    return lingkaran;
}
public double persegi (double panjang,double tinggi){
    double persegi = panjang * tinggi;
    System.out.println("Luas persegi  : "+persegi);
    return persegi;
}
}
public class functionBerparameter {
    public static void main(String[] args) {
        menghitung m = new menghitung();
        try(Scanner input = new Scanner(System.in);){
            System.out.println("Masukkan pilihan 1..3 : ");
            int pilihan = input.nextInt();

            switch(pilihan){
                case 1 :
                System.out.println("Menghitung Luas Lingkaran");
                System.out.print("Masukkan Jari-jari  :");
                double inputjari = input.nextDouble();
                m.lingkaran(inputjari);
                break;
                case 2 :
                System.out.println("Menghitung Persegi ");
                System.out.print("Masukkan Panjang :");
                double inputPanjang = input.nextDouble();
                System.out.print("Masukkan Tinggi :");
                double inputTinggi = input.nextDouble();
                m.persegi(inputPanjang, inputTinggi);
                break;
                case 3 :
                System.out.println("Pilihan Salah");
                break;
                default :
                System.out.println("Lihat Kembali Menu");
            }

        };
    }
}