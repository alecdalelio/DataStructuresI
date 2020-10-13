import java.util.Scanner;
import java.util.HashMap;

public class HomeworkTwo {

    public void hashMap(){

        Scanner customerInput = new Scanner(System.in);

        HashMap<String, String> car = new HashMap<String, String>();
        car.put("Model S", "Tesla");
        car.put("Outback", "Subaru");
        car.put("Stratus", "Dodge");
        car.put("GT", "McLaren");

        System.out.println(car);

        System.out.println("Welcome! What make of car are you looking for?");
        
        String desiredCar = customerInput.nextLine();
        switch (desiredCar) {
            case "Tesla":
                System.out.println("We have a Tesla Model S.");
                break;
        
            case "Subaru":
                System.out.println("We have a Subaru Outback.");
                break;

            case "Dodge":
                System.out.println("We have a Dodge Stratus");
                break;

            case "McLaren":
                System.out.println("We have a McLaren GT");
                break;

            default:
                System.out.println("Sorry! We don't have any cars of that make.");
                break;
        }

    }
}