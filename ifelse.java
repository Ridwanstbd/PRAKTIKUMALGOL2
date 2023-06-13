import java.util.Scanner;

public class ifelse {
    public static void main(String[]args) {
        try(Scanner input = new Scanner (System.in)){
            int a,b;
            System.out.print("Input a:"); a = input.nextInt();
            System.out.print("input b:"); b = input.nextInt();
            if(a>b){
                System.out.println("A lebih besar dari B");
            }else{
                System.out.println("B lebih besar dari A");
            }
        };
    }
}
