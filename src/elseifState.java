import java.util.Scanner;

public class elseifState {
    public static void main(String[] args) {
        String text;
        Scanner scanner = new Scanner(System.in);
        System.out.println("text choice");
        System.out.println("1. What's up");
        System.out.println("2. Hey why are you here?");
        System.out.println("3. nothing");
        System.out.println("4. FCK YOU!!");
        System.out.println("text you choice?");
        text = scanner.nextLine();
        if (text.equals("1")){
            System.out.println("im Fine Thanks!");
        } else if (text.equals("2")) {
            System.out.println("It's My Code lol!");
        } else if (text.equals("3")){
            System.out.println("okay");
        } else if (text.equals("4")) {
            System.out.println("FCK YOU TOO!!");
        } else{
            System.out.println("What Seriously? you write wrong number lol noob");
        }
    }
}
