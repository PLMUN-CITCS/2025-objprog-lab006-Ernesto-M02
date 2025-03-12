import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        //Create a Scanner Object
        Scanner input = new Scanner(System.in);

        //Prompt for Radius
        System.out.print("Enter the radius of the circle: ");

        //Reading Radius Input
        double radius = input.nextDouble();

        //Declare a double Variable for Area and Circumference
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius; // Calculate Circumference

        //Ouput Results
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Circumference: %.2f%n", circumference);

        //Close the Scanner
        input.close();
    }
}