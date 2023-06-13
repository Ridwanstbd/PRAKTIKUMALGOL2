import java.util.Scanner;

public class ifnilai2 {
    public static void main(String[]args) {
        try(Scanner input = new Scanner (System.in)){
            int nilai;
            System.out.print("Input nilai :");nilai = input.nextInt();
            if(nilai>50){
                System.out.println("Selamat Anda Lulus");
            }else{
                System.out.println("anda Gagal");
            }
        };
    }
}
