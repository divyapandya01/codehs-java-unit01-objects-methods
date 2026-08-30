import java.util.Scanner;

public class PhotoWallPlanner
{
    public static void main(String[] args)
    {
        Scanner userIn = new Scanner(System.in);
        
        int wallHeight = 96;
        
        System.out.print("What is the height of each picture? ");
        int pictureHeight = userIn.nextInt();
        
        double totalRows = (double)wallHeight / pictureHeight;
        int wholenumberRows = wallHeight / pictureHeight;
        int leftover = wallHeight % pictureHeight;
        
        System.out.print("Total rows (including partial rows): ");
        System.out.println(totalRows);
        
        System.out.println("Complete rows: " + wholenumberRows);
        
        System.out.println("inches leftover: " + leftover);
        
    }
}
