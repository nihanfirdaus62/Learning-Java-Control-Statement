import java.util.Scanner;

public class NestedIfState {
    public static void main(String[] args) {

        String country,place,location;
        Scanner scan = new Scanner(System.in);
        System.out.println("Write Your Country");
        country = scan.nextLine();
        System.out.println("Write Location your place");
        place = scan.nextLine();
        location = country +","+place;

        if (location.startsWith("indonesia")){
            if (location.contains("Jakarta")){
                System.out.println("Your Place in jakarta");
            } else if (location.contains("Sukabumi")){
                System.out.println("your Place in Sukabumi");
            } else {
                System.out.println(location.split(",")[1]);
            }
        } else {
            System.out.println("Your not livingg in Indonesia");
        }
    }
}
