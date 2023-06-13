import java.util.Scanner;

public class rata_bil {
    public static void main(String []args) {
        try(Scanner input = new Scanner(System.in)){
            int indexLoop =1;
            double total = 0;            
            System.out.print("Masukkan Banyaknya bilangan : ");
            int banyakAngka = input.nextInt();
            int[] nilaiBil = new int[banyakAngka];
            for (int i = 0;i<banyakAngka;i++){
                System.out.print("Masukkan bilangan ke- "+indexLoop++ +" : ");
                nilaiBil[i] = input.nextInt();
                total += nilaiBil[i];
            }
            System.out.print("Nilai Rata-rata dari Bilangan : ");
            for(int i = 0; i< nilaiBil.length; i++){
                System.out.print(nilaiBil[i]);
                if( i >= nilaiBil.length -1){
                    break;
                }else{
                    System.out.print(" + ");
                }
            }
            System.out.print(" = "+total+" adalah "+ (total /= banyakAngka ));
        };
        
    }
}