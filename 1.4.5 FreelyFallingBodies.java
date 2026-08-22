public class FallingBodies
{
    public static void main(String[] args)
    {
        // Start here!
        final double gravity = 9.8;
        double time = 23;
        // other option for power: Math.pow(time, 2)
        double height = 0.5 * gravity * time * time;
        double velocity = gravity * time;
        
        System.out.print("The height of the cliff is ");
        System.out.print(height);
        System.out.println(" m. ");
        
        System.out.print("The final velocity of the ball is ");
        System.out.print(velocity);
        System.out.println(" m. ");
    }
}
