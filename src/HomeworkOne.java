import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class HomeworkOne {

    public void run(){

        ArrayList<Integer> numbers = new ArrayList<Integer>(5);

        Scanner userInput = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Please type a number (1-100)");
            numbers.add(Integer.parseInt(userInput.nextLine()));
        }

        System.out.println(numbers.toString());

        // Finding the sum of the items in array list "numbers"
        int sum = 0; 
        for(int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        } System.out.println("The sum of these numbers is: " + sum + ".");

        // Finding the product of the items in array list "numbers"
        int product = 1; 
        for(int i = 0; i < numbers.size(); i++) {
            product *= numbers.get(i);
        } System.out.println("The product of these numbers is: " + product + ".");

        // Using Collections to find the largest item in array list "numbers"
        Object numbersMax = Collections.max(numbers);
        System.out.println("The largest of these numbers is: " + numbersMax + ".");

        // Using Collections to find the smallest item in array list "numbers"
        Object numbersMin = Collections.min(numbers);
        System.out.println("The smallest of these numbers is: " + numbersMin + ".");

}
}


        // System.out.println("Please type a number (1-100)");
        // numbers.add(Integer.parseInt(userInput.nextLine()));
        
        // System.out.println("Please type a number (1-100)");
        // numbers.add(Integer.parseInt(userInput.nextLine()));
        
        // System.out.println("Please type a number (1-100)");
        // numbers.add(Integer.parseInt(userInput.nextLine()));
        
        // System.out.println("Please type a number (1-100)");
        // numbers.add(Integer.parseInt(userInput.nextLine()));
        
        // System.out.println("Please type a number (1-100)");
        // numbers.add(Integer.parseInt(userInput.nextLine()));