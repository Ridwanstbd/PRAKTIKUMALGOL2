import java.util.Scanner;
class bangun {
    double luasTidakDiarsir,luasPersegiPanjang,luasLingkaran;
    double luasLingkaran(double jari){
        return 0;
    }
    double luasPersegiPanjang(double p, double l){
        return 0;
    }
}
class luas extends bangun {
    @Override
    double luasPersegiPanjang (double p,double l){
        this.luasPersegiPanjang = p * l ;
        System.out.println("Luas Persegi Panjang = "+luasPersegiPanjang);
        return luasPersegiPanjang;
    }
    @Override
    double luasLingkaran(double jari){
        double phi = 3.14;
        this.luasLingkaran = phi *jari*jari;
        System.out.println("Luas Lingkaran = "+luasLingkaran);
        return luasLingkaran;
    }
    
    double tidakDiarsir(){
        this.luasTidakDiarsir = this.luasPersegiPanjang - this.luasLingkaran;
        System.out.println("Luas Tidak di Arsir = "+luasTidakDiarsir);
        return luasTidakDiarsir;
    }
    
}

public class modul8 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in);){
            luas L = new luas();
            System.out.println("Program menghitung Luas Tidak diarsir");
            System.out.println("Menghitung Luas Persegi");
            System.out.println("Masukkan panjang sisi : ");double panjang = input.nextDouble();
            System.out.println("Masukkan lebar sisi : ");double lebar = input.nextDouble();
            L.luasPersegiPanjang(panjang,lebar);

            System.out.println("Menghitung Luas Lingkaran");
            System.out.println("Masukkan Jari - Jari : ");double jari2 = input.nextDouble();
            L.luasLingkaran(jari2);
            L.tidakDiarsir();
        };
    }
}