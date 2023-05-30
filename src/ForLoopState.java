import java.util.Scanner;

public class ForLoopState {
    public static void main(String[] args) {
        int number,incre,out;

        Scanner scan = new Scanner(System.in);
        System.out.println("Input finish increment number ");
        number = scan.nextInt();
        System.out.println("Input increment jumping");
        incre = scan.nextInt();

        for (int i = 0; i<=number; i = i + incre){
           System.out.println(i);
        }
    }
}
