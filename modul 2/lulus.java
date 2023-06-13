import java.util.Scanner;

public class lulus {
    public static void main(String []args) {
        try(Scanner input = new Scanner(System.in);){
            System.out.print("Masukkan nilai anda : ");
            int nilai = input.nextInt();
            if (nilai <50){
                System.out.println(" Anda tidak LULUS");
            }else {
                System.out.println("Anda LULUS");
            }
        };
    }
}
