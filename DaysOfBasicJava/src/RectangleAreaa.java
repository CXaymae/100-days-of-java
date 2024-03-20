import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the length and width of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate the area
        double area = length * width;

        // Print the result with two decimal points
        System.out.printf("The area of the rectangle is: %.2f", area);
    }
}