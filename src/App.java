
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the FIle Path: ");
        String path = input.nextLine();
        Storage storage = new Storage();

        storage.loadItemsFromFile(path);
        storage.findByCode("4");
        storage.printItems();

    }

    public static void game() {
        Scanner input = new Scanner(System.in);
        System.out.println("*===================== Guess Game =====================*");
        System.err.println("Rules Are: \n - You have 3 Attempts - Guess number between 0 - 30");
        System.out.println("===================================================================");
        System.out.println("Enter Your Name: ");
        String userName = input.nextLine();
        System.out.println("WELCOME " + userName + " Good luck!");
        // Game logic Start Here

        int attempts = 0;
        int randomNumber = generateRandomNumber();
        System.out.println("The random number  - " + randomNumber);
        while (true) {
            System.out.print("Enter a number Please: ");
            int userInput = input.nextInt();
            attempts++;

            if (userInput == randomNumber) {
                System.out.println("Good Jop you win , The Random number = " + randomNumber);
                System.out.println("You have tried " + attempts + " Good jop " + userName + "!");
                break;
            } else {
                System.out.println("Wrong Try Again you got this");
            }
            if (attempts == 3) {
                System.out.println("Sorry You have reached 3 Attempt try Again!");
                break;
            }

        }
    }

    public static int generateRandomNumber() {
        return (int) (Math.random() * (5 - 1));
    }
}