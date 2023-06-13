import java.util.Scanner;

public class hargaNPM {
    public static void main(String args[]) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Harga Barang = ");
            int hargaBarang = input.nextInt();
            System.out.print("Jumlah Beli = ");
            int jumlahBeli = input.nextInt();

            int jumlahHarga = hargaBarang * jumlahBeli;
            System.out.println("Jumlah Harga ="+jumlahHarga);

            double diskon = (0.005*jumlahHarga);
            System.out.println("Diskon 5%  ="+diskon);
            double totalHarga = jumlahHarga-diskon;
            System.out.println("Total Harga ="+totalHarga);
        };
        
    }
}
