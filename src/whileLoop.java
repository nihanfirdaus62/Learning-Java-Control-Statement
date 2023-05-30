import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        int count, first,num,dec;
         dec =  0;
        first = 0;
        String an;
        Scanner scan = new Scanner(System.in);
        System.out.println("please input total number");
        count = scan.nextInt();
        System.out.println("Decrement/Increment number");
        num = scan.nextInt();
        System.out.println("Increment or decrement?");
        System.out.println("i. Increment");
        System.out.println("d. Decrement");
        an = scan.next().toLowerCase();
        if (an.equals("i")) {
            while (first < count){
                first++;
                dec = dec + num;
                System.out.println(dec);
            }
        } else if (an.equals("d")){
            while (first < count){
                first++;
               dec = dec - num;
                System.out.println(dec);
            }
        }

    }
}
