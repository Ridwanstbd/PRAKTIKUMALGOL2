import java.util.Scanner;
// input java Start
public class biodata2 {
    public static void main (String args[])
    {
        try(Scanner input = new Scanner(System.in);){
        System.out.print("Nama = ");
        String nama =input.next();
        System.out.print("Alamat = ");
        String alamat =input.next();
        System.out.print("Tgl Lahir = ");
        String tgl =input.next();
        
        System.out.println("Nama = "+nama);
        System.out.println("Alamat = "+alamat);
        System.out.println("Tgl Lahir = "+tgl);
        };
    }    
}
// input java End
