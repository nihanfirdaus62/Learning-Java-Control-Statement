import java.util.Scanner;

public class elseState {
    public static void main(String[] args) {
        int price,total,disc;
        Scanner scanner =new Scanner(System.in);
        System.out.println("How much Money will you pay?");
        price = scanner.nextInt();
        if(price >= 300 ){
            System.out.println("Congrats You get discount 10%");
            disc = price * 10/100;
            total = price - disc;
            System.out.println("you must pay : " + total);
        }else{
            System.out.println("Nah, your not get the discount pay 300 first!");
            System.out.println("you must pay : " + price);
        }

    }
}
