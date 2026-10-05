import java.util.Scanner;

public class Shapes
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double length = getLength(scanner);
        double width = getWidth(scanner);
        double radius = getRadius(scanner);

        double rectangleArea = calculateRectangleArea(length, width);
        double circleArea = calculateCircleArea(radius);

        printResults(rectangleArea, circleArea);
    }
  
    public static double getLength(Scanner scanner)
    {
        System.out.print("Enter the length: ");
        return scanner.nextDouble();
    }

    public static double getWidth(Scanner scanner)
    {
        System.out.print("Enter the width: ");
        return scanner.nextDouble();
    }

    public static double getRadius(Scanner scanner)
    {
        System.out.print("Enter the radius: ");
        return scanner.nextDouble();
    }

    public static double calculateRectangleArea(double length, double width)
    {
        return length * width;
    }

    public static double calculateCircleArea(double radius)
    {
        return Math.PI * radius * radius;
    }

    public static void printResults(double rectangleArea, double circleArea)
    {
        System.out.println("Rectangle area: " + rectangleArea);
        System.out.println("Circle area: " + circleArea);
    }
}
