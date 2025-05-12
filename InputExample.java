import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // Using Scanner to capture input
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();  // Reads your input (name)

            // Debugging: Output what was captured
            System.out.println("You entered: " + name);  // To see if the name was captured correctly

            // Print the final greeting with the name
            System.out.println("Hello dear," + name +"!");
        }  // Automatically closes the Scanner
    }
}


