import java.util.Scanner;
public class pengurangan {
    public static void main(String[]args) {
        
        int a,b,c;
        try(Scanner input = new Scanner (System.in);){
        System.out.print("input a = "); a = input.nextInt();
        System.out.print("input b = "); b = input.nextInt();
        c = a-b;
        System.out.print("a-b = "+c);
        };
    }
}
