import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the length and width of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();

        // Calculate the area
        int area = length * width;

        // Print the result
        System.out.println("The area of the rectangle is: " + area);
    }
}