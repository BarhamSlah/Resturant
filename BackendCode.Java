import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {

        Scanner resturant = new Scanner(System.in);

        System.out.println("Welcome to Syamand Resturant");
        System.out.println("This is our foods");
        System.out.println("(Pizza - Burger - Sandwich - Finger - Hotdog - Fried_Chicken - Tacos)");

        String Pizza = "6000";
        String Burger = "4000";
        String Sandwich = "3500";
        String Finger = "2000";
        String Hotdog = "3500";
        String Fried_Chicken = "7000";
        String Tacos = "4000";
        double finalTotal = 0;
        double total = 0;

        System.out.print("How many type of food ");
        int typeOfFood = resturant.nextInt();
        resturant.nextLine();

        for (int i = 1; i <= typeOfFood; i++) {

            System.out.print("What kinda of food do you order ");
            String nameOfFood = resturant.nextLine();

            System.out.print("How many ? ");
            int numberOfFood = resturant.nextInt();
            resturant.nextLine();

            if(nameOfFood.equalsIgnoreCase("Pizza")){
                System.out.println(Pizza + " for each Pizza");
                 total = numberOfFood * 6000 ;

            } else if (nameOfFood.equalsIgnoreCase("Burger")) {
                System.out.println(Burger + " for each Burger ");
                 total = numberOfFood * 6000 ;
                System.out.println(total);

            } else if (nameOfFood.equalsIgnoreCase("Sandwich")) {
                System.out.println(Sandwich + " for each Sandwich");
                 total = numberOfFood * 3500 ;

            } else if (nameOfFood.equalsIgnoreCase("Finger")) {
                System.out.println(Finger + " for each Finger");
                 total = numberOfFood * 2000 ;

            } else if (nameOfFood.equalsIgnoreCase("Hotdog")) {
                System.out.println(Hotdog + " for each Hotdog");
                total = numberOfFood * 3500 ;

            } else if (nameOfFood.equalsIgnoreCase("Fried_Chicken")) {
                System.out.println(Fried_Chicken + " for each Fried_Chicken ");
                 total = numberOfFood * 7000 ;

            } else if (nameOfFood.equalsIgnoreCase("Tacos")) {
                System.out.println(Tacos + " for each Tacos ");
                 total = numberOfFood * 4000 ;

            } else {
                System.out.println("This food is not available we had written our list of food at top");
            }
            System.out.println(total);
            finalTotal += total;

        }

        System.out.println("Final Total = " + finalTotal);

        resturant.close();
    }

}
