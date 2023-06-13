import java.util.Scanner;

public class undian{
    public static void main(String []args) {
        try(Scanner input = new Scanner(System.in);){
            System.out.print("Masukkan nomor keberuntungan anda (1-3):");
            int bil = input.nextInt();
            switch(bil){
                case 1:
                System.out.println("1. Anda Belum Beruntung");
                break;
                case 2:
                System.out.println("2. Anda mendapat hadiah Rumah");
                break;
                case 3:
                System.out.println("3. Anda mendapat hadiah Uang 1 juta");
                break;
            }

        };
    }
}