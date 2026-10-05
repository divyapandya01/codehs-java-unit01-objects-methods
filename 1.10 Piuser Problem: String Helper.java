public class StringRunner
{
    public static void main(String[] args)
    {
        String myString = "Water Bender";
        String myOtherString = "Fire Bender";
        String first = StringHelper.getFirst(myString, 5);
        System.out.println("First letters: " + first);
        String doubled = StringHelper.getDoubled(myString);
        System.out.println("Doubled string: " + doubled);
        int vowels = StringHelper.getNumVowels(myString);
        System.out.println("Number of vowels: " + vowels);
        String matchingLetters = 
            StringHelper.lettersMatching(myString, myOtherString);
        System.out.println("Here's the letters that match");
        System.out.println(matchingLetters);
        char mostCommon = StringHelper.getMostCommonChar(myString);
        System.out.println("Most common character: " + mostCommon);
    }
}
