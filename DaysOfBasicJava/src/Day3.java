import java.util.Scanner;

public class Day3 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Plz enter an integer : ");
	int integer = scanner.nextInt();
	System.out.println("Y'r integer: "+ integer);
	
	System.out.println("Plz enter a float : ");
	double floatt = scanner.nextDouble();
	System.out.println("Y'r integer: "+ floatt);
	
	scanner.nextLine(); // Consume the newline character left by nextDouble()
    
    System.out.println("Enter a string : ");
    String stringValue = scanner.nextLine();
    System.out.println("You entered a string: " + stringValue);
	
	scanner.close();
}
}
