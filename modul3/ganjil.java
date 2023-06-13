import java.util.Scanner;

public class ganjil{
    public static void main(String Args[]) {
        try(Scanner input =new Scanner(System.in);){
            System.out.print("Inputkan Batas jumlah bilangan :");
            int batas = input.nextInt();

            System.out.print("Deretr bilangan Ganjil adalah: ");
            for (int angka = 1;angka <=batas ;angka=angka+2){
                System.out.print(angka +" ");
            }

        };
    }
}