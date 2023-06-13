package modul9;

import java.util.Scanner;

class gedung{
    private double harga;
    private double hari;
    private double bayar;
    public void sewaGedung(double price, double durasi){
        this.harga = price;
        this.hari = durasi;
    }
    public double bayar() {
        bayar = harga*hari;
        return bayar;
    }

}
public class sewa {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in);){
            gedung gd = new gedung();
            System.out.println("Penyewaan gedung");
            System.out.print("Tentukan harga sewa gedung /hari : Rp.");
            double hargaGedung = input.nextDouble();
            System.out.print("Sewa Berapa hari: ");
            double hari = input.nextDouble();
            gd.sewaGedung(hargaGedung, hari);

            System.out.println("Total biaya penyewaan Gedung selama "+hari+" adalah Rp. "+ gd.bayar());
        }

    }

    
}