public class Houses
{
    public static void main(String[] args)
    {
        // First house: roof, 2 levels, sidewalk
        buildRoof();
        buildLevel();
        buildLevel();
        buildSidewalk();

        // Blank line between houses
        System.out.println();

        // Second house: roof, 4 levels, sidewalk
        buildRoof();
        buildLevel();
        buildLevel();
        buildLevel();
        buildLevel();
        buildSidewalk();
    }

    public static void buildRoof() 
    {
        System.out.println("   +   ");
        System.out.println("  +++  ");
        System.out.println(" +++++ ");
        System.out.println("+++++++");
    }

    public static void buildLevel() 
    {
        System.out.println("|     |");
        System.out.println("|  #  |");
        System.out.println("|     |");
        System.out.println("+++++++");
    }

    public static void buildSidewalk() 
    {
        System.out.println("   =   ");
        System.out.println("   =   ");
        System.out.println("====");
    }
}
