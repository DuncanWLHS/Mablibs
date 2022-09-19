import java.util.Scanner;
/**
 * Write a description of class Madlibs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Madlibs
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username: ");
        String userName = input.nextLine();
        System.out.println("Enter what Month it is (number): ");
        int month = input.nextInt();
        System.out.println("Enter what Day it is (number) ");
        int day = input.nextInt();
        System.out.println("Enter what Year it is (number) ");
        int year = input.nextInt();
        input.nextLine();
        System.out.println("Enter Adjective: ");
        String firstAdjective = input.nextLine();
        System.out.println("Enter 2nd Adjective: ");
        String secondAdjective = input.nextLine();
        System.out.println("Enter Type of Bird: ");
        String birdType = input.nextLine();
        System.out.println("Enter a Room in your house: ");
        String roomHouse = input.nextLine();
        System.out.println("Enter a Verb (past tense) ");
        String firstVerb = input.nextLine();
        System.out.println("Enter a 2nd Verb ");
        String secondVerb = input.nextLine();
        System.out.println("Enter a Relative's name: ");
        String relativeName = input.nextLine();
        System.out.println("Enter a Noun: ");
        String firstNoun = input.nextLine();
        System.out.println("Enter a liquid: ");
        String liquid = input.nextLine();
        System.out.println("Enter 3rd Verb (-ing ending): ");
        String thirdVerb = input.nextLine();
        System.out.println("Enter a Part in the body (pural): ");
        String bodyPart = input.nextLine();
        System.out.println("Enter a Pural noun: ");
        String secondNoun = input.nextLine();
        System.out.println("Enter 4th Verb (-ing ending): ");
        String fourthVerb = input.nextLine();
        System.out.println("Enter Last noun ");
        String thirdNoun = input.nextLine();
                
        System.out.println(userName + " " + month + "/" + day + "/" + year);
        System.out.println("It was a " + firstAdjective + " cold November day.");
        System.out.println("I woke up to the " + secondAdjective + " smell of " + birdType + " roasting in the " + roomHouse + " downstairs.");
        System.out.println("I " + firstVerb + " down the stairs to see if I could help " + secondVerb + " the dinner.");
        System.out.println("My mom said, See if " + relativeName + " needs a fresh " + firstNoun + ".");
        System.out.println("So I carried a tray of glasses full of " + liquid + " into the " + thirdVerb + " room.");
        System.out.println("When I got there, I couldn't believe my " + bodyPart + "!");
        System.out.println("There were " + secondNoun + " " + fourthVerb + " on the " + thirdNoun + "!");
    }
}