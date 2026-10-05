import java.util.Scanner;

public class Intros
{
    public static void main(String[] args)
    {
        // Write your code here:
        
      Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Please enter your grade: ");
        int grade = scanner.nextInt();
        scanner.nextLine(); // Clear the scanner buffer

        System.out.print("Please enter a fun fact about yourself: ");
        String funFact = scanner.nextLine();

        printIntroduction(name, grade, funFact);  
        
    }
      
    public static void printIntroduction(String name, int grade, String fact) 
    {
        // Complete this method
        
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Fun Fact: " + fact); 
        
        
    }
}
