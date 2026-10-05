public class CalculatorRunner 
{
    public static void main(String[] args) 
    {
        // Code your calculations and print statements here:
        double slope = Calculator.slope(1, 1, 5, 10);
        System.out.println("Slope: " + slope);

        double distance = Calculator.distance(2, 3, 6, 7);
        System.out.println("Distance: " + distance);

        String roots = Calculator.quadRoots(1, 2, -8);
        System.out.println("Roots: " + roots);
    }
}
