import java.util.Scanner;

public class gaji {
    public static void main(String []args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Masukkan Total Gaji :");
            int totalGaji = input.nextInt();
            System.out.print("Masukkan Tunjangan :");
            int tunjangan = input.nextInt();
            int gajiPokok = totalGaji-tunjangan;
            if(gajiPokok <= 3000000 ){
                System.out.println("Karyawan");
            }else if(gajiPokok<=4500000){
                System.out.println("Supervisor");
            }else{
                System.out.println("Manager");
            }
        };
    }
}
