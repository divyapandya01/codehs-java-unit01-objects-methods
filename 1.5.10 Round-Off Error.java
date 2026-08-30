public class RoundOff
{
    public static void main(String[] args)
    {
        // some (most) decimal numbers don't convert nicely to base 2
        // at some point the computer rounds, causing imprecision
        double solariPerDollar = 0.034567;
        // whole numbers in base convert basely convert cleanly to whole numbers in binary
        int numDollars = 100000;
        // the binary version (with the rounding error) is used in a calculation
        // so the calculation has a small error
        double numSolari = numDollars * solariPerDollar;
        System.out.println(numSolari);
        
    }
}
