import java.util.Scanner;

public class namaAngka {
    public static void main(String []args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("masukkan angka 1-5 :");
            int angka = input.nextInt();
            switch (angka){
                case 1 :
                System.out.println("Angka yang anda masukkan adalah : SATU");
                break;
                case 2 :
                System.out.println("Angka yang anda masukkan adalah : DUA");
                break;
                case 3 :
                System.out.println("Angka yang anda masukkan adalah : TIGA");
                break;
                case 4 :
                System.out.println("Angka yang anda masukkan adalah : EMPAT");
                break;
                case 5 :
                System.out.println("Angka yang anda masukkan adalah : LIMA");
                break;
            }
        };
    }
}
