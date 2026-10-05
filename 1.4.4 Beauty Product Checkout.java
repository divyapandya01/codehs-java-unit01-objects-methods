public class BeautyCheckout
{
    public static void main(String[] args)
    {
        double bathSoap = 20.99;
        double lotion = 15.99;
        double chapstick = 5.99;
        double discount = 0.25;

        // Create a variable to store the total before the discount
        double total = bathSoap + lotion + chapstick;
        
        // Create a variable to store the total amount saved with the discount
        double savings = total * discount;
        
        // Create a variable to store the total with the discount applied
        double finalTotal = total - savings;
        
        System.out.println("Thanks for supporting Vivid Beauty!");
        System.out.println("Here is a summary of your purchase:\n");
        
        // Print out a summary
        System.out.println("Total before discount: $" + total);
        System.out.println("Amount saved: $" + savings);
        System.out.println("Total after discount: $" + finalTotal);
    }
}
