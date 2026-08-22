import java.util.Scanner;

public class IceCreamShop
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double scoopPrice = 2.50;

        System.out.println("What flavor ice cream would you like?");
        String flavor = input.nextLine();

        System.out.println("How many scoops would you like?");
        int scoops = input.nextInt();

        double totalPrice = scoopPrice * scoops;

        System.out.println("Order Summary:");
        System.out.println("Flavor: " + flavor);
        System.out.println("Number of Scoops: " + scoops);
        System.out.println("Total: " + totalPrice);
    }
}
