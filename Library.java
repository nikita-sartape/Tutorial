import java.util.Scanner;

public class Libraryf{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of days the book is late: ");
        int daysLate = input.nextInt();
        
        if (daysLate > 30) {
            System.out.println("Your membership is cancelled.");
        } else if (daysLate > 10) {
            System.out.println("Your fine is 5 rupees.");
        } else if (daysLate > 5) {
            System.out.println("Your fine is 1 rupee.");
        } else if (daysLate > 0) {
            System.out.println("Your fine is 50 paise.");
        } else {
            System.out.println("Thank you for returning the book on time.");
        }
        
      
    }
}