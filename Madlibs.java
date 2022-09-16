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
        System.out.println("Enter Date in format of mm/dd/yy: ");
        String date = input.nextLine();
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
        System.out.println("Enter a Relative's name: ");
        String relativeName = input.nextLine();
        System.out.println("Enter a Noun: ");
        String firstNoun = input.nextLine();
        System.out.println("Enter a liquid: ");
        String liquid = input.nextLine();
        System.out.println("Enter 2nd Verb (-ing ending): ");
        String secondVerb = input.nextLine();
        System.out.println("Enter a Part in the body (pural): ");
        String bodyPart = input.nextLine();
        System.out.println("Enter a Pural noun: ");
        String secondNoun = input.nextLine();
        System.out.println("Enter 3rd Verb (-ing ending): ");
        String thirdVerb = input.nextLine();
        System.out.println("Enter Last noun ");
        String thirdNoun = input.nextLine();
    }
}