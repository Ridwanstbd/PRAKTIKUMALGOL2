import java.util.Scanner;
// NIM 2205101005
public class ganjil {f
    public static void main(String []Args) {
        try(Scanner input =new Scanner(System.in)){
            char huruf;
            System.out.print("Masukkan Angka-1 [0..9] : ");
            int kode1 = input.nextInt();
            System.out.print("Masukkan Angka-2 [0..9] : ");
            int kode2 = input.nextInt();
            System.out.print("Masukkan Angka-3 [0..9] : ");
            int kode3 = input.nextInt();
            
            System.out.print("Masukkan Huruf [A..B] : ");
            huruf = input.next().charAt(0);
            switch(huruf){
                case 'A' :System.out.println("<A> = Huruf");
                break;
                case 'B' :System.out.println("<B> = Huruf");
                break;
                default: System.out.println("yang anda masukan bukan termasuk Aturan");
            }
            if(kode1<10&&kode2<10&&kode3<10){
                System.out.print(kode1+""+kode2+""+kode3+" = KODE DARURAT");
            }
        };
    }
}
