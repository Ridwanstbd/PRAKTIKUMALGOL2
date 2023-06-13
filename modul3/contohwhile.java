import java.util.Scanner;
public class contohwhile {
    public static void main(String Arg[]) {
        try(Scanner input = new Scanner(System.in);){
            int n=0 , total =0, bil=9;

            while(bil!=0){
                n++;
                System.out.print("Input bilangan ke-"+n+" : ");
                bil =input.nextInt();
                total += bil;
            }
            System.out.print("Total jumlah "+(n-1)+" bilangan: ");
            System.out.println(total);

        };
    }
}
