import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
         String text;
         Scanner scan = new Scanner(System.in);
         do{
            text = scan.nextLine();
         }while (text.equals("loop"));
        System.out.println("end looping");
    }
}
