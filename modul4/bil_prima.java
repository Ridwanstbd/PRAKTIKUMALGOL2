import java.util.Scanner;

public class bil_prima {
    public static void main(String[]Args) {
        try(Scanner input = new Scanner(System.in)){
            int bil ,cek=0;
            System.out.println("Masukkan sebuah bilangan :");
            bil = input.nextInt();
            for(int i =2;i<=bil;i++){
                if(bil%i==0){
                    cek++;
                }
            }
            if(cek==1){
                System.out.println(bil+" adalah bilangan PRIMA");
            }else{
                System.out.println(bil+" adalah BUKAN bilangan PRIMA");
            }
        };

    }
}