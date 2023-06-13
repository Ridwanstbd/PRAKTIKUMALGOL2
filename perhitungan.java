import java.util.Scanner;
// input Java angka Start
public class perhitungan {
    public static void main(String[]args){
        int a,b,c;
        try(Scanner input = new Scanner(System.in);){
        System.out.print("Input a =");
        a = input.nextInt();
        System.out.print("Input b =");
        b = input.nextInt();
        c=a+b;
        System.out.print("a+b="+c);
        };
    }
}
// input Java angka End

